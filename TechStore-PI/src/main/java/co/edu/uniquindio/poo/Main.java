package co.edu.uniquindio.poo;

import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.Tienda;

/**
 * Clase principal para probar el funcionamiento del sistema TechStore.
 */
public class Main {

    public static void main(String[] args) {

        Tienda tienda = new Tienda(
                "TechStore",
                "900123456",
                "Armenia",
                "www.techstore.com"
        );

        System.out.println("===== REGISTRO CLIENTES =====");

        System.out.println(
                tienda.crearCliente(
                        "Carlos Perez",
                        "123",
                        "312000000",
                        "carlos@gmail.com",
                        "Armenia"
                )
        );

        System.out.println(
                tienda.crearCliente(
                        "Laura Martinez",
                        "456",
                        "311111111",
                        "laura@gmail.com",
                        "Pereira"
                )
        );


        System.out.println("\n===== REGISTRO PRODUCTOS =====");

        System.out.println(
                tienda.crearProducto(
                        "P01",
                        "Laptop Lenovo",
                        3500000,
                        "Computadores",
                        true
                )
        );

        System.out.println(
                tienda.crearProducto(
                        "P02",
                        "Mouse Logitech",
                        80000,
                        "Accesorios",
                        true
                )
        );


        System.out.println("\n===== CREAR COMPRA =====");

        // Obtener cliente
        Cliente cliente = tienda.obtenerCliente("123");

        if (cliente != null) {

            System.out.println(
                    tienda.crearCompra(
                            "C01",
                            "Tarjeta de credito",
                            cliente
                    )
            );

        } else {
            System.out.println("El cliente no existe");
        }


        System.out.println("\n===== AGREGAR PRODUCTOS A COMPRA =====");

        System.out.println(
                tienda.agregarProductoCompra(
                        "C01",
                        "P01"
                )
        );

        System.out.println(
                tienda.agregarProductoCompra(
                        "C01",
                        "P02"
                )
        );


        System.out.println("\n===== CREAR ENVIO =====");

        System.out.println(
                tienda.crearEnvio(
                        "C01",
                        "E01",
                        "Armenia",
                        2.5,
                        "Envio express"
                )
        );


        System.out.println("\n===== TOTAL COMPRA =====");

        double total = tienda.calcularTotalCompra("C01");

        System.out.println("Total de la compra: $" + total);
    }
}