package uniquindio.edu.co.model;

import javax.swing.*;

public abstract class FiguraGeometrica {

    //Atributos
    private String nombre;

    /**
     * Metodo constructor de la clase figuraGeometrica
     * @param nombre
     */
    public FiguraGeometrica(String nombre){
        this.nombre = nombre;
    }

    /**
     *
     * @return
     */
    public abstract double calcularArea();

    public void mostrarResultado(){
        JOptionPane.showMessageDialog(null, "El resultado del area de la figura " + nombre + " es: " + calcularArea());
    }

}
