package uniquindio.edu.co;

public class Ejercicio2 {

    public static String numeroParImpar(int numero){
        if(numero % 2 == 0){
            return "El número es PAR";
        }else{
            return "El número es IMPAR";
        }
    }


    public static void main(String args[]){
        System.out.println(numeroParImpar(8));
    }

}
