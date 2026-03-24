package co.edu.uniquindio.poo.model;

public class Producto {

    private String codigo;
    private String nombre;
    private double precioUnitario;
    private String categoria;
    private boolean disponible;

    /**
     * Constructor de la clase Producto.
     * @param codigo identificador único del producto
     * @param nombre nombre del producto
     * @param precioUnitario precio unitario del producto
     * @param categoria categoría del producto
     * @param disponible indica si el producto está disponible
     */
    public Producto(String codigo, String nombre, double precioUnitario, String categoria, boolean disponible) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
        this.categoria = categoria;
        this.disponible = disponible;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
