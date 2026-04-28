package co.edu.uniquindio.poo.model;

/**
 * Clase abstracta que representa un artista del circo.
 * Contiene la información básica común a todos los artistas.
 */
public abstract class Artista {

    protected String nombre;
    protected String cedula;
    protected String direccion;
    protected String telefono;

    /**
     * Construye un artista con su información básica.
     * @param nombre Nombre del artista.
     * @param cedula Cédula del artista.
     * @param direccion Dirección del artista.
     * @param telefono Teléfono del artista.
     */
    public Artista(String nombre, String cedula, String direccion, String telefono) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    /**
     * Calcula el pago del artista según su tipo y características.
     * @return Valor del pago del artista.
     */
    public abstract double calcularPago();

    /**
     * Retorna la información general del artista.
     * @return Cadena con la información del artista.
     */
    public abstract String mostrarInformacion();

    /**
     * Obtiene el nombre del artista.
     * @return Nombre del artista.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene la cédula del artista.
     * @return Cédula del artista.
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * Obtiene la dirección del artista.
     * @return Dirección del artista.
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Obtiene el teléfono del artista.
     * @return Teléfono del artista.
     */
    public String getTelefono() {
        return telefono;
    }
}
