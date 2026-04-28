package co.edu.uniquindio.poo.model;

/**
 * Representa un artista de tipo mago.
 */
public class Mago extends Artista {

    private int cantidadTrucos;

    /**
     * Construye un mago con su información básica y específica.
     * @param nombre Nombre del mago.
     * @param cedula Cédula del mago.
     * @param direccion Dirección del mago.
     * @param telefono Teléfono del mago.
     * @param cantidadTrucos Cantidad de trucos que presenta.
     */
    public Mago(String nombre, String cedula, String direccion, String telefono,
                int cantidadTrucos) {
        super(nombre, cedula, direccion, telefono);
        this.cantidadTrucos = cantidadTrucos;
    }

    /**
     * Calcula el pago del mago.
     * Se usa un valor base más un valor por cada truco.
     * @return Valor del pago del mago.
     */
    @Override
    public double calcularPago() {
        return 55000 + (cantidadTrucos * 12000);
    }

    /**
     * Retorna la información completa del mago.
     * @return Cadena con la información del mago.
     */
    @Override
    public String mostrarInformacion() {
        return "Nombre: " + nombre +
                "\n Cédula: " + cedula +
                "\n Dirección: " + direccion +
                "\n Teléfono: " + telefono +
                "\nCantidad de trucos: " + cantidadTrucos +
                "\nPago: $" + calcularPago();
    }

    /**
     * Obtiene la cantidad de trucos del mago.
     * @return Cantidad de trucos.
     */
    public int getCantidadTrucos() {
        return cantidadTrucos;
    }
}
