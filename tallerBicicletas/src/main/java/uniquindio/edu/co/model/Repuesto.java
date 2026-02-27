package uniquindio.edu.co.model;

public class Repuesto {

    //Atributos
    private String nombre;
    private int cantidad;
    private double costo;
    private int idRepuesto;

    /**
     * Metodo constructor de la clase repuesto
     * @param nombre del repuesto
     * @param cantidad  del repuesto
     * @param costo del repuesto
     * @param idRepuesto  del repuesto
     */
    public Repuesto(String nombre, int cantidad, double costo, int idRepuesto) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.costo = costo;
        this.idRepuesto = idRepuesto;
    }

    /**
     * Metodo que permite calcular el costo de un repuesto
     * @return cosoto total repuessto
     */
    public double costoRepuesto(){
        double valorCosto = cantidad * costo;
        return valorCosto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public int getIdRepuesto() {
        return idRepuesto;
    }

    public void setIdRepuesto(int idRepuesto) {
        this.idRepuesto = idRepuesto;
    }

    @Override
    public String toString() {
        return "Repuesto{" +
                "nombre='" + nombre + '\'' +
                ", cantidad=" + cantidad +
                ", costo=" + costo +
                ", idRepuesto=" + idRepuesto +
                '}';
    }
}
