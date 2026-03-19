package uniquindio.edu.co;

public class Capicuo {

    public static boolean esCapicuo(int numero){
        String num = String.valueOf(numero);
        boolean bandera = true;
        int inicio = 0;
        int fin = num.length()-1;
        while( inicio < fin){
            if(num.charAt(inicio) != num.charAt(fin)){
                bandera = false;
            }
            inicio ++;
            fin--;
        }
        return bandera;
    }



    public static void main(String [] args){
        System.out.println(esCapicuo(3114113));
    }



}
