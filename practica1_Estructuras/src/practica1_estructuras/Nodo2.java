/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_estructuras;

/**
 *
 * @author Randolph
 */
public class Nodo2 {
    
    private ListaSimple1 valor;
    private Nodo2 siguiente;
    
    
    public void Nodo2(){
        this.setValor(null);
        this.setSiguiente(null);
    }

    /**
     * @return the valor
     */
    public ListaSimple1 getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(ListaSimple1 valor) {
        this.valor = valor;
    }

    /**
     * @return the siguiente
     */
    public Nodo2 getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(Nodo2 siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
