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
public class ListaCircular {
    
    private Nodo2 inicio;
    private Nodo2 ultimo;
        private int tamanio;
    
    
  public void ListaCircular()
  {
      inicio = null;
      ultimo = null;
      tamanio = 0;
  }
        
    public boolean estaVacia(){
        return inicio ==null;
    }    
    
    public int getTamanio(){
        return tamanio;
    }
    
    
    public void agregarAlFinal(ListaSimple1 valor){
        Nodo2 nuevo = new Nodo2();
             nuevo.setValor(valor);
             
             if (estaVacia()){
                inicio = nuevo;
                ultimo = nuevo;
                ultimo.setSiguiente(inicio);
             }else{
                 ultimo.setSiguiente(nuevo);
                 nuevo.setSiguiente(inicio);
                 ultimo = nuevo;
             }
             tamanio++;
    }
    
    
    
    
}
