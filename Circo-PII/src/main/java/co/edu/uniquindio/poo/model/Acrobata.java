package co.edu.uniquindio.poo.model;

/**
 * Representa un artista de tipo acróbata.
 */
public class Acrobata extends Artista {

    private int aniosExperiencia;
    private String especialidad;

    /**
     * Construye un acróbata con su información básica y específica.
     * @param nombre Nombre del acróbata.
     * @param cedula Cédula del acróbata.
     * @param direccion Dirección del acróbata.
     * @param telefono Teléfono del acróbata.
     * @param aniosExperiencia Años de experiencia del acróbata.
     * @param especialidad Especialidad del acróbata.
     */
    public Acrobata(String nombre, String cedula, String direccion, String telefono,
                    int aniosExperiencia, String especialidad) {
        super(nombre, cedula, direccion, telefono);
        this.aniosExperiencia = aniosExperiencia;
        this.especialidad = especialidad;
    }

    /**
     * Calcula el pago del acróbata.
     * Se usa un valor base más un valor por cada año de experiencia.
     * @return Valor del pago del acróbata.
     */
    @Override
    public double calcularPago() {
        return 60000 + (aniosExperiencia * 8000);
    }

    /**
     * Retorna la información completa del acróbata.
     * @return Cadena con la información del acróbata.
     */
    @Override
    public String mostrarInformacion() {
        return "Nombre: " + nombre +
                "\n Cédula: " + cedula +
                "\n Dirección: " + direccion +
                "\n Teléfono: " + telefono +
                "\nAños de experiencia: " + aniosExperiencia +
                "\nEspecialidad: " + especialidad +
                "\nPago: $" + calcularPago();
    }

    /**
     * Obtiene los años de experiencia del acróbata.
     * @return Años de experiencia.
     */
    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    /**
     * Obtiene la especialidad del acróbata.
     * @return Especialidad.
     */
    public String getEspecialidad() {
        return especialidad;
    }
}
