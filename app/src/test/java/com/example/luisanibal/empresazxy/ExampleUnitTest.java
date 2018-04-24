package com.example.luisanibal.empresazxy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void sumar_calzado(){
        String a="nike", b="puma",c="adidas";
        int d = 2;

        assertEquals(240000, Metodos.ZapatillaHombre(a,d),0);
        assertEquals(260000, Metodos.ZapatillaHombre(b,d),0);
       assertEquals(280000, Metodos.ZapatillaHombre(c,d),0);

       assertEquals(100000, Metodos.ClasicoHombre(a,d),0);
        assertEquals(160000, Metodos.ClasicoHombre(c,d),0);
        assertEquals(200000, Metodos.ClasicoHombre(b,d),0);

        assertEquals(200000, Metodos.ZapatillaMujer(a,d),0);
        assertEquals(220000, Metodos.ZapatillaMujer(b,d),0);
        assertEquals(260000, Metodos.ZapatillaMujer(c,d),0);

        assertEquals(120000, Metodos.ClasicoMujer(a,d),0);
        assertEquals(140000, Metodos.ClasicoMujer(c,d),0);
        assertEquals(240000, Metodos.ClasicoMujer(b,d),0);
    }
}
