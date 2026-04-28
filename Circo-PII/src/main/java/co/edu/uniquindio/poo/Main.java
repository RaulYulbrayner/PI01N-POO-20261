package co.edu.uniquindio.poo;

import co.edu.uniquindio.poo.model.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

/**
 * Clase principal para probar el funcionamiento del sistema del circo.
 */
public class Main {

    /**
     * Método principal del programa.
     *
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {

        Circo circo = new Circo("Circo Estrella Mágica");

        Payaso payaso1 = new Payaso(
                "Raúl Gasca",
                "1010",
                "Calle 1",
                "3001111111",
                "Humor infantil",
                3
        );

        Malabarista malabarista1 = new Malabarista(
                "Luna Manos Ágiles",
                "2020",
                "Carrera 2",
                "3002222222",
                6
        );

        Acrobata acrobata1 = new Acrobata(
                "Marco Vuelo",
                "3030",
                "Avenida 3",
                "3003333333",
                5,
                "Trapecio"
        );

        Mago mago1 = new Mago(
                "Orion Ilusión",
                "4040",
                "Diagonal 4",
                "3004444444",
                4
        );

        circo.agregarArtista(payaso1);
        circo.agregarArtista(malabarista1);
        circo.agregarArtista(acrobata1);
        circo.agregarArtista(mago1);

        Acto acto1 = new Acto("A1", "Risas para niños", 20, TipoActo.PAYASOS, payaso1);
        Acto acto2 = new Acto("A2", "Malabares con fuego", 15, TipoActo.MALABARES, malabarista1);
        Acto acto3 = new Acto("A3", "Vuelo extremo", 25, TipoActo.ACROBACIAS, acrobata1);
        Acto acto4 = new Acto("A4", "Sombras mágicas", 18, TipoActo.MAGIA, mago1);

        Funcion funcion1 = new Funcion(
                "F001",
                "Función Familiar",
                LocalDate.of(2026, 4, 25),
                LocalTime.of(18, 0),
                TipoFuncion.INFANTIL,
                100
        );

        funcion1.agregarActo(acto1);
        funcion1.agregarActo(acto2);
        funcion1.agregarActo(acto3);
        funcion1.agregarActo(acto4);

        circo.agregarFuncion(funcion1);

        Cliente cliente1 = new Cliente(
                "Laura Gómez",
                "9090",
                "Barrio El Bosque",
                "3115556677",
                "cliente1@correo.com",
                LocalDate.of(2000, 8, 10)
        );

        circo.agregarCliente(cliente1);

        CompraBoleta compra1 = new CompraBoleta(
                "CB001",
                LocalDate.now(),
                cliente1,
                funcion1,
                TipoBoleta.VIP,
                3
        );

        boolean compraRegistrada = circo.registrarCompra(compra1);

        System.out.println("=== INFORMACIÓN DE LOS ARTISTAS ===");
        System.out.println(payaso1.mostrarInformacion());
        System.out.println("---------------------------");
        System.out.println(malabarista1.mostrarInformacion());
        System.out.println("---------------------------");
        System.out.println(acrobata1.mostrarInformacion());
        System.out.println("---------------------------");
        System.out.println(mago1.mostrarInformacion());

        System.out.println("\n=== INFORMACIÓN DE LA FUNCIÓN ===");
        System.out.println(funcion1.mostrarInformacionFuncion());

        System.out.println("\n=== ACTOS DE LA FUNCIÓN ===");
        System.out.println(funcion1.listarActos());

        System.out.println("\n=== INFORMACIÓN DEL CLIENTE ===");
        System.out.println(cliente1.mostrarInformacionCliente());

        System.out.println("\n=== RESULTADO DE LA COMPRA ===");
        if (compraRegistrada) {
            System.out.println(compra1.mostrarResumenCompra());
        } else {
            System.out.println("No fue posible registrar la compra por falta de disponibilidad.");
        }

        System.out.println("\n=== CONSULTA DE ACTOS DE UN ARTISTA ===");
        ArrayList<Acto> actosDelArtista = circo.buscarActosDeArtista("1010");
        for (Acto acto : actosDelArtista) {
            System.out.println(acto.mostrarInformacionActo());
            System.out.println("----------------------");
        }

        System.out.println("\n=== CONSULTAS ADICIONALES ===");
        System.out.println("Total gastado por el cliente: $" + cliente1.calcularTotalGastado());
        System.out.println("Ingresos totales del circo: $" + circo.calcularIngresosTotales());

        Funcion funcionMayor = circo.obtenerFuncionConMayorDuracion();
        if (funcionMayor != null) {
            System.out.println("Función con mayor duración: " + funcionMayor.getNombre()
                    + " (" + funcionMayor.calcularDuracionTotal() + " minutos)");
        }

        System.out.println("\n=== ARTISTA CON MAYOR INGRESO GENERADO ===");
        Artista artistaMayor = circo.obtenerArtistaConMayorIngresoGenerado();
        if (artistaMayor != null) {
            System.out.println("Artista que más ingresos ha generado: " + artistaMayor.getNombre());
        }
    }
}
