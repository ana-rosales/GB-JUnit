
package taskmanager.tests;

import java.util.Scanner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import taskmanager.entidades.AdministradorTareas;
import taskmanager.entidades.Tarea;

/**
 *
 * @author Ana Paula
 */
public class AdministradorTareasTests {
    private static AdministradorTareas lista;
    private static Tarea current;
    
    public AdministradorTareasTests() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        lista = new AdministradorTareas("TO DO GLOBANT");
        current = new Tarea("Hacer cama.");
    }
    
    @AfterClass
    public static void tearDownClass() {
        lista = null;
        current = null;
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Escribe pruebas unitarias para verificar que el gestor de tareas realiza
     * las operaciones correctamente, como agregar una tarea, eliminar una tarea
     * existente y listar las tareas disponibles.
     */
    @Test
    public void deberiaAgregar(){
        assertNotNull(lista.agregar(current));
    }
    
    @Test
    public void deberiaEliminar(){
        lista.agregar(current);
        assertNotNull(lista.getLista().get(current.getNumero()));
        lista.eliminar(current.getNumero());
        assertFalse(lista.getLista().contains(current));
    }
}
