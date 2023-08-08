
package temperatureconverter.tests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import temperatureconverter.endidades.Conversor;

/**
 * Escribe pruebas unitarias para asegurarte de que la conversión entre las
 * diferentes unidades se realiza correctamente y produce los resultados
 * esperados.
 * 
 * @author Ana Paula
 */
public class ConversorTest {
    
    public ConversorTest() {
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
    public void deberiaConvertirAKelvin(){
        assertEquals(274.15, new Conversor(1, "C").aKelvin(), 0.001);
        assertEquals(432.15, new Conversor(159, "C").aKelvin(), 0.001);
        assertEquals(-182.85, new Conversor(-456, "C").aKelvin(), 0.001);        
        assertEquals(255.928, new Conversor(1, "F").aKelvin(), 0.001);
        assertEquals(5810.928, new Conversor(10000, "F").aKelvin(), 0.001);
        assertEquals(250.372, new Conversor(-9, "F").aKelvin(), 0.001);
    }
    
    @Test
    public void deberiaConvertirAFarenheit(){
        assertEquals(33.8, new Conversor(1, "C").aFarenheit(), 0.001);
        assertEquals(318.2, new Conversor(159, "C").aFarenheit(), 0.001);
        assertEquals(-788.8, new Conversor(-456, "C").aFarenheit(), 0.001);        
        assertEquals(-457.87, new Conversor(1, "K").aFarenheit(), 0.001);
        assertEquals(17540.33, new Conversor(10000, "K").aFarenheit(), 0.001);
        assertEquals(-475.87, new Conversor(-9, "K").aFarenheit(), 0.001);
    }
    
    @Test
    public void deberiaConvertirACelsius(){
        assertEquals(-272.15, new Conversor(1, "K").aCelsius(), 0.001);
        assertEquals(-114.15, new Conversor(159, "K").aCelsius(), 0.001);
        assertEquals(-729.15, new Conversor(-456, "K").aCelsius(), 0.001);        
        assertEquals(-17.222, new Conversor(1, "F").aCelsius(), 0.001);
        assertEquals(5537.778, new Conversor(10000, "F").aCelsius(), 0.001);
        assertEquals(-22.778, new Conversor(-9, "F").aCelsius(), 0.001);
    }
}
