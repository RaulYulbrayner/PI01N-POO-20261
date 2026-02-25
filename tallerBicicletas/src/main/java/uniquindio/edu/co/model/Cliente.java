package uniquindio.edu.co.model;

import java.util.List;

public class Cliente {

    //Atributos
    private String nombre;
    private String telefono;
    private String email;
    private int cedula;

    //Relaciones
    private List<Bicicleta> listBicicletasCliente;
    private List<OrdenServicio> listOrdenCliente;

    /**
     * Metodo constructor de la clase cliente
     * @param nombre del cliente
     * @param telefono del cliente
     * @param email del cliente
     * @param cedula del cliente
     */
    public Cliente(String nombre, String telefono, String email, int cedula) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.cedula = cedula;
    }
}
