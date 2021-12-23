package B03.Problema1;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
        
        Persona p1= new Persona(true,true,true,false,false);
        Persona p2= new Persona(false,false,false,true,true);
        Espacio e1 = new Espacio(true, false);
        Espacio e2 = new Espacio(false, true);
        Metereologia m1 = new Metereologia(-7, 8, true, true, true);
        Metereologia m2 = new Metereologia(-7, 8, false, false, true);
        Metereologia m3 = new Metereologia(12, 12, true, true, true);
        Metereologia m4 = new Metereologia(18, 20, false, true, false);
        Metereologia m5 = new Metereologia(27, 12, false, true, true);
        Metereologia m6 = new Metereologia(32, 12, false, true, true);
        Metereologia m7 = new Metereologia(33, 12, false, true, true);
        Metereologia m8 = new Metereologia(38, 12, false, true, true);
        Metereologia m9 = new Metereologia(40, 12, false, true, true);
        
        Principal.recomendarActividad(p1, e1, m1);
        Principal.recomendarActividad(p2, e1, m1);
        Principal.recomendarActividad(p2, e2, m2);
        Principal.recomendarActividad(p2, e2, m3);
        Principal.recomendarActividad(p2, e1, m4);
        Principal.recomendarActividad(p2, e2, m5);
        Principal.recomendarActividad(p2, e1, m6);
        Principal.recomendarActividad(p2, e2, m7);
        Principal.recomendarActividad(p2, e1, m8);
        Principal.recomendarActividad(p2, e2, m9);
        
    }
}
