/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buscaminas;

/**
 * Clase cola usada como estructura de datos auxiliar para la busqueda en
 * anchura del grafo. Posee las primitivas comunes de una cola.
 * @see Grafo#BFS(buscaminas.Casilla)
 * @author zarna
 */
public class Cola {
   private Casilla pfirst;
   private Casilla pflast;
   private int size;

    public Cola() {
        this.pfirst=null;
        this.pflast=null;
        this.size=0;
    }
    
    public void encolar(Casilla nuevo) {
    if (pfirst == null) {
        pfirst = nuevo;
    } else {
        pflast.setpNext(nuevo);
    }
    pflast = nuevo;
    size++;
}


    public void setPfirst(Casilla pfirst) {
        this.pfirst = pfirst;
    }

    public void setPflast(Casilla pflast) {
        this.pflast = pflast;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Casilla getPfirst() {
        return pfirst;
    }

    public Casilla getPflast() {
        return pflast;
    }

    public int getSize() {
        return size;
    }
    
    public boolean isEmpty() {
    return pfirst == null;
}
   
    public Casilla peek() {
    if (pfirst == null) {
        System.out.println("La cola está vacía");
    }
    return pfirst;
}

    
   public Casilla desencolar() {
    if (pfirst == null) {
       System.out.println();
    }
   Casilla temp = pfirst;
    pfirst = pfirst.getpNext();
    size--;
    if (pfirst == null) {
        pflast = null;
    }
    return temp;
}
}
