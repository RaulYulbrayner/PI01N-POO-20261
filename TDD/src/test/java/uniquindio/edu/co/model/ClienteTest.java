package uniquindio.edu.co.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    public void getNombre() {
        Cliente cliente = new Cliente("raul");
        assertEquals("raul", cliente.getNombre());
    }

    @Test
    public void contarVocalesTest(){
        Cliente cliente = new Cliente("raul");
        assertEquals(2, cliente.contarVocales(cliente.getNombre()));
    }

    @Test
    public void esCapicuoTest(){
        Cliente cliente = new Cliente("raul");
        assertTrue(cliente.esCapicuo(121));
    }

}