package co.edu.uniquindio.poo.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Representa una función del circo.
 * Una función puede contener varios actos y manejar disponibilidad de boletas.
 */
public class Funcion {

    private String codigo;
    private String nombre;
    private LocalDate fecha;
    private LocalTime hora;
    private TipoFuncion tipoFuncion;
    private List<Acto> listActos;
    private int capacidad;
    private int boletasDisponibles;

    /**
     * Construye una función con sus datos principales.
     * @param codigo Código de la función.
     * @param nombre Nombre de la función.
     * @param fecha Fecha de la función.
     * @param hora Hora de la función.
     * @param tipoFuncion Tipo de función.
     * @param capacidad Capacidad máxima de boletas.
     */
    public Funcion(String codigo, String nombre, LocalDate fecha, LocalTime hora,
                   TipoFuncion tipoFuncion, int capacidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.fecha = fecha;
        this.hora = hora;
        this.tipoFuncion = tipoFuncion;
        this.capacidad = capacidad;
        this.boletasDisponibles = capacidad;
        this.listActos = new ArrayList<>();
    }

    /**
     * Agrega un acto a la función.
     * @param acto Acto a agregar.
     */
    public void agregarActo(Acto acto) {
        listActos.add(acto);
    }

    /**
     * Elimina un acto de la función según su código.
     * @param codigoActo Código del acto a eliminar.
     * @return true si el acto fue eliminado, false en caso contrario.
     */
    public boolean eliminarActo(String codigoActo) {
        boolean eliminado = false;

        for (int i = 0; i < listActos.size() && !eliminado; i++) {
            if (listActos.get(i).getCodigo().equals(codigoActo)) {
                listActos.remove(i);
                eliminado = true;
            }
        }

        return eliminado;
    }

    /**
     * Busca un acto por su código.
     * @param codigoActo Código del acto a buscar.
     * @return Acto encontrado o null si no existe.
     */
    public Acto buscarActo(String codigoActo) {
        Acto actoEncontrado = null;
        for (Acto acto : listActos) {
            if (acto.getCodigo().equals(codigoActo)) {
                actoEncontrado = acto;
                break;
            }
        }
        return actoEncontrado;
    }

    /**
     * Lista todos los actos asociados a la función.
     * @return Cadena con el detalle de los actos.
     */
    public String listarActos() {
        String mensaje = "";
        if (listActos.isEmpty()) {
            mensaje = "La función no tiene actos registrados.";
        } else {
            for (Acto acto : listActos) {
                mensaje += acto.mostrarInformacionActo() + "\n------------------\n";
            }
        }
        return mensaje;
    }

    /**
     * Calcula la duración total de la función sumando la duración de todos sus actos.
     * @return Duración total en minutos.
     */
    public int calcularDuracionTotal() {
        int total = 0;
        for (Acto acto : listActos) {
            total += acto.getDuracionMinutos();
        }
        return total;
    }

    /**
     * Obtiene el precio base de una boleta según el tipo de función.
     * @return Precio base de la función.
     */
    public double obtenerPrecioBase() {
        double precioBase = 0;

        switch (tipoFuncion) {
            case INFANTIL:
                precioBase = 20000;
                break;
            case NOCTURNA:
                precioBase = 35000;
                break;
            case ESPECIAL:
                precioBase = 50000;
                break;
        }
        return precioBase;
    }

    /**
     * Verifica si existe disponibilidad de boletas para una cantidad dada.
     * @param cantidad Cantidad de boletas solicitadas.
     * @return true si hay disponibilidad, false en caso contrario.
     */
    public boolean hayBoletasDisponibles(int cantidad) {
        return boletasDisponibles >= cantidad;
    }

    /**
     * Disminuye la cantidad de boletas disponibles si hay suficiente disponibilidad.
     * @param cantidad Cantidad de boletas a descontar.
     * @return true si se descontaron, false en caso contrario.
     */
    public boolean disminuirBoletasDisponibles(int cantidad) {
        boolean resultado = false;

        if (hayBoletasDisponibles(cantidad)) {
            boletasDisponibles -= cantidad;
            resultado = true;
        }
        return resultado;
    }

    /**
     * Aumenta la cantidad de boletas disponibles.
     * @param cantidad Cantidad de boletas a reintegrar.
     */
    public void aumentarBoletasDisponibles(int cantidad) {
        boletasDisponibles += cantidad;

        if (boletasDisponibles > capacidad) {
            boletasDisponibles = capacidad;
        }
    }

    /**
     * Retorna la información general de la función.
     * @return Cadena con la información de la función.
     */
    public String mostrarInformacionFuncion() {
        return "Código: " + codigo +
                "\nNombre: " + nombre +
                "\nFecha: " + fecha +
                "\nHora: " + hora +
                "\nTipo de función: " + tipoFuncion +
                "\nCapacidad: " + capacidad +
                "\nBoletas disponibles: " + boletasDisponibles +
                "\nDuración total: " + calcularDuracionTotal() + " minutos";
    }

    /**
     * Obtiene el código de la función.
     * @return Código de la función.
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Obtiene el nombre de la función.
     * @return Nombre de la función.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene la fecha de la función.
     * @return Fecha de la función.
     */
    public LocalDate getFecha() {
        return fecha;
    }

    /**
     * Obtiene la hora de la función.
     * @return Hora de la función.
     */
    public LocalTime getHora() {
        return hora;
    }

    /**
     * Obtiene el tipo de función.
     * @return Tipo de función.
     */
    public TipoFuncion getTipoFuncion() {
        return tipoFuncion;
    }

    /**
     * Obtiene la lista de actos de la función.
     * @return Lista de actos.
     */
    public List<Acto> getListActos() {
        return listActos;
    }

    /**
     * Obtiene la capacidad de la función.
     * @return Capacidad máxima.
     */
    public int getCapacidad() {
        return capacidad;
    }

    /**
     * Obtiene la cantidad de boletas disponibles.
     * @return Cantidad de boletas disponibles.
     */
    public int getBoletasDisponibles() {
        return boletasDisponibles;
    }
}