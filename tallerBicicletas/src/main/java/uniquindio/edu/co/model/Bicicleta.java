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
}
