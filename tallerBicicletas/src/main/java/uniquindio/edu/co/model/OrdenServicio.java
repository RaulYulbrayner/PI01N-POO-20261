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
}
