/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

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
        this.pLast.pNext = pNew;
        this.pLast = pNew;
        }else{
            this.pFirst = this.pLast = pNew;
        }
         this.iN++;
    }
    
    public void Inicio(int dato,int dato2){
        Casilla pNew = new Casilla(dato,dato2);
        if(!isEmpty()){
        pNew.pNext = this.pFirst;
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
        aux = aux.pNext;
    }aux.pNext=null;
    this.pLast = aux;
    this.iN--;}
    }
    
    public void BorrarInicio(){
    if(this.pFirst == this.pLast){
        Empty();
    }else{
    Casilla aux = this.pFirst.pNext;
    this.pFirst.pNext = null;
    this.pFirst = aux;
    this.iN--;
    }
    }
    
    public void Borrar(int pValue , int pValue2){
        Casilla aux = this.pFirst;
        while(aux.pNext.Prow != pValue && aux.pNext.Pcolumn != pValue2){
            aux= aux.pNext;
            }
        Casilla aux2 = aux.pNext;
        aux.pNext = aux.pNext.pNext;
        aux2.pNext = null;
        }
    
    public void Add(int data, int data2, int pPos, int pPos2){
    Casilla pNew = new Casilla(data,data2);
    Casilla aux = this.pFirst;
    while(aux.Prow != pPos && aux.Pcolumn!= pPos2){
        aux = aux.pNext;
    }
    pNew.pNext = aux.pNext;
    aux.pNext = pNew;
    }
    
    public void Append2(Casilla aux){  
        if(isEmpty()){
            this.pFirst = this.pLast = aux;
        }else{
        
        this.pLast.pNext = aux;
        this.pLast = aux;
        }
         this.iN++;
    }
    
    public void recorrer(){
    Casilla aux = this.pFirst;
    int i= 0;
    while(aux!=null && i<=iN){
    System.out.println("Fila: "+aux.Prow+" Columna: "+aux.Pcolumn);
    i++;
    aux =aux.pNext;
    }
    
    }
}
