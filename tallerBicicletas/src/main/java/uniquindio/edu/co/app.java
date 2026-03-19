package uniquindio.edu.co;

import uniquindio.edu.co.model.*;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

import static javax.swing.JOptionPane.showInputDialog;

public class app {

    public static void main(String[] args) {

        // Crear una instancia del taller
        Taller taller = new Taller("Taller Yulbraynner", "2N", "12345");

        int opcion = 0;

        while (opcion != 7) {  // Cambié a opción 7 para salir

            // Menú principal
            String menu =
                    "=== MENÚ TALLER ===\n" +
                            "1. Cliente (crear / listar bicicletas)\n" +
                            "2. Mecánico (crear)\n" +
                            "3. Bicicleta (crear)\n" +
                            "4. Repuesto (crear)\n" +
                            "5. Crear Orden de Servicio\n" +
                            "6. Estado del Taller\n" +
                            "7. Salir\n\n" +
                            "Opción:";

            // Leer la opción seleccionada
            String input = showInputDialog(menu);
            if (input == null) break;

            try {
                opcion = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Debe ingresar un número.");
                continue;
            }

            switch (opcion) {

                // CRUD Cliente
                case 1: {
                    String sub = showInputDialog(
                            "=== CLIENTE ===\n" +
                                    "1. Crear\n" +
                                    "2. Listar Bicicletas\n" +
                                    "3. Volver\n\nOpción:"
                    );
                    if (sub == null) break;

                    int op = Integer.parseInt(sub);

                    if (op == 1) {
                        // Crear Cliente
                        String nombre = showInputDialog("Nombre del cliente:");
                        int tel = Integer.parseInt(showInputDialog("Teléfono del cliente:"));
                        String email = showInputDialog("Email del cliente:");
                        String cedula = showInputDialog("Cédula del cliente:");

                        String resultado = taller.crearCliente(nombre, tel, email, cedula);
                        JOptionPane.showMessageDialog(null, resultado);
                    }
                    else if (op == 2) {
                        // Listar Bicicletas de un Cliente
                        String cedula = showInputDialog("Cédula del cliente:");
                        Cliente cl = taller.obtenerCliente(cedula);
                        if (cl != null) {
                            StringBuilder bicicletas = new StringBuilder("=== Bicicletas del Cliente ===\n");
                            bicicletas.append("Cliente: ").append(cl.getNombre()).append(" | Cédula: ").append(cl.getCedula()).append("\n\n");
                            for (Bicicleta bici : cl.getListBicicletasCliente()) {
                                bicicletas.append(bici.toString()).append("\n");
                            }
                            JOptionPane.showMessageDialog(null, bicicletas.toString());
                        } else {
                            JOptionPane.showMessageDialog(null, "Cliente no encontrado.");
                        }
                    }
                    break;
                }

                // CRUD Mecánico
                case 2: {
                    // Crear Mecánico
                    String nombre = showInputDialog("Nombre del mecanico:");
                    String cedula = showInputDialog("Cédula del mecanico:");
                    String nivel = showInputDialog("Nivel del mecanico:");
                    String tel = showInputDialog("Teléfono del mecanico:");
                    String tarea = showInputDialog("Tarea del mecanico:");

                    JOptionPane.showMessageDialog(null, taller.crearMecanico(nombre, cedula, nivel, tel, tarea));
                    break;
                }

                // CRUD Bicicleta
                case 3: {
                    // Crear Bicicleta
                    String marca = showInputDialog("Marca de la bicicleta:");
                    String color = showInputDialog("Color de la bicicleta:");
                    String chasis = showInputDialog("Número de chasis de la bicicleta:");
                    String tipo = showInputDialog("Tipo de bicicleta:");
                    String cedulaCliente = showInputDialog("Cédula del cliente dueño de la bicicleta:");

                    JOptionPane.showMessageDialog(null,
                            taller.crearBicicleta(marca, color, chasis, tipo, cedulaCliente));
                    break;
                }

                // CRUD Repuesto
                case 4: {
                    // Crear Repuesto
                    String nombre = showInputDialog("Nombre repuesto:");
                    int cantidad = Integer.parseInt(showInputDialog("Cantidad:"));
                    double costo = Double.parseDouble(showInputDialog("Costo unitario:"));
                    int id = Integer.parseInt(showInputDialog("ID repuesto:"));

                    JOptionPane.showMessageDialog(null,
                            taller.crearRepuesto(nombre, cantidad, costo, id));
                    break;
                }

                // Crear Orden de Servicio
                case 5: {
                    int idOrden = Integer.parseInt(showInputDialog("ID Orden:"));
                    String desc = showInputDialog("Descripción:");
                    String estado = showInputDialog("Estado:");
                    String fecha = showInputDialog("Fecha ingreso:");
                    double manoObra = Double.parseDouble(showInputDialog("Mano de obra:"));

                    String cedulaCliente = showInputDialog("Cédula del cliente:");
                    String chasis = showInputDialog("Chasis de la bicicleta:");

                    // Listar los nombres de los mecánicos disponibles
                    StringBuilder listaMecanicos = new StringBuilder("=== MECÁNICOS ===\n");
                    for (Mecanico m : taller.getListMecanicos()) {
                        listaMecanicos.append(m.getNombre()).append("\n");
                    }

                    String nombreMecanico = showInputDialog(listaMecanicos.toString() + "\nSeleccione el nombre del mecánico:");

                    // Verificamos si el mecánico existe
                    Mecanico mecanicoSeleccionado = null;
                    for (Mecanico m : taller.getListMecanicos()) {
                        if (m.getNombre().equals(nombreMecanico)) {
                            mecanicoSeleccionado = m;
                            break;
                        }
                    }

                    if (mecanicoSeleccionado == null) {
                        JOptionPane.showMessageDialog(null, "Mecánico no encontrado.");
                        break;
                    }

                    // Pedir IDs de repuestos separados por coma: 1,2,3
                    String ids = showInputDialog("IDs de repuestos (separados por coma). Ej: 1,2,3\nSi no hay, deje vacío:");
                    List<Integer> idsRepuestos = new ArrayList<>();

                    if (ids != null && !ids.isBlank()) {
                        String[] partes = ids.split(",");
                        for (String p : partes) {
                            idsRepuestos.add(Integer.parseInt(p.trim()));
                        }
                    }

                    // Crear la orden de servicio
                    String r = taller.crearOrdenServicio(idOrden, desc, estado, fecha, manoObra,
                            cedulaCliente, chasis, mecanicoSeleccionado.getCedula(), idsRepuestos);

                    JOptionPane.showMessageDialog(null, r);
                    break;
                }

                // Listar Órdenes con Costo Total
                case 6: {
                    String lista = "=== ÓRDENES ===\n";
                    if (taller.getListOrdenes().isEmpty()) lista += "No hay órdenes.\n";
                    for (OrdenServicio o : taller.getListOrdenes()) {
                        lista += o.toString() + "\n";
                        // Mostrar el costo total de cada orden
                        lista += "Costo Total: $" + o.calcularCostoTotalOrden() + "\n\n";
                    }
                    JOptionPane.showMessageDialog(null, lista);
                    break;
                }

                // Estado del Taller
                case 7: {
                    JOptionPane.showMessageDialog(null, taller.toString());
                    break;
                }

                // Salir
                case 8:
                    JOptionPane.showMessageDialog(null, "Saliendo...");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida.");
            }
        }
    }
}