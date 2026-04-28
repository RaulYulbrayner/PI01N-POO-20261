package co.edu.uniquindio.poo.model;

import java.time.LocalDate;

/**
 * Representa una compra de boletas realizada por un cliente para una función.
 * Cada compra registra el tipo de boleta, la cantidad comprada y el costo total.
 */
public class CompraBoleta {

    private String codigo;
    private LocalDate fechaCompra;
    private Cliente cliente;
    private Funcion funcion;
    private TipoBoleta tipoBoleta;
    private int cantidadBoletas;
    private double costoTotal;

    /**
     * Construye una compra de boletas con sus datos principales.
     * @param codigo Código de la compra.
     * @param fechaCompra Fecha en la que se realizó la compra.
     * @param cliente Cliente que realiza la compra.
     * @param funcion Función para la cual se compran las boletas.
     * @param tipoBoleta Tipo de boleta adquirida.
     * @param cantidadBoletas Cantidad de boletas compradas.
     */
    public CompraBoleta(String codigo, LocalDate fechaCompra, Cliente cliente,
                        Funcion funcion, TipoBoleta tipoBoleta, int cantidadBoletas) {
        this.codigo = codigo;
        this.fechaCompra = fechaCompra;
        this.cliente = cliente;
        this.funcion = funcion;
        this.tipoBoleta = tipoBoleta;
        this.cantidadBoletas = cantidadBoletas;
        this.costoTotal = 0;
        calcularCostoTotal();
    }

    /**
     * Calcula el precio unitario de la boleta según el tipo seleccionado.
     * @return Precio unitario de la boleta.
     */
    public double calcularPrecioUnitario() {
        double precioBase = funcion.obtenerPrecioBase();
        double precioFinal = precioBase;
        switch (tipoBoleta) {
            case GENERAL:
                precioFinal = precioBase;
                break;
            case PREFERENCIAL:
                precioFinal = precioBase + 10000;
                break;
            case VIP:
                precioFinal = precioBase + 25000;
                break;
        }
        return precioFinal;
    }

    /**
     * Calcula el costo total de la compra multiplicando el precio unitario
     * por la cantidad de boletas adquiridas.
     */
    public void calcularCostoTotal() {
        costoTotal = calcularPrecioUnitario() * cantidadBoletas;
    }

    /**
     * Verifica si la función tiene disponibilidad suficiente para esta compra.
     * @return true si hay disponibilidad, false en caso contrario.
     */
    public boolean validarDisponibilidad() {
        return funcion.hayBoletasDisponibles(cantidadBoletas);
    }

    /**
     * Confirma la compra descontando las boletas disponibles de la función,
     * siempre que exista capacidad suficiente.
     * @return true si la compra fue confirmada, false en caso contrario.
     */
    public boolean confirmarCompra() {
        boolean confirmada = false;

        if (validarDisponibilidad()) {
            funcion.disminuirBoletasDisponibles(cantidadBoletas);
            confirmada = true;
        }
        return confirmada;
    }

    /**
     * Retorna un resumen detallado de la compra.
     * @return Cadena con la información de la compra.
     */
    public String mostrarResumenCompra() {
        return "Código de compra: " + codigo
                + "\nFecha de compra: " + fechaCompra
                + "\nCliente: " + cliente.getNombre()
                + "\nFunción: " + funcion.getNombre()
                + "\nTipo de boleta: " + tipoBoleta
                + "\nCantidad de boletas: " + cantidadBoletas
                + "\nPrecio unitario: $" + calcularPrecioUnitario()
                + "\nCosto total: $" + costoTotal;
    }

    /**
     * Obtiene el código de la compra.
     * @return Código de la compra.
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Obtiene la fecha de la compra.
     * @return Fecha de compra.
     */
    public LocalDate getFechaCompra() {
        return fechaCompra;
    }

    /**
     * Obtiene el cliente asociado a la compra.
     * @return Cliente de la compra.
     */
    public Cliente getClientes() {
        return cliente;
    }

    /**
     * Obtiene la función asociada a la compra.
     * @return Función de la compra.
     */
    public Funcion getFunciones() {
        return funcion;
    }

    /**
     * Obtiene el tipo de boleta comprado.
     * @return Tipo de boleta.
     */
    public TipoBoleta getTipoBoleta() {
        return tipoBoleta;
    }

    /**
     * Obtiene la cantidad de boletas compradas.
     * @return Cantidad de boletas.
     */
    public int getCantidadBoletas() {
        return cantidadBoletas;
    }

    /**
     * Obtiene el costo total de la compra.
     * @return Costo total de la compra.
     */
    public double getCostoTotal() {
        return costoTotal;
    }
}