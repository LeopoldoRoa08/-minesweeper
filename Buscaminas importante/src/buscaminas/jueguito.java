/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buscaminas;



/**
 *
 * @author zarna
 */
public class jueguito {
    public static void main(String[] args){
    Grafo grafo = new Grafo(4,4,8);
    grafo.crearTablero();
    grafo.unirAristas();
    grafo.adyacency();
    
    
    }
    
}
