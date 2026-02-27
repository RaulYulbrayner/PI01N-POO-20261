package uniquindio.edu.co.model;

import java.util.List;

public class Bicicleta {

    // Atributos
    private String marca;
    private String color;
    private String numChasis;
    private String tipoBicicleta;

    // Relaciones
    private List<OrdenServicio> listOrdenServicioBicicleta;
    private Cliente theCliente;

    /**
     * Constructor de la clase Bicicleta.
     * @param marca de la bicicleta.
     * @param color de la bicicleta.
     * @param numChasis número de chasis de la bicicleta.
     * @param tipoBicicleta tipo de bicicleta (ej. montaña, ruta).
     */
    public Bicicleta(String marca, String color, String numChasis, String tipoBicicleta) {
        this.marca = marca;
        this.color = color;
        this.numChasis = numChasis;
        this.tipoBicicleta = tipoBicicleta;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNumChasis() {
        return numChasis;
    }

    public void setNumChasis(String numChasis) {
        this.numChasis = numChasis;
    }

    public String getTipoBicicleta() {
        return tipoBicicleta;
    }

    public void setTipoBicicleta(String tipoBicicleta) {
        this.tipoBicicleta = tipoBicicleta;
    }

    public List<OrdenServicio> getListOrdenServicioBicicleta() {
        return listOrdenServicioBicicleta;
    }

    public Cliente getTheCliente() {
        return theCliente;
    }

    public void setTheCliente(Cliente theCliente) {
        this.theCliente = theCliente;
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                ", numChasis='" + numChasis + '\'' +
                ", tipoBicicleta='" + tipoBicicleta + '\'' +
                '}';
    }
}