
package fechas.tests;

import fechas.entidades.DateValidator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Escribe pruebas unitarias para asegurarte de que el validador de fechas
 * detecte correctamente fechas válidas e inválidas, teniendo en cuenta
 * diferentes casos, como años bisiestos.
 * 
 * @author Ana Pau
 */
public class DateValidatorTests {
    
    public DateValidatorTests() {
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
     * Escribe pruebas unitarias para asegurarte de que el validador de fechas
     * detecte correctamente fechas válidas e inválidas, teniendo en cuenta
     * diferentes casos, como años bisiestos.
     */
    
    @Test
    public void deberiaValidarFechas(){
        assertTrue(new DateValidator("16/11/2003").isValida());
        assertTrue(new DateValidator("29/02/2000").isValida());
        
    }
}
