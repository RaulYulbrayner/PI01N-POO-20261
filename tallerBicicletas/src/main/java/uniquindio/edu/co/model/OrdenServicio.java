package uniquindio.edu.co.model;

import java.util.List;

public class OrdenServicio {

    //Atributos
    private String descripcion;
    private String estado;
    private String fechaIngreso;
    private int idOrdenServicio;
    private double manoObra;

    //Relaciones
    private Cliente theCliente;
    private Bicicleta theBicicleta;
    private Mecanico theMecanico;
    private List<Repuesto> listOrdenRepuestos;

    /**
     * Metodo constructor de la clase Orden de servicio
     * @param descripcion de la oden de servicio
     * @param estado de la oden de servicio
     * @param fechaIngreso de la oden de servicio
     * @param idOrdenServicio de la oden de servicio
     * @param manoObra de la oden de servicio
     */
    public OrdenServicio(String descripcion, String estado, String fechaIngreso, int idOrdenServicio, double manoObra) {
        this.descripcion = descripcion;
        this.estado = estado;
        this.fechaIngreso = fechaIngreso;
        this.idOrdenServicio = idOrdenServicio;
        this.manoObra = manoObra;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public int getIdOrdenServicio() {
        return idOrdenServicio;
    }

    public void setIdOrdenServicio(int idOrdenServicio) {
        this.idOrdenServicio = idOrdenServicio;
    }

    public double getManoObra() {
        return manoObra;
    }

    public void setManoObra(double manoObra) {
        this.manoObra = manoObra;
    }

    public Cliente getTheCliente() {
        return theCliente;
    }

    public void setTheCliente(Cliente theCliente) {
        this.theCliente = theCliente;
    }

    public Bicicleta getTheBicicleta() {
        return theBicicleta;
    }

    public void setTheBicicleta(Bicicleta theBicicleta) {
        this.theBicicleta = theBicicleta;
    }

    public Mecanico getTheMecanico() {
        return theMecanico;
    }

    public void setTheMecanico(Mecanico theMecanico) {
        this.theMecanico = theMecanico;
    }

    public List<Repuesto> getListOrdenRepuestos() {
        return listOrdenRepuestos;
    }

    public void setListOrdenRepuestos(List<Repuesto> listOrdenRepuestos) {
        this.listOrdenRepuestos = listOrdenRepuestos;
    }

    @Override
    public String toString() {
        return "OrdenServicio{" +
                "descripcion='" + descripcion + '\'' +
                ", estado='" + estado + '\'' +
                ", fechaIngreso='" + fechaIngreso + '\'' +
                ", idOrdenServicio=" + idOrdenServicio +
                ", manoObra=" + manoObra +
                ", theCliente=" + theCliente +
                ", theBicicleta=" + theBicicleta +
                ", theMecanico=" + theMecanico +
                ", listOrdenRepuestos=" + listOrdenRepuestos +
                '}';
    }
}
