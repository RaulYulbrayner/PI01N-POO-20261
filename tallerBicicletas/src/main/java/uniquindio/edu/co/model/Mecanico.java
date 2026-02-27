package uniquindio.edu.co.model;

import java.util.List;

public class Mecanico {

    // Atributos
    private String nombre;
    private String cedula;
    private String nivelMecanico;
    private String telefono;
    private String tarea;

    // Relaciones
    private List<OrdenServicio> listOrdenMecanico;

    /**
     * Constructor de la clase Mecanico.
     * @param nombre del mecanico.
     * @param cedula del mecanico.
     * @param nivelMecanico nivel del mecanico.
     * @param telefono del mecanico.
     * @param tarea asignada al mecanico.
     */
    public Mecanico(String nombre, String cedula, String nivelMecanico, String telefono, String tarea) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.nivelMecanico = nivelMecanico;
        this.telefono = telefono;
        this.tarea = tarea;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNivelMecanico() {
        return nivelMecanico;
    }

    public void setNivelMecanico(String nivelMecanico) {
        this.nivelMecanico = nivelMecanico;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTarea() {
        return tarea;
    }

    public void setTarea(String tarea) {
        this.tarea = tarea;
    }

    public List<OrdenServicio> getListOrdenMecanico() {
        return listOrdenMecanico;
    }

    public void setListOrdenMecanico(List<OrdenServicio> listOrdenMecanico) {
        this.listOrdenMecanico = listOrdenMecanico;
    }

    @Override
    public String toString() {
        return "Mecanico{" +
                "nombre='" + nombre + '\'' +
                ", cedula='" + cedula + '\'' +
                ", nivelMecanico='" + nivelMecanico + '\'' +
                ", telefono='" + telefono + '\'' +
                ", tarea='" + tarea + '\'' +
                '}';
    }
}