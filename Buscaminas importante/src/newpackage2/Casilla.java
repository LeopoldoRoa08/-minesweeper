/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage2;

/**
 *
 * @author zarna
 */
public class Casilla {
    /**
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

    public int getProw() {
        return Prow;
    }

    public int getPcolumn() {
        return Pcolumn;
    }

    public boolean isMine() {
        return Mine;
    }

    public int getMineAdy() {
        return mineAdy;
    }

    public Lista getLista() {
        return lista;
    }

    public Casilla getpNext() {
        return pNext;
    }

    public boolean isVisited() {
        return visited;
    }

    public boolean isBandera() {
        return bandera;
    }

   
      public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public void setProw(int Prow) {
        this.Prow = Prow;
    }

    public void setPcolumn(int Pcolumn) {
        this.Pcolumn = Pcolumn;
    }

    public void setMine(boolean Mine) {
        this.Mine = Mine;
    }

    public void setMineAdy(int mineAdy) {
        this.mineAdy = mineAdy;
    }

    public void setLista(Lista lista) {
        this.lista = lista;
    }

    public void setBandera(boolean bandera) {
        this.bandera = bandera;
    }

    public void setpNext(Casilla pNext) {
        this.pNext = pNext;
    }
    
    
   
}
