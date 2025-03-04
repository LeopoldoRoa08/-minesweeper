/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buscaminas.hola;


/**
 *
 * @author leopo
 */
public class Pila {
     private int size;
    private Casilla cima;

    public Pila() {
        this.size = 0;
        this.cima = null;
    }
    
    public boolean isEmpty() {
        return cima == null;
    }
    
    public void vaciar() {
        this.size = 0;
        this.cima = null;
    }
    
    public void apilar(Casilla casilla) {
        
        if (isEmpty()) {
            this.cima = casilla;
        } else {
            casilla.setpNext(this.cima);
            this.cima = casilla;
        }
        this.size++;
    }
    
    public Casilla desapilar() {
        if (isEmpty()) {
            System.out.println("La lista está vacía");
            return null;
        }
        Casilla aux = this.cima;
        this.cima = this.cima.getpNext();
        aux.setpNext(null);
        this.size--;
        return aux;
    }

    public Object recorrer() {
        if (isEmpty()) {
            System.out.println("La lista está vacía");
            return -1; // Indicador de lista vacía
        }
        return cima.getProw();
    }

    public int getSize() {
        return size;
    }
}




