package uniquindio.edu.co.model;

public class Rectangulo extends FiguraGeometrica {

    //Atributos
    private int altura;
    private int base;

    public Rectangulo(String nombre, int altura, int base) {
        super(nombre);
        this.altura = altura;
        this.base = base;
    }

    @Override
    public double calcularArea() {
        double resultado = base * altura;
        return resultado;
    }
}
