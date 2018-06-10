/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soporte;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class GestorGrafo {
    
    UndirectedGraph<Integer> grafo ;
    
    public GestorGrafo(){
        grafo = new UndirectedGraph<>();
    }
    
    
    public void cargar(){
       File archivo = new File("C:\\Users\\User\\Documents\\NetBeansProjects\\Ficha 05 [Grafos - Implementación Encadenada]\\Grafos [implementación encadenada]\\src\\soporte\\graph.txt");

   
       String linea = "";
        try {
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            while(br.ready()){
                linea = br.readLine();
                this.cargarArcos(linea);
                
        }
       
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GestorGrafo.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(IOException ex){
            Logger.getLogger(GestorGrafo.class.getName()).log(Level.SEVERE, null, ex);
        }

    
    }
    public void cargarArcos(String linea){

       String fila[] = linea.split(" ");
       Node<Integer> nodoPivot = new Node(new Integer(fila[0]));
       grafo.add(nodoPivot);
        for (int i = 1; i < fila.length; i++) {
            Node<Integer> nodoI = new Node<Integer>(new Integer(fila[i]));
            
            UndirectedArc<Integer> arco = new UndirectedArc <Integer>(
            nodoPivot,nodoI );
            grafo.add(arco);
            
            grafo.add(nodoI);
            
            grafo.add(arco);
            
        }
    }

    @Override
    public String toString() {
        return grafo.toString();
    }
    
}
