package co.edu.uniquindio.poo.model;

/**
 * Representa un artista de tipo payaso.
 */
public class Payaso extends Artista {

    private String tipoHumor;
    private int numeroRutinas;

    /**
     * Construye un payaso con su información básica y específica.
     * @param nombre Nombre del payaso.
     * @param cedula Cédula del payaso.
     * @param direccion Dirección del payaso.
     * @param telefono Teléfono del payaso.
     * @param tipoHumor Tipo de humor del payaso.
     * @param numeroRutinas Número de rutinas que presenta.
     */
    public Payaso(String nombre, String cedula, String direccion, String telefono,
                  String tipoHumor, int numeroRutinas) {
        super(nombre, cedula, direccion, telefono);
        this.tipoHumor = tipoHumor;
        this.numeroRutinas = numeroRutinas;
    }

    /**
     * Calcula el pago del payaso.
     * Se usa un valor base más un valor por cada rutina.
     * @return Valor del pago del payaso.
     */
    @Override
    public double calcularPago() {
        return 40000 + (numeroRutinas * 10000);
    }

    /**
     * Retorna la información completa del payaso.
     * @return Cadena con la información del payaso.
     */
    @Override
    public String mostrarInformacion() {
        return "Nombre: " + nombre +
                "\n Cédula: " + cedula +
                "\n Dirección: " + direccion +
                "\n Teléfono: " + telefono +
                "\nTipo de humor: " + tipoHumor +
                "\nNúmero de rutinas: " + numeroRutinas +
                "\nPago: $" + calcularPago();
    }

    /**
     * Obtiene el tipo de humor del payaso.
     * @return Tipo de humor.
     */
    public String getTipoHumor() {
        return tipoHumor;
    }

    /**
     * Obtiene el número de rutinas del payaso.
     * @return Número de rutinas.
     */
    public int getNumeroRutinas() {
        return numeroRutinas;
    }

}