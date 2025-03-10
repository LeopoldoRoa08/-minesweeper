/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buscaminas;

/**
 * Clase Lista usada para la implementaci&oacute;n de grafos en forma
 * de listas enlazadas.
 * @author zarna
 */
public class Lista {
    Casilla pFirst;
    Casilla pLast;
    int iN;

    /**
     * Constructor de la clase lista.
     */
    
    
    public Lista() {
        this.pFirst = null;
        this.pLast = null;
        this.iN = 0;
    }
    
    /**
     * Funci&oacute;n que vac&iacute;a una lista.
     */
    
    public void Empty(){
        this.pFirst = null;
        this.pLast = null;
        this.iN = 0;
    }
    
    /**
     * Funci&oacute;n que revisa si una lista est&aacute; vac&iacute;a.
     * @return <code>true</code> si est&aacute; vac&iacute;a y <code>false</code>
     * si no lo estest&aacute;.
     */
    
    public boolean isEmpty(){
        return this.pFirst == null;
    }
    
    /**
     * Funci&oacute;n que agrega un nodo al final de la lista enlazada.
     */
    
    public void Append(int dato,int dato2){
        Casilla pNew = new Casilla(dato,dato2);
        if(!isEmpty()){
        this.pLast.setpNext(pNew);
        this.pLast = pNew;
        }else{
            this.pFirst = this.pLast = pNew;
        }
         this.iN++;
    }
    
    /**
     * Funci&oacute;n que agrega un nodo al inicio de la lista enlazada.
     * @param dato int que contiene la posici&oacute;n de la fila del nodo.
     * @param dato2 int que contiene la posici&oacute;n de la columna del nodo.
     * @see 
     */
    
    public void Inicio(int dato,int dato2){
        Casilla pNew = new Casilla(dato,dato2);
        if(!isEmpty()){
        pNew.setpNext(this.pFirst);
        this.pFirst = pNew;
        }else{
            this.pFirst = this.pLast = pNew;
        }
        this.iN++;
    }
    
     /**
     * Funci&oacute;n que remueve un nodo al final de la lista enlazada.
     */
    
    public void Pop(){
    if(this.pFirst == this.pLast){
        Empty();
    }else{
    Casilla aux = this.pFirst;
    while(!aux.pNext.equals(this.pLast)){
        aux = aux.getpNext();
    }aux.setpNext(null);
    this.pLast = aux;
    this.iN--;}
    }
    
    /**
     * Funci&oacute;n que remueve un nodo al inicio de la lista enlazada.
     */
    
    public void BorrarInicio(){
    if(this.pFirst == this.pLast){
        Empty();
    }else{
    Casilla aux = this.pFirst.getpNext();
    this.pFirst.setpNext(null);
    this.pFirst = aux;
    this.iN--;
    }
    }
    
    public void Borrar(Casilla aux3){
        Casilla aux = this.pFirst;
        while(aux!=null && aux.getpNext()!=aux3){
            aux= aux.getpNext();
            }
        Casilla aux2 = aux3.getpNext();
        aux.setpNext(aux.getpNext().getpNext());
        aux2.setpNext(null);
        }
    
    public void Add(int data, int data2, int pPos, int pPos2){
    Casilla pNew = new Casilla(data,data2);
    Casilla aux = this.pFirst;
    while(aux.getProw() != pPos && aux.getPcolumn()!= pPos2){
        aux = aux.getpNext();
    }
    pNew.setpNext(aux.getpNext());
    aux.setpNext(pNew);
    }
    
    public void Append2(Casilla aux){  
        if(isEmpty()){
            this.pFirst = this.pLast = aux;
        }else{
        
        this.pLast.setpNext(aux);
        this.pLast = aux;
        }
         this.iN++;
    }
    
    public void recorrer(){
    Casilla aux = this.pFirst;
    int i= 0;
    while(aux!=null && i<=iN){
    System.out.println("Fila: "+aux.getProw()+" Columna: "+aux.getPcolumn());
    i++;
    aux =aux.getpNext();
    }
    
    }
}
