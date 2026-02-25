package uniquindio.edu.co.model;

import java.util.List;

public class Mecanico {

    //Atributos
    private String nombre;
    private String cedula;
    private String nivelMecanico;
    private String telefono;
    private String tarea;

    //Relaciones
    private List<OrdenServicio> listOrdenMecanico;

    /**
     * Metodo constructor de la clase Mecanico
     * @param nombre del mecanico
     * @param cedula del mecanico
     * @param nivelMecanico del mecanico
     * @param telefono del mecanico
     * @param tarea del mecanico
     */
    public Mecanico(String nombre, String cedula, String nivelMecanico, String telefono, String tarea) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.nivelMecanico = nivelMecanico;
        this.telefono = telefono;
        this.tarea = tarea;
    }
}
