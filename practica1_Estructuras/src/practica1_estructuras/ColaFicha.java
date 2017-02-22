

package practica1_estructuras;
import java.util.Queue;
import java.util.LinkedList;
/**
 *
 * @author Randolph
 */
public class ColaFicha {

    private ListaSimple listaLetras = new ListaSimple();
private ListaSimple colaLetra = new ListaSimple();

    public  void moverLetraCola() {
        for (int i = 0; i < 12; i++) {
            listaLetras.agregarFinalLista("A");
            listaLetras.agregarFinalLista("E");
        }
        for (int i = 0; i < 9; i++) {
            listaLetras.agregarFinalLista("O");
        }
        for (int i = 0; i < 6; i++) {
            listaLetras.agregarFinalLista("I");
            listaLetras.agregarFinalLista("S");
        }

        for (int i = 0; i < 5; i++) {
            listaLetras.agregarFinalLista("N");
            listaLetras.agregarFinalLista("R");
            listaLetras.agregarFinalLista("U");
            listaLetras.agregarFinalLista("D");
        }
        for (int i = 0; i < 4; i++) {
            listaLetras.agregarFinalLista("L");
            listaLetras.agregarFinalLista("T");
            listaLetras.agregarFinalLista("C");
        }
        for (int i = 0; i < 2; i++) {
            listaLetras.agregarFinalLista("G");
            listaLetras.agregarFinalLista("B");
            listaLetras.agregarFinalLista("M");
            listaLetras.agregarFinalLista("P");
            listaLetras.agregarFinalLista("H");

        }

        for (int i = 0; i < 1; i++) {
            listaLetras.agregarFinalLista("F");
            listaLetras.agregarFinalLista("V");
            listaLetras.agregarFinalLista("Y");
            listaLetras.agregarFinalLista("Q");
            listaLetras.agregarFinalLista("J");
            listaLetras.agregarFinalLista("Ñ");
            listaLetras.agregarFinalLista("X");
            listaLetras.agregarFinalLista("Z");

        }
        
int valorLitaTempo = listaLetras.getTamanio();
      // parte donde se encolan las litas de manera aleatoria;
        for (int i = 0; i < valorLitaTempo; i++) {
            int varTemp = (int) (Math.random()*(listaLetras.getTamanio()-1)+0);
            
            ClaseGlobal.colaLetras.agregarFinalLista(listaLetras.obtenerValorNodo(varTemp));
            listaLetras.eliminarXPos(varTemp);
                    }
           
    }

}
