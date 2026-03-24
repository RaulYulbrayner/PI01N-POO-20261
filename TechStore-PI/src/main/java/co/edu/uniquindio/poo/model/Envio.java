package co.edu.uniquindio.poo.model;

public class Envio {

    private String codigoEnvio;
    private String destino;
    private double pesoPaquete;
    private String metodoEnvio;
    private String estadoEnvio;
    private double costoEnvio;

    /**
     * Constructor de la clase Envio.
     * @param codigoEnvio identificador del envío
     * @param destino dirección de destino
     * @param pesoPaquete peso del paquete
     * @param metodoEnvio tipo de envío
     */
    public Envio(String codigoEnvio, String destino, double pesoPaquete, String metodoEnvio) {
        this.codigoEnvio = codigoEnvio;
        this.destino = destino;
        this.pesoPaquete = pesoPaquete;
        this.metodoEnvio = metodoEnvio;
        this.estadoEnvio = "Preparando";
    }

    /**
     * Calcula el costo del envío basado en el peso.
     */
    public void calcularCosto() {
        costoEnvio = pesoPaquete * 5;
    }

    /**
     * Actualiza el estado del envío.
     * @param nuevoEstado nuevo estado del envío
     */
    public void actualizarEstado(String nuevoEstado) {
        estadoEnvio = nuevoEstado;
    }

    /**
     * Obtiene el costo del envío.
     * @return costo del envío
     */
    public double getCostoEnvio() {
        return costoEnvio;
    }
}
