package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String nombreCompleto;
    private String documento;
    private String telefono;
    private String correo;
    private String direccionEnvio;

    private List<Compra> compras;

    /**
     * Constructor de la clase Cliente.
     * @param nombreCompleto nombre del cliente
     * @param documento documento de identidad
     * @param telefono número telefónico
     * @param correo correo electrónico
     * @param direccionEnvio dirección de envío
     */
    public Cliente(String nombreCompleto, String documento, String telefono, String correo, String direccionEnvio) {
        this.nombreCompleto = nombreCompleto;
        this.documento = documento;
        this.telefono = telefono;
        this.correo = correo;
        this.direccionEnvio = direccionEnvio;
        this.compras = new ArrayList<>();
    }

    /**
     * Agrega una compra realizada por el cliente.
     * @param compra compra realizada
     */
    public void agregarCompra(Compra compra) {
        compras.add(compra);
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public List<Compra> getCompras() {
        return compras;
    }

    public void setCompras(List<Compra> compras) {
        this.compras = compras;
    }

    public String getDireccionEnvio() {
        return direccionEnvio;
    }

    public void setDireccionEnvio(String direccionEnvio) {
        this.direccionEnvio = direccionEnvio;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }
}
