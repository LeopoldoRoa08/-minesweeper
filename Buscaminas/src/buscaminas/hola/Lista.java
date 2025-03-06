/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buscaminas.hola;

import buscaminas.Nodo;

/**
 * Es la clase Lista usada para la implementaci&oacute;n de grafos con
 * listas adyacentes. En el caso de esta implementacion, seria un vector 
 * que contiene dentro suyo a varias listas de adyacencias al grafo.
 * @author leopo
 * @param <T>
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
    
    public void Empty(){
        pfirst = null;
        plast = null;
        size = 0;
    }
    
    public void Append(Object data){
        Nodo newnodo = new Nodo(data);
        if(pfirst == null){
            pfirst = plast= newnodo;
        }else{
            plast.setPnext(newnodo);
            plast = newnodo;
        }
        size ++;
        
    }

   
    
    
    /**
     * Funci&oacute;n que remueve de la lista algun valor, usando el dato
     * contenido en el mismo como parametro.
     * 
     * @param data es el dato contenido en el nodo a eliminar.
     */
    public void Delete(Object data){
        if (!this.IsEmpty()){
            if (this.pfirst.getData().equals(data)){
                if (size == 1){
                    this.Empty();
                }else{
                pfirst = pfirst.getPnext();}
            }else{
                Nodo aux = pfirst;
                while (aux.getPnext() != null && !aux.getPnext()
                        .getData().equals(data)){ 
                    aux = aux.getPnext();}
                if (aux.getPnext() != null){
                    if (aux.getPnext().getPnext() == null){
                        aux.setPnext(null);}
                    else{
                        aux.setPnext(aux.getPnext().getPnext());
                    }
                    size--;   
                    }
                }
            }
        } 
    }

