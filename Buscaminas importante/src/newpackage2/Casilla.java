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

}
