package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa el circo como entidad principal del sistema.
 * Administra artistas, funciones, clientes y compras de boletas.
 */
public class Circo {

    private String nombre;
    private List<Artista> listArtistas;
    private List<Funcion> listFunciones;
    private List<Cliente> listClientes;
    private List<CompraBoleta> listCompraBoletas;
    private List<Acto> listActos;

    /**
     * Construye un circo con su nombre e inicializa sus colecciones.
     * @param nombre Nombre del circo.
     */
    public Circo(String nombre) {
        this.nombre = nombre;
        this.listArtistas = new ArrayList<>();
        this.listFunciones = new ArrayList<>();
        this.listClientes = new ArrayList<>();
        this.listCompraBoletas = new ArrayList<>();
        this.listActos = new ArrayList<>();
    }

    /**
     * Agrega un artista al circo.
     * @param artista Artista a registrar.
     */
    public void agregarArtista(Artista artista) {
        listArtistas.add(artista);
    }

    /**
     * Agrega una función al circo.
     * @param funcion Función a registrar.
     */
    public void agregarFuncion(Funcion funcion) {
        listFunciones.add(funcion);
    }

    /**
     * Agrega un cliente al circo.
     * @param cliente Cliente a registrar.
     */
    public void agregarCliente(Cliente cliente) {
        listClientes.add(cliente);
    }

    /**
     * Registra una compra de boletas en el circo y la asocia al cliente,
     * siempre que haya disponibilidad en la función.
     * @param compra Compra de boletas a registrar.
     * @return true si la compra fue registrada, false en caso contrario.
     */
    public boolean registrarCompra(CompraBoleta compra) {
        boolean registrada = false;
        if (compra.confirmarCompra()) {
            listCompraBoletas.add(compra);
            compra.getClientes().agregarCompra(compra);
            registrada = true;
        }
        return registrada;
    }

    /**
     * Busca un artista por su cédula.
     * @param cedula Cédula del artista.
     * @return Artista encontrado o null si no existe.
     */
    public Artista buscarArtista(String cedula) {
        Artista artistaEncontrado = null;
        for (Artista artista : listArtistas) {
            if (artista.getCedula().equals(cedula)) {
                artistaEncontrado = artista;
                break;
            }
        }
        return artistaEncontrado;
    }

    /**
     * Busca un cliente por su cédula.
     * @param cedula Cédula del cliente.
     * @return Cliente encontrado o null si no existe.
     */
    public Cliente buscarCliente(String cedula) {
        Cliente clienteEncontrado = null;
        for (Cliente cliente : listClientes) {
            if (cliente.getCedula().equals(cedula)) {
                clienteEncontrado = cliente;
                break;
            }
        }
        return clienteEncontrado;
    }

    /**
     * Busca una función por su código.
     * @param codigo Código de la función.
     * @return Función encontrada o null si no existe.
     */
    public Funcion buscarFuncion(String codigo) {
        Funcion funcionEncontrada = null;
        for (Funcion funcion : listFunciones) {
            if (funcion.getCodigo().equals(codigo)) {
                funcionEncontrada = funcion;
                break;
            }
        }
        return funcionEncontrada;
    }

    /**
     * Calcula los ingresos totales del circo a partir de las compras registradas.
     * @return Ingresos totales del circo.
     */
    public double calcularIngresosTotales() {
        double total = 0;
        for (CompraBoleta compra : listCompraBoletas) {
            total += compra.getCostoTotal();
        }
        return total;
    }

    /**
     * Obtiene la función con mayor duración total.
     * @return Función con mayor duración o null si no hay funciones registradas.
     */
    public Funcion obtenerFuncionConMayorDuracion() {
        Funcion funcionMayor = null;
        int mayorDuracion = -1;
        for (Funcion funcion : listFunciones) {
            int duracionActual = funcion.calcularDuracionTotal();

            if (duracionActual > mayorDuracion) {
                mayorDuracion = duracionActual;
                funcionMayor = funcion;
            }
        }
        return funcionMayor;
    }

    // Punto 3-A: (1.0 pts) Implemente un método que permita consultar todos los actos realizados
    //  por un artista específico, identificado por su cédula.
    public ArrayList<Acto> buscarActosDeArtista(String cedulaArtista) {
        ArrayList<Acto> actos = new ArrayList<>();
        for (Funcion funcion : listFunciones) {
            for (Acto acto : funcion.getListActos()) {
                if (acto.getArtista().getCedula().equals(cedulaArtista)) {
                    actos.add(acto);
                }
            }
        }
        return actos;
    }

    // Punto 3-B: (1.0 pts) Implemente un método que permita identificar el artista que más ingresos ha generado en el
    // circo, a partir del valor acumulado de las boletas vendidas en los actos o funciones en las que participa.
    public Artista obtenerArtistaConMayorIngresoGenerado() {
        Artista artistaMayorIngreso = null;
        double mayorIngreso = -1;
        for (Artista artista : listArtistas) {
            double ingresoActual = calcularIngresoDeArtista(artista.getCedula());
            if (ingresoActual > mayorIngreso) {
                mayorIngreso = ingresoActual;
                artistaMayorIngreso = artista;
            }
        }
        return artistaMayorIngreso;
    }

    /**
     * Calcula el ingreso total generado por un artista en las funciones
     * en las que participa.
     * @param cedulaArtista Cédula del artista.
     * @return Ingreso total generado por el artista.
     */
    public double calcularIngresoDeArtista(String cedulaArtista) {
        double ingresoTotal = 0;
        for (CompraBoleta compra : listCompraBoletas) {
            if (artistaParticipaEnFuncion(cedulaArtista, compra.getFunciones())) {
                ingresoTotal += compra.getCostoTotal();
            }
        }
        return ingresoTotal;
    }

    /**
     * Verifica si un artista participa en una función.
     * @param cedulaArtista Cédula del artista.
     * @param funcion Función a evaluar.
     * @return true si el artista participa en la función, false en caso contrario.
     */
    public boolean artistaParticipaEnFuncion(String cedulaArtista, Funcion funcion) {
        boolean participa = false;
        for (Acto acto : funcion.getListActos()) {
            if (acto.getArtista().getCedula().equals(cedulaArtista)) {
                participa = true;
                break;
            }
        }
        return participa;
    }

    /**
     * Lista las compras realizadas por un cliente según su cédula.
     * @param cedulaCliente Cédula del cliente.
     * @return Cadena con las compras del cliente o mensaje de no encontrado.
     */
    public String listarComprasDeCliente(String cedulaCliente) {
        String mensaje = "";
        Cliente cliente = buscarCliente(cedulaCliente);
        if (cliente == null) {
            mensaje = "No existe un cliente con esa cédula.";
        } else {
            mensaje = cliente.listarCompras();
        }
        return mensaje;
    }

    /**
     * Obtiene el nombre del circo.
     * @return Nombre del circo.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene la lista de artistas.
     * @return Lista de artistas.
     */
    public List<Artista> getListArtistas() {
        return listArtistas;
    }

    /**
     * Obtiene la lista de funciones.
     * @return Lista de funciones.
     */
    public List<Funcion> getListFunciones() {
        return listFunciones;
    }

    /**
     * Obtiene la lista de clientes.
     * @return Lista de clientes.
     */
    public List<Cliente> getListClientes() {
        return listClientes;
    }

    /**
     * Obtiene la lista de compras de boletas.
     * @return Lista de compras.
     */
    public List<CompraBoleta> getListCompraBoletas() {
        return listCompraBoletas;
    }

    /**
     * Obtiene la lista de actos.
     * @return Lista de actos.
     */
    public List<Acto> getListActos() {
        return listActos;
    }

}