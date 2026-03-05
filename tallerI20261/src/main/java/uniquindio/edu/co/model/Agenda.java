package uniquindio.edu.co.model;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

    //Aributos
    private String nombre;
    private int id;

    //Relaciones
    private List<Cliente> listClienteAgenda;
    private List<Proveedor> listProveedorAgenda;
    private List<Empresa> listEmpresaAgenda;

    /**
     * Metodo constructor que permite crear agendas
     * @param nombre de la agenda
     * @param id de la agenda
     */
    public Agenda(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
        this.listClienteAgenda = new ArrayList<>();
        this.listProveedorAgenda = new ArrayList<>();
        this.listEmpresaAgenda = new ArrayList<>();
    }

    public String registrarCliente(String nombre, String telefono, String email, String nivelFidelidad){
        String respuesta = "";
        if(buscarTelefonoCliente(telefono)){
            respuesta = "Ya existe un numero con ese mismo telefono";
        }
        Cliente cliente = new Cliente(nombre,telefono, email,nivelFidelidad);
        listClienteAgenda.add(cliente);
        respuesta = "El cliente se registro exitosamente";
        return respuesta;
    }

    public boolean buscarTelefonoCliente(String telefono){
        boolean existe = false;
        for(Cliente cl : listClienteAgenda){
            if(cl.getTelefono().equals(telefono)){
                existe = true;
            }
        }
        return existe;
    }

}
