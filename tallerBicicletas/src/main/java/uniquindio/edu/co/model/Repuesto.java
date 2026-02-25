package uniquindio.edu.co.model;

public class Repuesto {

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
}
