package uniquindio.edu.co.model;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    //Atributos
    private String nombre;
    private String nit;

    //Relaciones
    private List<Proveedor> listProveedoresEmpesa;

    /**
     * Metodo constructor que permite crear empresas
     * @param nombre de la empresa
     * @param nit de la empresa
     */
    public Empresa(String nombre, String nit) {
        this.nombre = nombre;
        this.nit = nit;
        this.listProveedoresEmpesa = new ArrayList<>();
    }
}
