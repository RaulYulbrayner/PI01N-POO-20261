package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;

public class Inventario {

    private List<Producto> productos;

    /**
     * Constructor del inventario.
     */
    public Inventario() {
        productos = new ArrayList<>();
    }

    /**
     * Agrega un producto al inventario.
     * @param p producto a agregar
     */
    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    /**
     * Verifica si un producto está disponible.
     * @param nombreProducto nombre del producto
     * @return true si está disponible
     */
    public boolean verificarDisponibilidad(String nombreProducto) {
        for (Producto p : productos) {
            if (p.getNombre().equals(nombreProducto) && p.isDisponible()) {
                return true;
            }
        }
        return false;
    }

    public List<Producto> getProductos() {
        return productos;
    }
}
