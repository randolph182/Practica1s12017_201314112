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
    
    private NodoCircular inicio;
    private NodoCircular ultimo;
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
    
    
    public void agregarAlFinal(String valorString, ListaSimple valorLista){
        NodoCircular nuevo = new NodoCircular();
             nuevo.setValorLista(valorLista);
             nuevo.setValorString(valorString);
             
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
    
    public void agregarAlInicio(String valorString, ListaSimple valorLista){

                NodoCircular nuevo = new NodoCircular();
             nuevo.setValorLista(valorLista);
             nuevo.setValorString(valorString);
        
        if (estaVacia()){
            inicio = nuevo;
            ultimo = nuevo;
            ultimo.setSiguiente(inicio);
        }else{
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
            ultimo.setSiguiente(inicio);
        }
         tamanio++;       
         
    }
    
    //obtener por posicion
   public ListaSimple getValorXPos(int posicion){
       
       if(posicion>=0 && posicion<tamanio){
           if(posicion==0){
               return inicio.getValorLista();
           }else{
               NodoCircular aux = inicio;
               for(int i =0; i<posicion;i++){
                   aux = aux.getSiguiente();
               }
               return aux.getValorLista();
           }
       }else{
       //throw new Exception("Posicion inexistente en la lista");
       
   }
       return null;
   }
    
   public boolean buscar(String referencia){
       NodoCircular aux = inicio;
       
       boolean datoBuscado= false;
       
       do{
         //  System.out.println(aux.getValorString());
           if(referencia.contains(aux.getValorString())){
               datoBuscado = true;
           }else{
               aux = aux.getSiguiente();
           }
           
       }while(aux !=inicio && datoBuscado !=true);
       return datoBuscado;
   }
   
   public ListaSimple getLista(String referencia){
       ListaSimple tempo = new ListaSimple();
       if(buscar(referencia)){
           NodoCircular  aux = inicio;         
           while(!referencia.contains(aux.getValorString())){
                aux = aux.getSiguiente();
           }
           tempo= aux.getValorLista();
       }else{
           System.out.println("El dato de referencia no Exite en la lista circular");
           tempo = null;
       }
       return tempo;
   }
   
   
   
    
//public void listar()  {
//if(!estaVacia()){
//            NodoCircular aux = inicio;
//            int i = 0;            
//            do{
//               System.out.println(i+".["+aux.getValorNumerico()+"  "+aux.getNombreId()+"]");
//               aux = aux.getSiguiente();
//               i++;
//            }while(aux != inicio);
//                
//        }        
//}  
    
    
    
    
    
}
