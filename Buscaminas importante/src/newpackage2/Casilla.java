/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage2;

/**
 * Esta clase define un objeto Casilla que compone el tablero de juego, que
 * puede contener o no una mina.
 * @author zarna
 */
public class Casilla {
  /**
   * Las variables que definen el comportamiento y propiedades de la casilla.
   * Prow y Pcolumn denotan la posici&oacute;n de la casilla en el tablero,
   * Mine si hay una mina en la casilla, mineAdy el n&uacute;mero de minas
   * adyacentes a la casilla, pNext un apuntador a una casilla siguiente,
   * el bool visited para denotar si se ha barrido la casilla y bandera por si
   * se le ha asignado una bandera.
   * @author zarna
   */
    public int Prow;
    public int Pcolumn;
    public boolean Mine;
    public int mineAdy;
    public Lista lista;
    public Casilla pNext;
    public boolean visited;
    public boolean bandera;

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
