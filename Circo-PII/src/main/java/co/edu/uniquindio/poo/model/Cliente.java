package co.edu.uniquindio.poo.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Representa un cliente del circo.
 * Un cliente puede realizar múltiples compras de boletas.
 */
public class Cliente {

    private String nombre;
    private String cedula;
    private String direccion;
    private String telefono;
    private String correo;
    private LocalDate fechaNacimiento;
    private List<CompraBoleta> listCompraBoletas;

    /**
     * Construye un cliente con su información básica.
     * @param nombre Nombre del cliente.
     * @param cedula Cédula del cliente.
     * @param direccion Dirección del cliente.
     * @param telefono Teléfono del cliente.
     * @param correo Correo electrónico del cliente.
     * @param fechaNacimiento Fecha de nacimiento del cliente.
     */
    public Cliente(String nombre, String cedula, String direccion, String telefono,
                   String correo, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.fechaNacimiento = fechaNacimiento;
        this.listCompraBoletas = new ArrayList<>();
    }

    /**
     * Agrega una compra al historial del cliente.
     * @param compra Compra realizada por el cliente.
     */
    public void agregarCompra(CompraBoleta compra) {
        listCompraBoletas.add(compra);
    }

    /**
     * Lista todas las compras realizadas por el cliente.
     * @return Cadena con el detalle de las compras.
     */
    public String listarCompras() {
        String mensaje = "";

        if (listCompraBoletas.isEmpty()) {
            mensaje = "El cliente no tiene compras registradas.";
        } else {
            for (CompraBoleta compra : listCompraBoletas) {
                mensaje += "Compra: " + compra.getCodigo()
                        + " | Fecha: " + compra.getFechaCompra()
                        + " | Función: " + compra.getFunciones().getNombre()
                        + " | Tipo boleta: " + compra.getTipoBoleta()
                        + " | Cantidad: " + compra.getCantidadBoletas()
                        + " | Total: $" + compra.getCostoTotal() + "\n";
            }
        }

        return mensaje;
    }

    /**
     * Calcula el valor total gastado por el cliente en todas sus compras.
     * @return Total gastado por el cliente.
     */
    public double calcularTotalGastado() {
        double total = 0;
        for (CompraBoleta compra : listCompraBoletas) {
            total += compra.getCostoTotal();
        }
        return total;
    }

    /**
     * Retorna la información general del cliente.
     * @return Cadena con la información del cliente.
     */
    public String mostrarInformacionCliente() {
        return "Nombre: " + nombre
                + "\nCédula: " + cedula
                + "\nDirección: " + direccion
                + "\nTeléfono: " + telefono
                + "\nCorreo: " + correo
                + "\nFecha de nacimiento: " + fechaNacimiento;
    }

    /**
     * Obtiene el nombre del cliente.
     * @return Nombre del cliente.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene la cédula del cliente.
     * @return Cédula del cliente.
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * Obtiene la dirección del cliente.
     * @return Dirección del cliente.
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Obtiene el teléfono del cliente.
     * @return Teléfono del cliente.
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Obtiene el correo del cliente.
     * @return Correo del cliente.
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Obtiene la fecha de nacimiento del cliente.
     * @return Fecha de nacimiento.
     */
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Obtiene la lista de compras del cliente.
     * @return Lista de compras.
     */
    public List<CompraBoleta> getListCompraBoletas() {
        return listCompraBoletas;
    }
}