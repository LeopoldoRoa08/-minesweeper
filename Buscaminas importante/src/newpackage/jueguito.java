/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;



/**
 *
 * @author zarna
 */
public class jueguito {
    public static void main(String[] args){
    Grafo grafo = new Grafo(9,10,15);
    grafo.crearTablero();
    grafo.unir3(36);

    grafo.minasAdyacentes();
    grafo.imprimir();

    
    
    }
    
}
