/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buscaminas;

/**
 *
 * @author leopo
 */
public class Pila {
     private int size;
    private Nodo cima;

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
    
    public void apilar(Object data) {
        Nodo nuevo = new Nodo(data);
        if (isEmpty()) {
            this.cima = nuevo;
        } else {
            nuevo.setPnext(this.cima);
            this.cima = nuevo;
        }
        this.size++;
    }
    
    public void desapilar() {
        if (isEmpty()) {
            System.out.println("La lista está vacía");
            return;
        }
        Nodo aux = this.cima;
        this.cima = this.cima.getPnext();
        aux.setPnext(null);
        this.size--;
    }

    public Object recorrer() {
        if (isEmpty()) {
            System.out.println("La lista está vacía");
            return -1; // Indicador de lista vacía
        }
        return cima.getData();
    }

    public int getSize() {
        return size;
    }
}




