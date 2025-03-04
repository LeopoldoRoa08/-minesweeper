/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buscaminas;

/**
 *
 * @author leopo
 */
public class Casilla {
    private int Prow;
    private int Pcolumn;
    private boolean Mine;
    private int mineAdy;
    private GrafoLA lista;
    private Casilla pNext;
    private boolean visited;

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public Casilla() {
        this.Prow = 0;
        this.Pcolumn = 0;
        this.Mine = false;
        this.mineAdy = 0;
        this.lista = null;
        this.pNext = null;
        this.visited = false;
    }

    public Casilla(int Prow, int Pcolumn) {
        this.Prow = Prow;
        this.Pcolumn = Pcolumn;
        this.Mine = false;
        this.mineAdy = 0;
        this.lista = null;
        this.pNext = null;
    }
    
     public GrafoLA getLista() {
        return lista;
    }

    public void setLista(GrafoLA lista) {
        this.lista = lista;
    }

    public Casilla getpNext() {
        return pNext;
    }

    public void setpNext(Casilla pNext) {
        this.pNext = pNext;
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

    public void setMine(int mineAdy) {
        this.mineAdy= mineAdy;
    }

    public int getMineAdy() {
        return mineAdy;
    }
    
    }
    

    