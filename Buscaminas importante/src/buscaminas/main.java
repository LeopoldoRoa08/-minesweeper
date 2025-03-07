/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buscaminas;

/**
 *
 * @author zarna
 */
public class main {
    public static void main(String[] args){
    GrafoLA grafo = new GrafoLA();
    Casilla c = new Casilla(3,2);
    Casilla e = new Casilla(4,2);
    
    grafo.Append(c);
    grafo.Append(e);
    grafo.imprimirCasillas();
    System.out.println(grafo.getPfirst().getProw());
    
    }
}
