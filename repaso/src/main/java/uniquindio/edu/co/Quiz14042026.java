package uniquindio.edu.co;

public class Quiz14042026 {

    public static void imprimirPatron() {
        for (char fila = 'A'; fila <= 'D'; fila++) {
            for (char letra = 'A'; letra <= fila; letra++) {
                if (letra == 'A') {
                    System.out.print(letra);
                } else {
                    System.out.print(" " + letra);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        imprimirPatron();
    }

}
