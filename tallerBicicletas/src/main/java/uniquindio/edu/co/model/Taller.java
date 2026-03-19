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

    // ------------------ CRUD CLIENTE ------------------

    /**
     * Crea un nuevo cliente y lo agrega a la lista de clientes.
     * @param nombre Nombre del cliente.
     * @param telefono Teléfono del cliente.
     * @param email Email del cliente.
     * @param cedula Cédula del cliente.
     * @return Mensaje indicando el resultado de la operación.
     */
    public String crearCliente(String nombre, int telefono, String email, String cedula){
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

    /**
     * Verifica si existe un cliente en el taller según la cédula.
     * @param cedula Cédula del cliente a buscar.
     * @return true si el cliente existe, false si no.
     */
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

    /**
     * Obtiene un cliente según la cédula.
     * @param cedula Cédula del cliente a buscar.
     * @return El cliente encontrado o null si no existe.
     */
    public Cliente obtenerCliente(String cedula){
        Cliente encontrado = null;
        for(Cliente cl : listClientes){
            if(cl.getCedula().equals(cedula)){
                encontrado = cl;
                break;
            }
        }
        return encontrado;
    }

    /**
     * Actualiza los datos de un cliente.
     * @param cedula Cédula del cliente a actualizar.
     * @param nuevoNombre Nuevo nombre del cliente.
     * @param nuevoTelefono Nuevo teléfono del cliente.
     * @param nuevoEmail Nuevo email del cliente.
     * @return Mensaje indicando el resultado de la operación.
     */
    public String actualizarCliente(String cedula, String nuevoNombre, int nuevoTelefono, String nuevoEmail){
        String respuesta;
        Cliente cl = obtenerCliente(cedula);
        if(cl == null){
            respuesta = "Cliente no encontrado";
        }else{
            cl.setNombre(nuevoNombre);
            cl.setTelefono(nuevoTelefono);
            cl.setEmail(nuevoEmail);
            respuesta = "Cliente actualizado correctamente";
        }
        return respuesta;
    }

    /**
     * Elimina un cliente según la cédula.
     * @param cedula Cédula del cliente a eliminar.
     * @return Mensaje indicando el resultado de la operación.
     */
    public String eliminarCliente(String cedula){
        String respuesta;
        Cliente cliente = obtenerCliente(cedula);
        if(cliente == null){
            respuesta = "Cliente no encontrado";
        }else{
            listClientes.remove(cliente);
            respuesta = "Cliente eliminado correctamente";
        }
        return respuesta;
    }


    // ------------------ CRUD MECANICO ------------------

    /**
     * Crea un nuevo mecánico y lo agrega a la lista de mecánicos.
     * @param nombre Nombre del mecánico.
     * @param cedula Cédula del mecánico.
     * @param nivel Nivel del mecánico.
     * @param telefono Teléfono del mecánico.
     * @param tarea Tarea asignada al mecánico.
     * @return Mensaje indicando el resultado de la operación.
     */
    public String crearMecanico(String nombre, String cedula, String nivel, String telefono, String tarea){
        String respuesta = "";
        if(buscarMecanico(cedula)){
            respuesta = "El mecanico ya existe con esa cedula";
        }else{
            Mecanico mecanicoNuevo = new Mecanico(nombre, cedula, nivel, telefono, tarea);
            listMecanicos.add(mecanicoNuevo);
            respuesta = "El mecanico " + mecanicoNuevo.getNombre() + " se registro exitosamente";
        }
        return respuesta;
    }

    /**
     * Verifica si un mecánico ya está registrado según la cédula.
     * @param cedula Cédula del mecánico a buscar.
     * @return true si el mecánico existe, false si no.
     */
    public boolean buscarMecanico(String cedula){
        for(Mecanico m : listMecanicos){
            if(m.getCedula().equals(cedula)){
                return true;
            }
        }
        return false;
    }

    /**
     * Obtiene un mecánico según la cédula.
     * @param cedula Cédula del mecánico a buscar.
     * @return El mecánico encontrado o null si no existe.
     */
    public Mecanico obtenerMecanico(String cedula){
        for(Mecanico m : listMecanicos){
            if(m.getCedula().equals(cedula)){
                return m;
            }
        }
        return null;
    }

    /**
     * Actualiza los datos de un mecanico.
     * @param cedula del mecanico a actualizar.
     * @param nuevoNombre del mecanico a actualizar.
     * @param nuevoNivel del mecanico a actualizar.
     * @param nuevoTelefono del mecanico a actualizar.
     * @param nuevaTarea del mecanico a actualizar.
     * @return Mensaje indicando el resultado de la operación.
     */
    public String actualizarMecanico(String cedula, String nuevoNombre, String nuevoNivel, String nuevoTelefono, String nuevaTarea){
        String respuesta;
        Mecanico mecanico = obtenerMecanico(cedula);
        if(mecanico == null){
            respuesta = "Mecanico no encontrado";
        }else{
            mecanico.setNombre(nuevoNombre);
            mecanico.setNivelMecanico(nuevoNivel);
            mecanico.setTelefono(nuevoTelefono);
            mecanico.setTarea(nuevaTarea);
            respuesta = "Mecanico actualizado correctamente";
        }
        return respuesta;
    }

    /**
     * Elimina un mecánico según la cédula.
     * @param cedula Cédula del mecánico a eliminar.
     * @return Mensaje indicando el resultado de la operación.
     */
    public String eliminarMecanico(String cedula){
        String respuesta;
        Mecanico mecanico = obtenerMecanico(cedula);
        if(mecanico == null){
            respuesta = "Mecanico no encontrado";
        }else{
            listMecanicos.remove(mecanico);
            respuesta = "Mecanico eliminado correctamente";
        }
        return respuesta;
    }

    // ------------------ CRUD BICICLETA ------------------

    /**
     * Crea una nueva bicicleta y la agrega a la lista de bicicletas.
     * @param marca de la bicicleta.
     * @param color de la bicicleta.
     * @param numChasis de la bicicleta.
     * @param tipoBicicleta de la bicicleta.
     * @return Mensaje indicando el resultado de la operación.
     */
    public String crearBicicleta(String marca, String color, String numChasis, String tipoBicicleta, String cedulaCliente) {
        String respuesta;
        Cliente cliente = obtenerCliente(cedulaCliente);
        if (cliente == null) {
            respuesta = "Cliente no encontrado.";
        } else {
            Bicicleta bicicletaNueva = new Bicicleta(marca, color, numChasis, tipoBicicleta);
            cliente.asignarBicicleta(bicicletaNueva);
            listBicicletas.add(bicicletaNueva);
            respuesta = "Bicicleta registrada exitosamente y asignada al cliente.";
        }
        return respuesta;
    }

    /**
     * Verifica si una bicicleta ya está registrado según el numero de chasis.
     * @param numChasis de la bicicleta a buscar.
     * @return true si la bicicleta existe, false si no.
     */
    public boolean buscarBicicleta(String numChasis){
        for(Bicicleta bicicleta : listBicicletas){
            if(bicicleta.getNumChasis().equals(numChasis)){
                return true;
            }
        }
        return false;
    }

    /**
     * Obtiene una bicicleta según el numero de chasis.
     * @param numChasis de la bicicleta a obtener
     * @return La bicicleta encontrada o null si no existe.
     */
    public Bicicleta obtenerBicicleta(String numChasis){
        for(Bicicleta bicicleta : listBicicletas){
            if(bicicleta.getNumChasis().equals(numChasis)){
                return bicicleta;
            }
        }
        return null;
    }

    /**
     * Actualiza los datos de una bicicleta.
     * @param nuevaMarca de la bicicleta a actualizar.
     * @param nuevoColor de la bicicleta a actualizar.
     * @param numChasis de la bicicleta a actualizar.
     * @param nuevoTipoBicicleta de la bicicleta a actualizar.
     * @return Mensaje indicando el resultado de la operación.
     */
    public String actualizarBicicleta(String nuevaMarca, String nuevoColor, String numChasis, String nuevoTipoBicicleta){
        String respuesta;
        Bicicleta bicicleta = obtenerBicicleta(numChasis);
        if(bicicleta == null){
            respuesta = "Bicicleta no encontrada";
        }else{
            bicicleta.setMarca(nuevaMarca);
            bicicleta.setColor(nuevoColor);
            bicicleta.setTipoBicicleta(nuevoTipoBicicleta);
            respuesta = "Bicicleta actualizada correctamente";
        }
        return respuesta;
    }

    /**
     * Elimina una bicicleta según el numero de chasis.
     * @param numChasis de la bicicleta a eliminar.
     * @return Mensaje indicando el resultado de la operación.
     */
    public String eliminarBicicleta(String numChasis){
        String respuesta;
        Bicicleta bicicleta = obtenerBicicleta(numChasis);
        if(bicicleta == null){
            respuesta = "Bicicleta no encontrada";
        }else{
            listBicicletas.remove(bicicleta);
            respuesta = "Bicicleta eliminada correctamente";
        }
        return respuesta;
    }

    // ------------------ CRUD ORDEN SERVICIO ------------------
    /**
     * Crea una nueva orden de servicio y la asigna a un cliente, bicicleta y mecánico.
     * @param idOrden ID de la orden de servicio.
     * @param descripcion Descripción del servicio.
     * @param estado Estado de la orden.
     * @param fechaIngreso Fecha de ingreso de la orden.
     * @param manoObra Costo de mano de obra.
     * @param cedulaCliente Cédula del cliente.
     * @param chasisBicicleta Número de chasis de la bicicleta.
     * @param cedulaMecanico Cédula del mecánico.
     * @param idsRepuestos Lista de IDs de repuestos.
     * @return Mensaje indicando el resultado de la operación.
     */
    public String crearOrdenServicio(int idOrden, String descripcion, String estado, String fechaIngreso, double manoObra,
                                     String cedulaCliente, String chasisBicicleta, String cedulaMecanico,
                                     List<Integer> idsRepuestos) {

        Cliente cliente = obtenerCliente(cedulaCliente);
        Bicicleta bicicleta = obtenerBicicleta(chasisBicicleta);
        Mecanico mecanico = obtenerMecanico(cedulaMecanico);

        if(cliente == null || bicicleta == null || mecanico == null){
            return "Cliente, bicicleta o mecánico no encontrado";
        }

        OrdenServicio orden = new OrdenServicio(descripcion, estado, fechaIngreso, idOrden, manoObra, cliente, bicicleta, mecanico);

        for(Integer id : idsRepuestos){
            Repuesto repuesto = obtenerRepuesto(id);
            if(repuesto != null){
                orden.agregarRepuesto(repuesto);
            }
        }
        listOrdenes.add(orden);
        return "Orden de servicio creada exitosamente. Costo total: $" + orden.calcularCostoTotalOrden();
    }

    /**
     * Elimina una orden según el ID.
     * @param idOrden ID de la orden a eliminar.
     * @return Mensaje indicando el resultado de la operación.
     */
    public String eliminarOrden(int idOrden){
        OrdenServicio orden = obtenerOrden(idOrden);
        if(orden == null){
            return "Orden no encontrada";
        } else {
            listOrdenes.remove(orden);
            return "Orden eliminada correctamente";
        }
    }

    /**
     * Obtiene una orden de servicio según el ID.
     * @param idOrden ID de la orden a buscar.
     * @return La orden encontrada o null si no existe.
     */
    public OrdenServicio obtenerOrden(int idOrden){
        for(OrdenServicio o : listOrdenes){
            if(o.getIdOrdenServicio() == idOrden){
                return o;
            }
        }
        return null;
    }

    // ------------------ CRUD REPUESTO ------------------
    /**
     * Crea un nuevo repuesto y lo agrega a la lista de repuestos.
     * @param nombre Nombre del repuesto.
     * @param cantidad Cantidad disponible del repuesto.
     * @param costo Costo por unidad del repuesto.
     * @param idRepuesto ID del repuesto.
     * @return Mensaje indicando el resultado de la operación.
     */
    public String crearRepuesto(String nombre, int cantidad, double costo, int idRepuesto) {
        String respuesta = "";
        if(buscarRepuesto(idRepuesto)) {
            respuesta = "El repuesto ya existe con ese ID";
        } else {
            Repuesto repuestoNuevo = new Repuesto(nombre, cantidad, costo, idRepuesto);
            listRepuestos.add(repuestoNuevo);
            respuesta = "El repuesto " + repuestoNuevo.getNombre() + " se registró exitosamente";
        }
        return respuesta;
    }

    /**
     * Verifica si un repuesto ya existe en el taller según el ID.
     * @param idRepuesto ID del repuesto a buscar.
     * @return true si el repuesto existe, false si no.
     */
    public boolean buscarRepuesto(int idRepuesto) {
        for (Repuesto r : listRepuestos) {
            if (r.getIdRepuesto() == idRepuesto) {
                return true;
            }
        }
        return false;
    }

    /**
     * Obtiene un repuesto según su ID.
     * @param idRepuesto ID del repuesto a buscar.
     * @return El repuesto encontrado o null si no existe.
     */
    public Repuesto obtenerRepuesto(int idRepuesto) {
        for (Repuesto r : listRepuestos) {
            if (r.getIdRepuesto() == idRepuesto) {
                return r;
            }
        }
        return null;
    }

    /**
     * Actualiza los datos de un repuesto.
     * @param idRepuesto ID del repuesto a actualizar.
     * @param nuevoNombre Nuevo nombre del repuesto.
     * @param nuevaCantidad Nueva cantidad del repuesto.
     * @param nuevoCosto Nuevo costo del repuesto.
     * @return Mensaje indicando el resultado de la operación.
     */
    public String actualizarRepuesto(int idRepuesto, String nuevoNombre, int nuevaCantidad, double nuevoCosto) {
        Repuesto repuesto = obtenerRepuesto(idRepuesto);
        if (repuesto == null) {
            return "Repuesto no encontrado";
        } else {
            repuesto.setNombre(nuevoNombre);
            repuesto.setCantidad(nuevaCantidad);
            repuesto.setCosto(nuevoCosto);
            return "Repuesto actualizado correctamente";
        }
    }

    /**
     * Elimina un repuesto según su ID.
     * @param idRepuesto ID del repuesto a eliminar.
     * @return Mensaje indicando el resultado de la operación.
     */
    public String eliminarRepuesto(int idRepuesto) {
        Repuesto repuesto = obtenerRepuesto(idRepuesto);
        if (repuesto == null) {
            return "Repuesto no encontrado";
        } else {
            listRepuestos.remove(repuesto);
            return "Repuesto eliminado correctamente";
        }
    }

    /**
     * Lista todos los repuestos registrados en el taller.
     * @return Cadena con la lista de repuestos.
     */
    public String listarRepuestos() {
        StringBuilder lista = new StringBuilder("=== LISTA DE REPUESTOS ===\n");
        if (listRepuestos.isEmpty()) {
            lista.append("No hay repuestos registrados.\n");
        } else {
            for (Repuesto r : listRepuestos) {
                lista.append(r.toString()).append("\n");
            }
        }
        return lista.toString();
    }


    // ------------------ Metodos get

    public List<Cliente> getListClientes() {
        return listClientes;
    }

    public List<Mecanico> getListMecanicos() {
        return listMecanicos;
    }

    public List<Bicicleta> getListBicicletas() {
        return listBicicletas;
    }

    public List<Repuesto> getListRepuestos() {
        return listRepuestos;
    }

    public List<OrdenServicio> getListOrdenes() {
        return listOrdenes;
    }

    //PARCIAL 1

    /* 1. (0.75 pts) Implementa un método en la clase taller que, dado el número de teléfono de un
    mecánico, cuente cuántos dígitos pares (0, 2, 4, 6, 8) tiene el número de teléfono.*/
    public int contarDigitosParesMecanico(String telefono) {
        int contador = 0;
        for(int i = 0; i < telefono.length(); i++){
            int digito = Integer.parseInt(String.valueOf(telefono.charAt(i)));
            if(digito % 2 == 0){
                contador++;
            }
        }
        return contador;
    }

    /* 2. (0.75 pts) Implementar un método en la clase taller que, dado el número de teléfono de un cliente,
    determine si es un número perfecto. Nota: Un número perfecto es aquel que es igual a la suma
    de sus divisores propios (excluyendo el propio número). Por ejemplo, el número 6 es perfecto
    porque sus divisores son 1, 2 y 3, y 1 + 2 + 3 = 6. */
    public boolean esPerfecto(int numero){
        boolean esPerfecto = false;
        int suma = 0;
        for(int i = 1; i < numero; i++){
            if(numero % i == 0){
                suma = suma + i;
            }
        }
        if(suma == numero){
            esPerfecto = true;
        }
        return esPerfecto;
    }

    /* 3. (1.0 pts) Implementa un método en la clase Taller que recorra la lista de órdenes
    de servicio y acumule el costo total de todas las órdenes de servicio que fueron
    generadas en una fecha específica (por ejemplo, "12/03/2026"). El método debe
    retornar el costo total acumulado de las órdenes generadas en esa fecha.*/
    public double acumularCostoPorFecha(String fechaBuscada){
        double total = 0;
        for(OrdenServicio orden : listOrdenes){
            if(orden.getFechaIngreso().equals(fechaBuscada)){
                total += orden.calcularCostoTotalOrden();
            }
        }
        return total;
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
