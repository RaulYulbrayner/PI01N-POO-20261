package uniquindio.edu.co.model;

public class Cliente {

    //Atributos
    private String nombre;
    private String telefono;
    private String email;
    private String nivelFidelidad;

    /**
     * Metodo constructor que permite crear objetos de tipo Cliente
     * @param nombre del cliente
     * @param telefono del cliente
     * @param email del cliente
     * @param nivelFidelidad del cliente
     */
    public Cliente(String nombre, String telefono, String email, String nivelFidelidad){
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.nivelFidelidad = nivelFidelidad;
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

    public String getNivelFidelidad() {
        return nivelFidelidad;
    }

    public void setNivelFidelidad(String nivelFidelidad) {
        this.nivelFidelidad = nivelFidelidad;
    }
}
