/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paswordvalidator.tests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import passwordvalidator.entidades.Validador;

/**
 *
 * @author Jibda
 */
public class ValidadorTest {
    
    public ValidadorTest() {
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

    @Test
    public void deberiaValidar(){
        assertEquals(3, new Validador("cHiK4M0NSTERSINC*").validar(), 0);
        assertEquals(2, new Validador("mimamamemina*").validar(),0);
        assertEquals(1, new Validador("123_").validar(),0);
        assertEquals(0, new Validador("123456").validar(),0);
    }
}
