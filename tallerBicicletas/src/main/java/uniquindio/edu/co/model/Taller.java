package uniquindio.edu.co.model;

import java.util.List;

public class Taller {

    //Atributos
    private String nombre;
    private String direccion;
    private String nit;

    //Relaciones
    private List<Cliente> listClientes;
    private List<OrdenServicio> listOrdenes;
    private List<Bicicleta> listBicicletas;
    private List<Mecanico> listMecanicos;
    private List<Repuesto> listRepuestos;

    /**
     * Metodo constructor de la clase taller
     * @param nombre del taller
     * @param direccion del taller
     * @param nit del taller
     */
    public Taller(String nombre, String direccion, String nit){
        this.nombre = nombre;
        this.direccion = direccion;
        this.nit = nit;
    }


    @Override
    public String toString() {
        return "Taller{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", nit='" + nit + '\'' +
                '}';
    }
}
