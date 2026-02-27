package uniquindio.edu.co.model;

import java.util.List;

public class Cliente {

    //Atributos
    private String nombre;
    private String telefono;
    private String email;
    private String cedula;

    //Relaciones
    private List<Bicicleta> listBicicletasCliente;
    private List<OrdenServicio> listOrdenCliente;

    /**
     * Metodo constructor de la clase cliente
     * @param nombre del cliente
     * @param telefono del cliente
     * @param email del cliente
     * @param cedula del cliente
     */
    public Cliente(String nombre, String telefono, String email, String cedula) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public List<Bicicleta> getListBicicletasCliente() {
        return listBicicletasCliente;
    }

    public void setListBicicletasCliente(List<Bicicleta> listBicicletasCliente) {
        this.listBicicletasCliente = listBicicletasCliente;
    }

    public List<OrdenServicio> getListOrdenCliente() {
        return listOrdenCliente;
    }

    public void setListOrdenCliente(List<OrdenServicio> listOrdenCliente) {
        this.listOrdenCliente = listOrdenCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                ", cedula=" + cedula +
                ", listBicicletasCliente=" + listBicicletasCliente +
                '}';
    }
}
