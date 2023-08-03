/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountcalculator.test;

import discountcalculator.entidades.CalculadoraDescuentos;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jibda
 */
public class CalculadoraDescuentosTest {
    
    public CalculadoraDescuentosTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Escribe pruebas unitarias para verificar que el cálculo del descuento se
     * realiza correctamente para diferentes escenarios (por ejemplo, descuento
     * del 10%, descuento máximo, sin descuento, etc.).
     */
    
    @Test
    public void deberiaDescontar(){
        assertEquals(90, new CalculadoraDescuentos(100,10).calcularDescuento(), 0);
        assertEquals(0, new CalculadoraDescuentos(2000, 100).calcularDescuento(), 0);
        assertEquals(525, new CalculadoraDescuentos(525, 0).calcularDescuento(), 0);
    }
}
