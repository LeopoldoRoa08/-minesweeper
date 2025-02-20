/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buscaminas;

/**
 *
 * @author leopo
 */
public class Lista <T> {
    private Nodo pfirst;
    private Nodo plast;
    private int size;

    public Lista() {
        this.pfirst = null;
        this.plast = null;
        this.size = 0;
    }

    public Nodo getPfirst() {
        return pfirst;
    }

    public Nodo getPlast() {
        return plast;
    }

    public int getSize() {
        return size;
    }

    public void setPfirst(Nodo pfirst) {
        this.pfirst = pfirst;
    }

    public void setPlast(Nodo plast) {
        this.plast = plast;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    public boolean IsEmpty(){
        return pfirst==null;
    }
    
    public void Append(Object data){
        Nodo newnodo = new Nodo(data);
        if(pfirst==null){
            pfirst=plast=newnodo;
        }else{
            plast.setPnext(newnodo);
            plast=newnodo;
        }
        size ++;
        
    }
    
    
    
    
    
}
