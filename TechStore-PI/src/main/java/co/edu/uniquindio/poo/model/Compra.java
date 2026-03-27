package co.edu.uniquindio.poo.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Compra {

    //Atributos
    private String codigoCompra;
    private LocalDate fecha;
    private String estado;
    private String metodoPago;

    //Relaciones
    private Cliente cliente;
    private List<Producto> productos;
    private List<Envio> envios;

    /**
     * Constructor de la clase Compra.
     * @param codigoCompra código único de la compra
     * @param metodoPago método de pago utilizado
     * @param cliente cliente que realiza la compra
     */
    public Compra(String codigoCompra, String metodoPago, Cliente cliente) {
        this.codigoCompra = codigoCompra;
        this.fecha = LocalDate.now();
        this.metodoPago = metodoPago;
        this.estado = "Pendiente";
        this.cliente = cliente;
        productos = new ArrayList<>();
        envios = new ArrayList<>();
    }

    /**
     * Agrega un producto a la compra.
     * @param producto producto a agregar
     */
    public void asignarProducto(Producto producto) {
        productos.add(producto);
    }

    /**
     * Registra un envío asociado a la compra.
     * @param envio envio a registrar
     */
    public void agregarEnvio(Envio envio) {
        envios.add(envio);
    }

    /**
     * Calcula el monto total de la compra.
     * El total se calcula sumando:
     * - el precio de todos los productos
     * - los costos de envío
     * @return monto total de la compra
     */
    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.getPrecioUnitario();
        }
        for (Envio e : envios) {
            total += e.getCostoEnvio();
        }
        return total;
    }

    /**
     * Cambia el estado de la compra.
     * @param nuevoEstado nuevo estado de la compra
     */
    public void cambiarEstado(String nuevoEstado) {
        estado = nuevoEstado;
    }

    public String getCodigoCompra() {
        return codigoCompra;
    }

    public void setCodigoCompra(String codigoCompra) {
        this.codigoCompra = codigoCompra;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public List<Envio> getEnvios() {
        return envios;
    }

    public void setEnvios(List<Envio> envios) {
        this.envios = envios;
    }
}