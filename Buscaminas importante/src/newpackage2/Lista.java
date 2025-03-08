/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage2;

import newpackage2.Casilla;

/**
 *
 * @author zarna
 */
public class Lista {
    Casilla pFirst;
    Casilla pLast;
    int iN;

    public Lista() {
        this.pFirst = null;
        this.pLast = null;
        this.iN = 0;
    }
    
    public void Empty(){
        this.pFirst = null;
        this.pLast = null;
        this.iN = 0;
    }
    
    public boolean isEmpty(){
        return this.pFirst == null;
    }
    
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
