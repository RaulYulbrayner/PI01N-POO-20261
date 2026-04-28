package co.edu.uniquindio.poo.model;

/**
 * Representa un artista de tipo malabarista.
 */
public class Malabarista extends Artista {

    private int cantidadElementos;

    /**
     * Construye un malabarista con su información básica y específica.
     * @param nombre Nombre del malabarista.
     * @param cedula Cédula del malabarista.
     * @param direccion Dirección del malabarista.
     * @param telefono Teléfono del malabarista.
     * @param cantidadElementos Cantidad de elementos que manipula.
     */
    public Malabarista(String nombre, String cedula, String direccion, String telefono,
                       int cantidadElementos) {
        super(nombre, cedula, direccion, telefono);
        this.cantidadElementos = cantidadElementos;
    }

    /**
     * Calcula el pago del malabarista.
     * Se usa un valor base más un valor por cada elemento.
     * @return Valor del pago del malabarista.
     */
    @Override
    public double calcularPago() {
        return 50000 + (cantidadElementos * 5000);
    }

    /**
     * Retorna la información completa del malabarista.
     * @return Cadena con la información del malabarista.
     */
    @Override
    public String mostrarInformacion() {
        return "Nombre: " + nombre +
                "\n Cédula: " + cedula +
                "\n Dirección: " + direccion +
                "\n Teléfono: " + telefono +
                "\nCantidad de elementos: " + cantidadElementos +
                "\nPago: $" + calcularPago();
    }

    /**
     * Obtiene la cantidad de elementos del malabarista.
     * @return Cantidad de elementos.
     */
    public int getCantidadElementos() {
        return cantidadElementos;
    }
}
