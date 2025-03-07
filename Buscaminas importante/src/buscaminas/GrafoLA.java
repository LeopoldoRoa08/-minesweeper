/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buscaminas;


import java.util.Random;

/**
 *
 * @author ricardo
 */
public class GrafoLA {
    private Casilla  pfirst;
    private int numVertices;
    private int[] filasarray = {1,2,3,4,5,6,7,8,9,10} ;
    private int[] columnasarray = {1,2,3,4,5,6,7,8,9,10};
    private Casilla pFirst;
    private Casilla pLast;
    private int num_minas;
    private int filas;
    private int columnas;

    public int getFilas() {
        return filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }
    
    
    

    public Casilla getpFirst() {
        return pFirst;
    }

    public void setpFirst(Casilla pFirst) {
        this.pFirst = pFirst;
    }

    public int getNum_minas() {
        return num_minas;
    }

    public void setNum_minas(int num_minas) {
        this.num_minas = num_minas;
    }
    
    
    
    public GrafoLA () {
       pFirst = null;
       numVertices = 0;
    }

    public int[] getFilasarray() {
        return filasarray;
    }

    public void setFilasarray(int[] filasarray) {
        this.filasarray = filasarray;
    }

    public int[] getColumnasarray() {
        return columnasarray;
    }

    public void setColumnasarray(int[] columnasarray) {
        this.columnasarray = columnasarray;
    }

    public Casilla getPfirst() {
        return pfirst;
    }

    public void setPfirst(Casilla pfirst) {
        this.pfirst = pfirst;
    }

    public int getNumVertices() {
        return numVertices;
    }

    public void setNumVertices(int numVertices) {
        this.numVertices = numVertices;
    }
    
    public boolean isEmpty(){
        return this.pFirst==null;
    }
    
    public void iniciarTablero(){
    
    for(int i = 0; i<2; i++){
        for(int j = 0; j<5; j++){
            int f = getFilasarray()[i];
            int c = getColumnasarray()[j];
            Casilla nuevo = new Casilla(f,c);
            Append(nuevo);
        }
    }
    setNumVertices(getNumVertices()+1);
    }
    
    public void Append(Casilla casilla){
    if(isEmpty()){
    setPfirst(casilla);
    setpLast(casilla);
    }else{
    getpLast().setpNext(casilla);
    setpLast(casilla);
    }
    setNumVertices(getNumVertices()+1);
    }
    
    public void unirCasilla(){
    Casilla aux = getPfirst();
    while(aux != null){
    
        //Condicion uno : Columna izquierda
        if(aux.getPcolumn()>1){
            Casilla extra = new Casilla(aux.getProw(),(aux.getPcolumn()-1));
            Casilla aux2 = getPfirst();
            while(aux2!=null){
            if(aux2.getProw() == extra.getProw() && aux2.getPcolumn() == extra.getPcolumn()){
            aux.getLista().Append(aux2);
            }
            }
            //Condicion uno : Columna izquierda
        }if(aux.getProw()<getpLast().getProw()){
            Casilla extra = new Casilla(aux.getProw()-1,(aux.getPcolumn()));
            Casilla aux2 = getPfirst();
            while(aux2!=null){
            if(aux2.getProw() == extra.getProw() && aux2.getPcolumn() == extra.getPcolumn()){
            aux.getLista().Append(aux2);
            }
            }

            //Condicion uno : Columna izquierda
        }if(aux.getProw()>1){
            Casilla extra = new Casilla(aux.getProw()+1,(aux.getPcolumn()));
            Casilla aux2 = getPfirst();
            while(aux2!=null){
            if(aux2.getProw() == extra.getProw() && aux2.getPcolumn() == extra.getPcolumn()){
            aux.getLista().Append(aux2);
            }
            }
            
        }if(aux.getProw()<getpLast().getProw()){
            Casilla extra = new Casilla(aux.getProw()-1,(aux.getPcolumn()));
            Casilla aux2 = getPfirst();
            while(aux2!=null){
            if(aux2.getProw() == extra.getProw() && aux2.getPcolumn() == extra.getPcolumn()){
            aux.getLista().Append(aux2);
            }
            }
        
        
        }
        
        
        
        if(aux.getPcolumn()>1 && aux.getProw()>1){
            Casilla extra = new Casilla(aux.getProw()-1,(aux.getPcolumn()-1));
            Casilla aux2 = getPfirst();
            while(aux2!=null){
            if(aux2.getProw() == extra.getProw() && aux2.getPcolumn() == extra.getPcolumn()){
            aux.getLista().Append(aux2);
            }
            }
            //Condicion uno : Columna izquierda
        }if(aux.getPcolumn()>1 && aux.getProw()<getpLast().getProw()){
            Casilla extra = new Casilla(aux.getProw()+1,(aux.getPcolumn()-1));
            Casilla aux2 = getPfirst();
            while(aux2!=null){
            if(aux2.getProw() == extra.getProw() && aux2.getPcolumn() == extra.getPcolumn()){
            aux.getLista().Append(aux2);
            }
            }
            
        }if(aux.getPcolumn()<getpLast().getPcolumn() && aux.getProw()<getpLast().getProw()){
            Casilla extra = new Casilla(aux.getProw()+1,(aux.getPcolumn()+1));
            Casilla aux2 = getPfirst();
            while(aux2!=null){
            if(aux2.getProw() == extra.getProw() && aux2.getPcolumn() == extra.getPcolumn()){
            aux.getLista().Append(aux2);
            }
            }
            //Condicion uno : Columna izquierda
        }if(aux.getPcolumn()<getpLast().getPcolumn() && aux.getProw()>1){
            Casilla extra = new Casilla(aux.getProw()-1,(aux.getPcolumn()+1));
            Casilla aux2 = getPfirst();
            while(aux2!=null){
            if(aux2.getProw() == extra.getProw() && aux2.getPcolumn() == extra.getPcolumn()){
            aux.getLista().Append(aux2);
            }
            }
        }
    }
    
    }
    
    public void imprimirCasillas(){
    Casilla aux = getPfirst();
    while(aux!=null){
    System.out.println("Fila: "+aux.getProw()+", Columna:"+ aux.getPcolumn());
    aux = aux.getpNext();
    }
    }
    
    
    

    public Casilla getpLast() {
        return pLast;
    }

    public void setpLast(Casilla pLast) {
        this.pLast = pLast;
    }
    
    public boolean DFS(Casilla origen){
    Pila stack = new Pila();
    stack.apilar(origen);
    origen.setVisited(true);
    while(!stack.isEmpty()){
    Casilla nodoAct = (Casilla) stack.desapilar();
    if(nodoAct.getMineAdy() == 0) return true;
    Casilla aux = nodoAct.getLista().getPfirst();
    while(aux!=null){
        //Ver si es true o false
        if(!aux.isVisited()){
            stack.apilar(aux);
            aux.setVisited(true);
        }

    }
    
    
    }
    return false;
    }
    
     public boolean BFS(Casilla origen){
        Cola queque= new Cola();
        origen.setVisited(true);
        queque.encolar(origen);
        while(!queque.isEmpty()){
            Casilla nodoAct = (Casilla) queque.desencolar();
            if (nodoAct.getMineAdy()== 0) return true;
            Casilla temp = nodoAct.getLista().getPfirst();
            while(temp!=null){
                if(!temp.isVisited()){
                    queque.encolar(temp);
                    temp.setVisited(true);
                }
            }
            
        }
        return false;
    }
     
    public void GenerarMinas() {
    Random m = new Random();
    int minas = 0;
    while (minas != num_minas) {
        int Pfilas = m.nextInt(filas);
        int Pcolumnas = m.nextInt(columnas);
        
        // Reiniciar temp en cada iteración del bucle
        Casilla temp = getPfirst();
        while (temp != null) {
            if (temp.getProw() == Pfilas && temp.getPcolumn() == Pcolumnas && !temp.isMine()) {
                temp.setMine(true);
                minas++;
                break;
            }
            temp = temp.getpNext();
        }
    }
} 
    
    }
    
 
    
    
    
    
    
    
    

    

