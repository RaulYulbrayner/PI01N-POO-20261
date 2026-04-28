package uniquindio.edu.co.model;

public class Cliente {

    private String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    public boolean esVocal(char letra){
        boolean bandera = false;
        if(letra=='a' || letra=='e' || letra=='i' || letra=='o' || letra=='u'){
            bandera = true;
        }
        return bandera;
    }

    /**
     *
     * @param palabra
     * @return
     */
    public int contarVocales(String palabra){
        int contador = 0;
        for(int i = 0; i < palabra.length() ; i++){
            char caracter = palabra.charAt(i);
            if(!esVocal(caracter)){
                contador++;
            }
        }
        return contador;
    }

    public boolean esCapicuo(int numero){
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
