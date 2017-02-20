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
public class NodoCircular {
    
        private  ListaSimple valorLista;
    private String valorString;
    private NodoCircular siguiente;
    
    public void NodoCircular(){
       
        this.setValorLista(null);
        this.setValorString(null);
     }

    /**
     * @return the valorLista
     */
    public ListaSimple getValorLista() {
        return valorLista;
    }

    /**
     * @param valorLista the valorLista to set
     */
    public void setValorLista(ListaSimple valorLista) {
        this.valorLista = valorLista;
    }

    /**
     * @return the valorString
     */
    public String getValorString() {
        return valorString;
    }

    /**
     * @param valorString the valorString to set
     */
    public void setValorString(String valorString) {
        this.valorString = valorString;
    }

    /**
     * @return the siguiente
     */
    public NodoCircular getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoCircular siguiente) {
        this.siguiente = siguiente;
    }
    
}
