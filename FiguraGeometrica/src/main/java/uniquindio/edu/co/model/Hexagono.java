package uniquindio.edu.co.model;

public class Hexagono extends FiguraGeometrica{

    private double lado;

    public Hexagono(String nombre, double lado) {
        super(nombre);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        double resultado = (3 * Math.sqrt(3)/2) * Math.pow(lado, 2);
        return resultado;
    }
}
