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

}
