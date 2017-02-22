/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_estructuras;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author Randolph
 */
public class Grafo {
    private String cuerpoNodo ="";
    private String acumGrafo = "";
    
    public void operacionGrafoJugador(){
        int contador = ClaseGlobal.listaCircular.getTamanio();
        
        for (int i = 0; i < contador; i++) {
            
            if (i+1 == contador){
                String varNombre = ClaseGlobal.listaCircular.getValorStringXPos(i);
                String varNombre2 = ClaseGlobal.listaCircular.getValorStringXPos(0);
                cuerpoNodo += (char)34+ varNombre+(char)34 +"[Label ="+(char)34+varNombre+(char)34+"];"+(char)10;
                 acumGrafo += (char)34+ varNombre+(char)34 +" -> "+(char)34+varNombre2+(char)34+";"+(char)10;
            }else{                
                String varNombre = ClaseGlobal.listaCircular.getValorStringXPos(i);
                String varNombre2 = ClaseGlobal.listaCircular.getValorStringXPos(i+1);
                cuerpoNodo += (char)34+ varNombre+(char)34 +"[Label ="+(char)34+varNombre+(char)34+"];"+(char)10;
                acumGrafo += (char)34+ varNombre+(char)34 +" -> "+(char)34+varNombre2+(char)34+";"+(char)10;
                
            }
            
        }
        generarTxt(cuerpoNodo+acumGrafo);
        
    }
    
    
    
 
    public void generarTxt(String info){
        File directorio = new File("c:\\grafos");
        directorio.mkdir();
        String rutaArchivo = "c:\\grafos\\grafoJugador.dot";
     String rutaImagen = "c:\\grafos\\grafoJugador.jpg";
        try {
            File imagen = new File(rutaImagen);
            imagen.delete();
             BufferedWriter bw = new BufferedWriter(new FileWriter(rutaArchivo));
            bw.write("");
            bw.write("digraph grafoJugador {"+info+"}");            
            bw.close();
            dibujar(rutaArchivo, rutaImagen);
        } catch (Exception e) {
        }
             
    }
    
    
    public void dibujar(String direccion, String direccionPng){
                try {
            
            
            ProcessBuilder pbuilder;
            
            pbuilder = new ProcessBuilder("dot","-Tpng","-o",direccionPng,direccion);
            
            pbuilder.redirectErrorStream(true);
            
            pbuilder.start();
            
          
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "hubo error");
        }
        
        
        
    }
    
}
