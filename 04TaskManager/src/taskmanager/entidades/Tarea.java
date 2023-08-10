
package taskmanager.entidades;

/**
 * Para instancias tipo tarea.
 * 
 * @author Ana Paula
 */
public class Tarea {
    //no
    //texto
    //completada
    private int numero;
    private String texto;
    private boolean completada;

    public Tarea() {
    }

    public Tarea(String texto) {
        this.texto = texto;
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }
    
}
