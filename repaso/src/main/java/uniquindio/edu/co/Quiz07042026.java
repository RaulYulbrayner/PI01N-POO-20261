package uniquindio.edu.co;

public class Quiz07042026 {

    public static void tablasMultiplicar(){
        for(int i = 1; i <= 100; i++){
            System.out.println("La tabla de " + i);
            for(int j = 1; j <= 10; j++){
                System.out.println(i + " X " + j + " = " + i*j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        tablasMultiplicar();
    }
}
