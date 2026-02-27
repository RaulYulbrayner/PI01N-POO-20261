package uniquindio.edu.co.model;

import java.util.ArrayList;
import java.util.Collections;
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
        this.listClientes = new ArrayList<>();
        this.listRepuestos = new ArrayList<>();
        this.listBicicletas = new ArrayList<>();
        this.listMecanicos = new ArrayList<>();
        this.listOrdenes = new ArrayList<>();
    }

    public String crearCliente(String nombre, String telefono, String email, String cedula){
        String respuesta = "";
        if(buscarCliente(cedula)){
            respuesta = "El cliente ya existe con el mismo numero de cedula";
        }else{
            Cliente clienteNuevo = new Cliente(nombre, telefono, email, cedula);
            listClientes.add(clienteNuevo);
            respuesta = "El cliente " + clienteNuevo.getNombre() + " se registro exitosamente";
        }
        return respuesta;
    }

    public boolean buscarCliente(String cedula){
        boolean existe = false;
        for(Cliente cl : listClientes){
            if(cl.getCedula().equals(cedula)){
                existe = true;
                break;
            }
        }
        return existe;
    }


    @Override
    public String toString() {
        return "Taller{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", nit='" + nit + '\'' +
                ", listClientes=" + listClientes +
                ", listOrdenes=" + listOrdenes +
                ", listBicicletas=" + listBicicletas +
                ", listMecanicos=" + listMecanicos +
                ", listRepuestos=" + listRepuestos +
                '}';
    }
}
