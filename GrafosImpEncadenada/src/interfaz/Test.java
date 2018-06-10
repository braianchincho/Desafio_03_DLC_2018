/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import soporte.GestorGrafo;

/**
 *
 * @author User
 */
public class Test {
    
    
    public static void main(String args[]){
    
        GestorGrafo gg = new GestorGrafo();
        gg.cargar();
        System.out.println(gg.toString());
    }
}
