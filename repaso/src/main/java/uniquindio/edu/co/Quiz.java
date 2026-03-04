package uniquindio.edu.co;

import javax.swing.*;

public class Quiz {
                                          // ana
    public static int contarCantidadLetras(String palabra){
        int cantidad = 0;
             // a
        char letraInicial = palabra.charAt(0);
        //      i = 3    3 < 3
        for(int i = 0; i < palabra.length(); i++){
            //       a      ==    a
            if(letraInicial == palabra.charAt(i)){
                // 2
                cantidad++;
            }
        }
        // 2
        return cantidad;
    }

    public static void main(String[] args) {
        String palabra = JOptionPane.showInputDialog("Ingrese la palabra:");
        JOptionPane.showMessageDialog(null, contarCantidadLetras(palabra));
    }



}
