package uniquindio.edu.co.model;

public class Circulo extends FiguraGeometrica {

    //Atributos
    private double radio;

    public Circulo(String nombre, double radio){
        super(nombre);
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        double resultado = Math.PI * radio * radio;
        return resultado;
    }
}
