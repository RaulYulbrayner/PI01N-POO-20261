package uniquindio.edu.co;

public class Ejercicio3 {

    public static int sumarNumeros(int numero){
        int suma = 0;
        for(int i = 1; i <= numero; i++){
            suma+=i;
        }
        return suma;
    }


    public static void main(String args[]){
        System.out.println("La suma es: " + sumarNumeros(500));
    }
}
