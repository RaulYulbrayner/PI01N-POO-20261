package uniquindio.edu.co;

import uniquindio.edu.co.model.*;

import java.util.ArrayList;
import java.util.List;

public class appParcialI {

    public static void main(String[] args) {

        // Crear el taller
        Taller taller = new Taller("BikeFix", "Centro Armenia", "123456");

        // Crear clientes
        taller.crearCliente("Carlos Perez", 496, "carlos@email.com", "1001");
        Cliente cliente = taller.obtenerCliente("1001");

        // Crear mecanico
        taller.crearMecanico("Juan Gomez", "2001", "Senior", "1411121", "Reparacion");
        Mecanico mecanico = taller.obtenerMecanico("2001");

        // Crear bicicleta
        taller.crearBicicleta("GW", "Roja", "CH001", "Montaña", "1001");

        // Crear repuestos
        taller.crearRepuesto("Cadena", 1, 20000, 1);
        taller.crearRepuesto("Freno", 2, 15000, 2);

        // Crear orden de servicio
        List<Integer> repuestosOrden1 = new ArrayList<>();
        repuestosOrden1.add(1);
        repuestosOrden1.add(2);

        taller.crearOrdenServicio(
                1,
                "Cambio de frenos",
                "Finalizado",
                "12/03/2026",
                30000,
                "1001",
                "CH001",
                "2001",
                repuestosOrden1
        );

        // Crear otra orden con otra fecha
        List<Integer> repuestosOrden2 = new ArrayList<>();
        repuestosOrden2.add(1);

        taller.crearOrdenServicio(
                2,
                "Cambio de cadena",
                "Finalizado",
                "10/03/2026",
                20000,
                "1001",
                "CH001",
                "2001",
                repuestosOrden2
        );

        // Punto A
        int pares = taller.contarDigitosParesMecanico(mecanico.getTelefono());
        System.out.println("Digitos pares en el telefono del mecanico: " + pares);

        // Punto B
        boolean perfecto = taller.esPerfecto(cliente.getTelefono());
        System.out.println("¿El numero 6 es perfecto?: " + perfecto);

        // Punto C
        double totalFecha = taller.acumularCostoPorFecha("12/03/2026");
        System.out.println("Costo total de ordenes en la fecha 12/03/2026: $" + totalFecha);

    }
}
