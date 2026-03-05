package uniquindio.edu.co.model;

public class Proveedor {

    //Atributos
    private String nombre;
    private String telefono;
    private String email;

    //Relaciones
    private Empresa theEmpresa;

    /**
     * Metodo constructor que permite crear objetos de tipo proveedor
     * @param nombre del proveedor
     * @param telefono del proveedor
     * @param email del proveedor
     */
    public Proveedor(String nombre, String telefono, String email, Empresa theEmpresa) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.theEmpresa = theEmpresa;
    }
}
