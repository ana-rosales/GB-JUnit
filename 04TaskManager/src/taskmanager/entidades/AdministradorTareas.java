
package taskmanager.entidades;

import java.util.ArrayList;

/**
 * Crea una clase TaskManager que permita agregar, eliminar y listar tareas.
 * 
 * @author Ana Paula
 */
public class AdministradorTareas {
    //titulo de la lista
    //la lista
    private String titulo;
    private ArrayList<Tarea> lista = new ArrayList<>();

    public AdministradorTareas(String titulo) {
        this.titulo = titulo;
    }

    public AdministradorTareas() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<Tarea> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Tarea> lista) {
        this.lista = lista;
    }
    
    //agregar, eliminar, mostrar
    public Tarea agregar(Tarea current){
        lista.add(current);
        int indice = lista.indexOf(current);
        lista.get(indice).setNumero(indice);
        return current;
    }
    
    public void eliminar(int indice){
        lista.removeIf(tarea -> tarea.getNumero() == indice);
    }
    
    public void mostrar(){
        System.out.println("Lista: " + titulo);
        for (Tarea tarea : lista) {
            System.out.println(tarea.getNumero() + ".- " + tarea.getTexto() + ".");
        }
    }
    
    
}
