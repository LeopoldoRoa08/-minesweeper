/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buscaminas;

/**
 *
 * @author leopo
 */
public class Casilla <T> {
    private int Prow;
    private T Pcolumn;
    private boolean Mine;

    public int getProw() {
        return Prow;
    }

    public Casilla(int Prow, T Pcolumn) {
        this.Prow = Prow;
        this.Pcolumn = Pcolumn;
    }
    
    

    public void setProw(int Prow) {
        this.Prow = Prow;
    }

    public Object getPcolumn() {
        return Pcolumn;
    }

    public void setPcolumn(T Pcolumn) {
        this.Pcolumn = Pcolumn;
    }

    public boolean isMine() {
        return Mine;
    }

    public void setMine(boolean Mine) {
        this.Mine = Mine;
    }
    
    
    
    
    
}
