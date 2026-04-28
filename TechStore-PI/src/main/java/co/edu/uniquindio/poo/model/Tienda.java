package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;

public class Tienda {

    //Atributos
    private String nombreComercial;
    private String nit;
    private String direccion;
    private String paginaWeb;

    //Relaciones
    private List<Cliente> listClientes;
    private List<Producto> listProductos;
    private List<Compra> listCompras;

    private Inventario inventario;

    /**
     * Constructor de la clase Tienda.
     * @param nombreComercial nombre de la tienda
     * @param nit número de identificación tributaria
     * @param direccion dirección de la tienda
     * @param paginaWeb página web oficial
     */
    public Tienda(String nombreComercial, String nit, String direccion, String paginaWeb) {
        this.nombreComercial = nombreComercial;
        this.nit = nit;
        this.direccion = direccion;
        this.paginaWeb = paginaWeb;
        listClientes = new ArrayList<>();
        listProductos = new ArrayList<>();
        listCompras = new ArrayList<>();
        inventario = new Inventario();
    }

    /**
     * Registra un nuevo cliente en la tienda.
     * Primero valida si ya existe un cliente con la misma cédula.
     * @param nombreCompleto nombre del cliente
     * @param documento documento de identidad
     * @param telefono telefono del cliente
     * @param correo correo electronico
     * @param direccionEnvio direccion de envio
     * @return mensaje indicando el resultado del registro
     */
    public String crearCliente(String nombreCompleto, String documento, String telefono, String correo, String direccionEnvio) {
        String respuesta = "";
        if (buscarCliente(documento)) {
            respuesta = "El cliente ya existe con el mismo numero de cedula";
        } else {
            Cliente clienteNuevo = new Cliente(nombreCompleto, documento, telefono, correo, direccionEnvio);
            listClientes.add(clienteNuevo);
            respuesta = "El cliente " + clienteNuevo.getNombreCompleto() + " se registro exitosamente";
        }
        return respuesta;
    }

    /**
     * Busca un cliente en la tienda según su documento.
     * @param documento documento del cliente
     * @return true si el cliente existe
     */
    public boolean buscarCliente(String documento) {
        boolean existe = false;
        for (Cliente cl : listClientes) {
            if (cl.getDocumento().equals(documento)) {
                existe = true;
                break;
            }
        }
        return existe;
    }

    /**
     * Registra un producto en la tienda.
     * También lo agrega automáticamente al inventario.
     * @param codigo código del producto
     * @param nombre nombre del producto
     * @param precioUnitario precio unitario
     * @param categoria categoria del producto
     * @param disponible disponibilidad en inventario
     * @return mensaje indicando el resultado del registro
     */
    public String crearProducto(String codigo, String nombre, double precioUnitario, String categoria, boolean disponible) {
        String respuesta = "";
        if (buscarProducto(codigo)) {
            respuesta = "El producto ya existe con el mismo codigo";
        } else {
            Producto productoNuevo = new Producto(codigo, nombre, precioUnitario, categoria, disponible);
            listProductos.add(productoNuevo);
            inventario.agregarProducto(productoNuevo);
            respuesta = "El producto " + productoNuevo.getNombre() + " se registro exitosamente";
        }
        return respuesta;
    }

    /**
     * Busca un producto según su código.
     * @param codigo código del producto
     * @return true si el producto existe
     */
    public boolean buscarProducto(String codigo) {
        boolean existe = false;
        for (Producto pr : listProductos) {
            if (pr.getCodigo().equals(codigo)) {
                existe = true;
                break;
            }
        }
        return existe;
    }

    /**
     * Registra una nueva compra en el sistema.
     * @param codigoCompra codigo de la compra
     * @param metodoPago metodo de pago
     * @return mensaje indicando el resultado de la operación
     */
    public String crearCompra(String codigoCompra, String metodoPago, Cliente cliente) {
        String respuesta = "";
        if (buscarCompra(codigoCompra)) {
            respuesta = "La compra ya existe con el mismo codigo";
        } else {
            Compra compraNueva = new Compra(codigoCompra, metodoPago, cliente);
            listCompras.add(compraNueva);
            respuesta = "La compra " + codigoCompra + " se registro exitosamente";
        }
        return respuesta;
    }

    /**
     * Busca una compra según su código.
     * @param codigoCompra código de la compra
     * @return true si la compra existe
     */
    public boolean buscarCompra(String codigoCompra) {
        boolean existe = false;
        for (Compra cp : listCompras) {
            if (cp.getCodigoCompra().equals(codigoCompra)) {
                existe = true;
                break;
            }
        }
        return existe;
    }

    /**
     * Agrega un producto a una compra existente.
     * @param codigoCompra codigo de la compra
     * @param codigoProducto codigo del producto
     * @return mensaje indicando el resultado
     */
    public String agregarProductoCompra(String codigoCompra, String codigoProducto) {
        String respuesta = "";
        Compra compraEncontrada = null;
        Producto productoEncontrado = null;
        for (Compra c : listCompras) {
            if (c.getCodigoCompra().equals(codigoCompra)) {
                compraEncontrada = c;
                break;
            }
        }
        for (Producto p : listProductos) {
            if (p.getCodigo().equals(codigoProducto)) {
                productoEncontrado = p;
                break;
            }
        }
        if (compraEncontrada == null) {
            respuesta = "La compra no existe";
        } else if (productoEncontrado == null) {
            respuesta = "El producto no existe";
        } else {
            compraEncontrada.asignarProducto(productoEncontrado);
            respuesta = "Producto agregado correctamente a la compra";
        }
        return respuesta;
    }

    /**
     * Crea un envio asociado a una compra.
     * @param codigoCompra codigo de la compra
     * @param codigoEnvio codigo del envio
     * @param destino destino del paquete
     * @param pesoPaquete peso del paquete
     * @param metodoEnvio metodo de envio
     * @return mensaje indicando el resultado
     */
    public String crearEnvio(String codigoCompra, String codigoEnvio, String destino, double pesoPaquete, String metodoEnvio) {
        String respuesta = "";
        Compra compraEncontrada = null;
        for (Compra c : listCompras) {
            if (c.getCodigoCompra().equals(codigoCompra)) {
                compraEncontrada = c;
                break;
            }
        }
        if (compraEncontrada == null) {
            respuesta = "La compra no existe";
        } else {
            Envio nuevoEnvio = new Envio(codigoEnvio, destino, pesoPaquete, metodoEnvio);
            nuevoEnvio.calcularCosto();
            compraEncontrada.agregarEnvio(nuevoEnvio);
            respuesta = "Envio registrado correctamente";
        }
        return respuesta;
    }

    /**
     * Calcula el monto total de una compra.
     * @param codigoCompra codigo de la compra
     * @return valor total de la compra
     */
    public double calcularTotalCompra(String codigoCompra) {
        double total = 0;
        for (Compra c : listCompras) {
            if (c.getCodigoCompra().equals(codigoCompra)) {
                total = c.calcularTotal();
                break;
            }
        }
        return total;
    }

    public Cliente obtenerCliente(String documento){
        Cliente clienteEncontrado = null;
        for(Cliente c : listClientes){
            if(c.getDocumento().equals(documento)){
                clienteEncontrado = c;
                break;
            }
        }
        return clienteEncontrado;
    }

}