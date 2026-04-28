package uniquindio.edu.co;

import uniquindio.edu.co.model.Circulo;
import uniquindio.edu.co.model.FiguraGeometrica;
import uniquindio.edu.co.model.Hexagono;
import uniquindio.edu.co.model.Rectangulo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        FiguraGeometrica circulo = new Circulo("Circulo", 5);
        FiguraGeometrica rectangulo = new Rectangulo("Rectangulo", 10, 5);
        Hexagono hexagono = new Hexagono("Hexagono", 8);

        System.out.println(circulo.calcularArea());
        rectangulo.mostrarResultado();
        hexagono.mostrarResultado();

    }

}