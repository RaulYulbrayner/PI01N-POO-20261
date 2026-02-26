package uniquindio.edu.co.model;

import java.util.List;

public class Bicicleta {

    //Atributos
    private String marca;
    private String color;
    private String numChasis;
    private String tipoBicicleta;

    //Relaciones
    private List<OrdenServicio> listOrdenServicioBicicleta;

    /**
     * Metodo constructor de la clase bicicleta
     * @param marca de la clase bicicleta
     * @param color de la clase bicicleta
     * @param numChasis de la clase bicicleta
     * @param tipoBicicleta de la clase bicicleta
     */
    public Bicicleta(String marca, String color, String numChasis, String tipoBicicleta) {
        this.marca = marca;
        this.color = color;
        this.numChasis = numChasis;
        this.tipoBicicleta = tipoBicicleta;
    }

    /**
     * Metodo que permite obtener la marca de la bicicleta
     * @return marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Metodo que permite modificar la marca de la bicicleta
     * @param marca
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Metodo que permite obtener el color de la bicicleta
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * Metodo que permite modificar el color de la bicicleta
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Metodo que permite obtener el numero de chasis de la bicicleta
     * @return numChasis
     */
    public String getNumChasis() {
        return numChasis;
    }

    /**
     * Metodo que permite modificar el numero de chasis de la bicicleta
     * @param numChasis
     */
    public void setNumChasis(String numChasis) {
        this.numChasis = numChasis;
    }

    /**
     * Metodo que permite obtener el tipo de bicicleta de la bicicleta
     * @return tipoBicicleta
     */
    public String getTipoBicicleta() {
        return tipoBicicleta;
    }

    /**
     * Metodo que permite modificar el tipo de bicicleta de la bicicleta
     * @param tipoBicicleta
     */
    public void setTipoBicicleta(String tipoBicicleta) {
        this.tipoBicicleta = tipoBicicleta;
    }

    /**
     * Metodo que permite obtener las ordenes de servicio realizadas a la bicicleta
     * @return listOrdenServicioBicicleta
     */
    public List<OrdenServicio> getListOrdenServicioBicicleta() {
        return listOrdenServicioBicicleta;
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
