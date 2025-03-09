/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buscaminas;

/**
 * Clase cola usada como estructura de datos auxiliar para la b&uacute;squeda en
 * anchura del grafo.
 * @see Grafo#BFS(buscaminas.Casilla);
 * @author zarna
 */
public class Cola {
   private Casilla pfirst;
   private Casilla pflast;
   private int size;

   /**
 * Constructor de la clase cola. No requiere de ningun parametro 
 * al instanciarsepues es usado unicamente para el proceso de recorrido.
 * @see Grafo#BFS(buscaminas.Casilla);
 * @author zarna
 */
   
    public Cola() {
        this.pfirst=null;
        this.pflast=null;
        this.size=0;
    }
    
    /**
     * Funci&oacute;n que agrega una casilla al final de la cola.
     * @param nuevo Casilla que ser&aacute; encolada.
     */
    
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

   /**
    * Funci&oacute;n que remueve el primer integrante de una cola y lo retorna.
    * @return temp Casilla al principio o frente de la cola.
    */
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
