/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buscaminas;

/**
 * Esta clase define un objeto Casilla que compone el tablero de juego, que
 * puede contener o no una mina.
 * @author zarna
 */
public class Casilla {
  /**
   * Las variables que definen el comportamiento y propiedades de la casilla.
   * @author zarna
   */
    public int Prow; // Prow denota la fila en el tablero.
    public int Pcolumn; // Pcolumn denota la columna en el tablero.
    public boolean Mine; // Mine indica si hay una mina en la casilla. 
    public int mineAdy; // mineAdy el n&uacute;mero de minas adyacentes a la casilla.
    public Lista lista;  // Lista corresponde a 
    public Casilla pNext; // pNext se usa como apuntador de tipo Casilla.
    public boolean visited; // visited denotar si se ha barrido la casilla.
    public boolean bandera; // bandera indica se le ha asignado una bandera a la casilla.

    /**
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
    
    /**
     * Funci&oacute;n lista que asigna el apuntador correspondiente al primer
     * nodo de la misma a <code>null</code>.
     */
    
    public void lista(){
    this.lista.pFirst = null;
    }

    public int getProw() {
        return Prow;
    }

    public void setProw(int Prow) {
        this.Prow = Prow;
    }

    public int getPcolumn() {
        return Pcolumn;
    }

    public void setPcolumn(int Pcolumn) {
        this.Pcolumn = Pcolumn;
    }

    public boolean isMine() {
        return Mine;
    }

    public void setMine(boolean Mine) {
        this.Mine = Mine;
    }

    public int getMineAdy() {
        return mineAdy;
    }

    public void setMineAdy(int mineAdy) {
        this.mineAdy = mineAdy;
    }

    public Lista getLista() {
        return lista;
    }

    public void setLista(Lista lista) {
        this.lista = lista;
    }

    public Casilla getpNext() {
        return pNext;
    }

    public void setpNext(Casilla pNext) {
        this.pNext = pNext;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public boolean isBandera() {
        return bandera;
    }

    public void setBandera(boolean bandera) {
        this.bandera = bandera;
    }

}
