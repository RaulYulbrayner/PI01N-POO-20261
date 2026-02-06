package uniquindio.edu.co;

public class Ejercicio1 {

    /**
     * Metodo que permite identificar si un numero es positivo o negativo
     * @param numero
     * @return mensaje
     */
    public static String numeroPositivoNegativo(int numero){
        String mensaje = "";
        if(numero >= 0){
            mensaje = "El número es positivo" + numero;
        }else{
            mensaje = "El número es negativo" + numero;
        }
        return mensaje;
    }

    public static boolean numeroPositivoNegativo1(int numero){
        boolean mensaje = false;
        if(numero >= 0){
            mensaje = true;
        }else{
            mensaje = false;
        }
        return mensaje;
    }

    public static void main(String arg[]){
        System.out.println(numeroPositivoNegativo1(-7));
    }


}
