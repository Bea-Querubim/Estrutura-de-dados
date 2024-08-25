package testePOO;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import aulas.POO.Compra;


//fazendo testes unitarios

public class TesteCompra {

    @Test
    public void compraAVista() {
        Compra c = new Compra(500);
        assertEquals(1, c.getNumeroParcelas());
        assertEquals(500, c.getValorTotal());
        assertEquals(500, c.getValorParcela());
    }

    @Test
    public void compraAPrazo() {
        Compra c1 = new Compra(4,250);
        assertEquals(4, c1.getNumeroParcelas());
        assertEquals(1000, c1.getValorTotal());
        assertEquals(250, c1.getValorParcela());
    }
}