/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_estructuras;

import javax.swing.JOptionPane;

/**
 *
 * @author Randolph
 */
public class ListaSimple {

    private Nodo inicio;
    private int tamanio;

    public void ListaSimple() {
        inicio = null;
        tamanio = 0;
    }

    public boolean estaVacia() {
        return inicio == null;
    }

//Sirve para saber cuantos datos tiene la lista 
    public int getTamanio() {
        return tamanio;
    }

//Se agrega un nuevo nodo al final de la lista
    public void agregarFinalLista(String valor) {
        Nodo nuevo = new Nodo();
        nuevo.setValor(valor);

        if (estaVacia()) {
            inicio = nuevo;
        } else {
            Nodo aux = inicio;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
        tamanio++;
    }

    public void agregarInicioLista(String valor) {
        Nodo nuevo = new Nodo();
        nuevo.setValor(valor);

        if (estaVacia()) {
            inicio = nuevo;
        } else {
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }
        tamanio++;
    }

    //obtiene el valor del nodo en una determinada posicion 
    public String obtenerValorNodo(int posicion)  {
String valor = null;
        if (posicion >= 0 && posicion < tamanio) {
            if (posicion == 0) {
                valor= inicio.getValor();
            } else {
                Nodo aux = inicio;

                for (int i = 0; i < posicion; i++) {
                    aux = aux.getSiguiente();
                }
                valor =aux.getValor();
            }
        } else {
            JOptionPane.showMessageDialog(null, "La posicion que busca no es correcta");
            valor = null;
        }
        return valor;
    }

//metodo que sirve para consultar si existe el nodo en la lista 
    public boolean buscarNodo(String referencia) {
        Nodo aux = inicio;
        boolean nodoEncontrado = false;

        while (aux != null && nodoEncontrado != true) {
            if (referencia == aux.getValor()) {
                nodoEncontrado = true;
            } else {
                aux = aux.getSiguiente();
            }

        }
        return nodoEncontrado;
    }

//remueve el nodo si existe en la lista 
    public void removerPorReferencia(String referencia) {

        if (buscarNodo(referencia)) {
            if (inicio.getValor() == referencia) {
                inicio = inicio.getSiguiente();

            } else {
                Nodo aux = inicio;
                while (aux.getSiguiente().getValor() != referencia) {
                    aux = aux.getSiguiente();
                }
                Nodo siguiente = aux.getSiguiente().getSiguiente();
                aux.setSiguiente(siguiente);
            }
            tamanio--;
        }

    }

    public void eliminarXPos(int posicion) {

        if (posicion >= 0 && posicion < tamanio) {

            if (posicion == 0) {
                inicio = inicio.getSiguiente();
            }
            else{
                Nodo aux = inicio;
                for(int i = 0; i< posicion-1; i++){
                aux = aux.getSiguiente();
            }
                Nodo siguiente = aux.getSiguiente();
                aux.setSiguiente(siguiente.getSiguiente());
            }
            tamanio--;
        }

    }

    public void listar() {
        if (!estaVacia()) {
            Nodo aux = inicio;
            int i = 0;

            while (aux != null) {
                System.out.println(i + ".[" + aux.getValor() + "]" + "-> ");
                aux = aux.getSiguiente();
                i++;
            }
        }

    }

}
