/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage2;

/**
 *
 * Esta clase define un objeto Casilla que compone el tablero de juego, que
 * puede contener o no una mina.
 * @author miguel
 */
public class Casilla {
   /**
  * Las variables que definen el comportamiento y propiedades de la casilla.
  * Prow y Pcolumn denotan la posici&oacute;n de la casilla en el tablero, Mine 
  * 
  * @author zarna
 */
    int Prow;
    int Pcolumn;
    boolean Mine;
    int mineAdy;
    Lista lista;
    Casilla pNext;
    boolean visited;
    boolean bandera;

     /**
     *
     * Constructor de la clase casilla sin ningun parametro de entrada.
     */
    public Casilla() {
        this.Prow = 0;
        this.Pcolumn = 0;
        this.Mine = false;
        this.mineAdy = 0;
        this.lista = new Lista();
        this.pNext = null;
        this.visited = false;
        this.bandera = false;
        
    }
    /**
     * Constructor de la clase casilla cuando se le da una posici&oacute;n como
     * entrada.
     * 
     * @param Prow Es la fila n en la que se encuentra en una matriz nxm.
     * @param Pcolumn Es la columna m en la que se encuentra en una matriz nxm.
     */
    public Casilla(int Prow, int Pcolumn) {
        this.Prow = Prow;
        this.Pcolumn = Pcolumn;
        this.Mine = false;
        this.mineAdy = 0;
        this.lista = new Lista();
        this.pNext = null;
        this.bandera = false;
    }
    
    public void lista(){
    this.lista.pFirst = null;
    }

}
