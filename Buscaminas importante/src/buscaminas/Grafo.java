/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buscaminas;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 * Una implementaci&oacute;n de grafos usando listas adyacentes. 
 * La lista mantendra un control de cada nueva casilla a la que se 
 * le asigna una mina. Es un grafo no dirigido
 * @author zarna
 */
public class Grafo {
    int numVertices;
    int filas;
    int columnas;
    Casilla[] listaady;
    int num_minas;

    /**
     * Constructor de la clase Grafo. 
     * @param filas int dado por el usuario a trav&eacute;s de la interfaz
     * correspondiente a las filas del tablero de juego. Debe ser como m&iacute;nimo 3,
     * y como m&aacute;ximo 10.
     * @param columnas int dado por el usuario a trav&eacute;s de la interfaz
     * correspondiente a las columnas del tablero de juego. Debe ser como m&iacute;nimo 3,
     * y como m&aacute;ximo 10.
     * @param minas int dado por el usuario a trav&eacute;s de la interfaz
     * correspondiente a la cantidad de minas del tablero de juego. Debe ser como 
     * m&iacute;nimo 1, y como m&aacute;ximo la cantidad de casillas menos 1.
     */
    
    public Grafo(int filas, int columnas, int minas) {
        this.numVertices = 0;
        this.filas = filas;
        this.columnas = columnas;
        this.listaady = new Casilla[filas*columnas];
        this.num_minas = minas;
    }
    
    public void crearTablero(){
    for(int i=0; i<filas; i++){
    for(int j=0; j<columnas; j++){
    Casilla nuevo = new Casilla(i+1,j+1);
    listaady[numVertices] = nuevo;
    numVertices++;
    } 
    }
    
    }
    
    public void unirAristas(){
    for(int i=0; i<listaady.length; i++){
        Lista l2 = new Lista();
        l2.Append2(listaady[i]);
        if(listaady[i].getPcolumn()>1){
            int fila = listaady[i].getProw();
            int columna = listaady[i].getPcolumn() -1;
            for(int j=0; j<listaady.length; j++){
                if(listaady[j].getProw() == fila && listaady[j].getPcolumn() == columna){
                    l2.Append2(listaady[j]);
                }
            }
        
        }if(listaady[i].getPcolumn()<listaady[numVertices-1].getPcolumn()){
        int fila = listaady[i].getProw();
        int columna = listaady[i].getPcolumn() +1;
        for(int j=0; j<listaady.length; j++){
                if(listaady[j].getProw() == fila && listaady[j].getPcolumn() == columna){
                   listaady[i].getLista().Append2(listaady[j]);
                } 
        }
        }if(listaady[i].getProw()>1){
        int fila = listaady[i].getProw()-1;
        int columna = listaady[i].getPcolumn();
            for(int j=0; j<listaady.length; j++){
                    if(listaady[j].getProw() == fila && listaady[j].getPcolumn() == columna){
                       l2.Append2(listaady[j]);
                    } 
            }
        }if(listaady[i].getProw()<listaady[numVertices-1].getProw()){
        int fila = listaady[i].getProw()+1;
        int columna = listaady[i].getPcolumn();
            for(int j=0; j<listaady.length; j++){
                    if(listaady[j].getProw() == fila && listaady[j].getPcolumn() == columna){
                       l2.Append2(listaady[j]);
                    } 
            }
        }if(listaady[i].getPcolumn()>1 && listaady[i].getProw()>1){
        int fila = listaady[i].getProw()-1;
        int columna = listaady[i].getPcolumn()-1; 
            for(int j=0; j<listaady.length; j++){
                        if(listaady[j].getProw() == fila && listaady[j].getPcolumn() == columna){
                           l2.Append2(listaady[j]);
                        } 
                }
        }if(listaady[i].getPcolumn()>1 && listaady[i].getProw()<listaady[numVertices-1].getProw()){
        int fila = listaady[i].getProw()+1;
        int columna = listaady[i].getPcolumn()-1; 
            for(int j=0; j<listaady.length; j++){
                        if(listaady[j].getProw() == fila && listaady[j].getPcolumn() == columna){
                           listaady[i].getLista().Append2(listaady[j]);
                        } 
                }
        }if(listaady[i].getPcolumn()<listaady[numVertices-1].getPcolumn() && listaady[i].getProw()<listaady[numVertices-1].getProw()){
            int fila = listaady[i].getProw()+1;
            int columna = listaady[i].getPcolumn()+1; 
            for(int j=0; j<listaady.length; j++){
                        if(listaady[j].getProw() == fila && listaady[j].getPcolumn() == columna){
                           l2.Append2(listaady[j]);
                        } 
                }
        }if(listaady[i].getPcolumn()<listaady[numVertices-1].getPcolumn() && listaady[i].getProw()>1){
            int fila = listaady[i].getProw()-1;
            int columna = listaady[i].getPcolumn()+1; 
            for(int j=0; j<listaady.length; j++){
                        if(listaady[j].getProw() == fila && listaady[j].getPcolumn() == columna){
                           l2.Append2(listaady[j]);
                        } 
                }
        }
        listaady[i].setLista(l2);
    }
    }
    
    
    
    public void unir(int i){
     
     Lista l2 = new Lista();
        l2.Append2(listaady[i]);
        if(listaady[i].getPcolumn()>1){
            int fila = listaady[i].getProw();
            int columna = listaady[i].getPcolumn() -1;
            for(int j=0; j<listaady.length; j++){
                if(listaady[j].getProw() == fila && listaady[j].getPcolumn() == columna){
                    l2.Append2(listaady[j]);
                }
            }
        
        }if(listaady[i].getPcolumn()<listaady[numVertices-1].getPcolumn()){
        int fila = listaady[i].getProw();
        int columna = listaady[i].getPcolumn() +1;
        for(int j=0; j<listaady.length; j++){
                if(listaady[j].getProw() == fila && listaady[j].getPcolumn() == columna){
                   listaady[i].getLista().Append2(listaady[j]);
                } 
        }
        }if(listaady[i].getProw()>1){
        int fila = listaady[i].getProw()-1;
        int columna = listaady[i].getPcolumn();
            for(int j=0; j<listaady.length; j++){
                    if(listaady[j].getProw() == fila && listaady[j].getPcolumn() == columna){
                       l2.Append2(listaady[j]);
                    } 
            }
        }if(listaady[i].getProw()<listaady[numVertices-1].getProw()){
        int fila = listaady[i].getProw()+1;
        int columna = listaady[i].getPcolumn();
            for(int j=0; j<listaady.length; j++){
                    if(listaady[j].getProw() == fila && listaady[j].getPcolumn() == columna){
                       l2.Append2(listaady[j]);
                    } 
            }
        }if(listaady[i].getPcolumn()>1 && listaady[i].getProw()>1){
        int fila = listaady[i].getProw()-1;
        int columna = listaady[i].getPcolumn()-1; 
            for(int j=0; j<listaady.length; j++){
                        if(listaady[j].getProw() == fila && listaady[j].getPcolumn() == columna){
                           l2.Append2(listaady[j]);
                        } 
                }
        }if(listaady[i].getPcolumn()>1 && listaady[i].getProw()<listaady[numVertices-1].getProw()){
        int fila = listaady[i].getProw()+1;
        int columna = listaady[i].getPcolumn()-1; 
            for(int j=0; j<listaady.length; j++){
                        if(listaady[j].getProw() == fila && listaady[j].getPcolumn() == columna){
                           listaady[i].getLista().Append2(listaady[j]);
                        } 
                }
        }if(listaady[i].getPcolumn()<listaady[numVertices-1].getPcolumn() && listaady[i].getProw()<listaady[numVertices-1].getProw()){
            int fila = listaady[i].getProw()+1;
            int columna = listaady[i].getPcolumn()+1; 
            for(int j=0; j<listaady.length; j++){
                        if(listaady[j].getProw() == fila && listaady[j].getPcolumn() == columna){
                           l2.Append2(listaady[j]);
                        } 
                }
        }if(listaady[i].getPcolumn()<listaady[numVertices-1].getPcolumn() && listaady[i].getProw()>1){
            int fila = listaady[i].getProw()-1;
            int columna = listaady[i].getPcolumn()+1; 
            for(int j=0; j<listaady.length; j++){
                        if(listaady[j].getProw() == fila && listaady[j].getPcolumn() == columna){
                           l2.Append2(listaady[j]);
                        } 
                }
        }
        listaady[i].setLista(l2);
        listaady[i].getLista().recorrer();
     }
    
    public Casilla generarMina(){
    Random m = new Random();
    int mina = 0;
    Lista lol = new Lista();
        while(mina != num_minas){
        int pFilas = m.nextInt(filas);
        int pColumnas = m.nextInt(columnas);
            for(int i=0; i<listaady.length; i++){
            if(listaady[i].getProw() == pFilas && listaady[i].getPcolumn() == pColumnas){
            listaady[i].setMine(true);
            lol.Append2(listaady[i]);
            mina++;
            return listaady[i];
            }
            
            }
            
        }
        return null;
    }
    
    public Lista listaMina(){
    Lista lista2 = new Lista();
    lista2.Append2(generarMina());
    return lista2;
    }
    
    public void minasAdyacentes(){
    for(int i=0; i<listaady.length; i++){
    Casilla aux = listaady[i].getLista().pFirst;
    while(aux!=null){
        if(aux.isMine() == true){
        listaady[i].setMineAdy(listaady[i].getMineAdy() + 1);
        aux = aux.getpNext();
        }else{
        aux = aux.getpNext();
        } 
    }
    }
    }
    
    public void imprimir(){
        for(int i=0;i<listaady.length;i++){
        System.out.print(listaady[i].getMineAdy());
        
        
        }
    }
    
    
    public void ponerBandera(int fila, int columna){
    for(int i=0; i<listaady.length ; i++){
    if(listaady[i].getProw() == fila && listaady[i].getPcolumn() == columna){
        listaady[i].setBandera(true);
    }
    }
    }
    
    public void quitarBandera(int fila, int columna){
    for(int i=0; i<listaady.length ; i++){
    if(listaady[i].getProw() == fila && listaady[i].getPcolumn() == columna && listaady[i].isBandera() == true){
        listaady[i].setBandera(false);
    }else if(listaady[i].getProw() == fila && listaady[i].getPcolumn() == columna && listaady[i].isBandera() == false){
        JOptionPane.showMessageDialog(null,"No hay bandera aqui, intente de nuevo");
    }
    }
    }
    
    public void barrerCasilla(int fila, int columna){
        // Hay que hacerle una validacion antes
        for(int i=0; i<listaady.length; i++){
            if(listaady[i].getProw() == fila && listaady[i].getPcolumn() == columna){
                if(listaady[i].isMine() == true){
                // Muestra todos los numeros de las casillas
                
                JOptionPane.showMessageDialog(null, "Perdiste");
                }else if(listaady[i].isMine() == false && listaady[i].getMineAdy()>0){
                // Muestra la casilla
                }else if(listaady[i].isMine() == false && listaady[i].getMineAdy()==0){
                //DFS o BFS
                }
            }

            break;
        }
     
    }
    public void unir3(int i){
     Lista l2 = new Lista();
        l2.Append2(listaady[i]);
        if(listaady[i].getPcolumn()>1){
            int fila = listaady[i].getProw();
            int columna = listaady[i].getPcolumn() -1;
            for(int j=0; j<listaady.length; j++){
                if(listaady[j].getProw() == fila && listaady[j].getPcolumn() == columna){
                    l2.Append2(listaady[j]);
                }
            }
        }if(listaady[i].getPcolumn()<listaady[numVertices-1].getPcolumn()){
            int fila = listaady[i].getProw();
            int columna = listaady[i].getPcolumn() +1;
            for(int j=0; j<listaady.length;j++){
                if(listaady[j].getProw() == fila && listaady[j].getPcolumn() == columna){
                    l2.Append2(listaady[j]);
                }
            }
        }if(listaady[i].getProw()>1){
            int fila = listaady[i].getProw() - 1;
            int columna = listaady[i].getPcolumn();
            for(int j=0; j<listaady.length;j++){
                if(listaady[j].getProw() == fila && listaady[j].getPcolumn() == columna){
                    l2.Append2(listaady[j]);
                }
            }
        }if(listaady[i].getProw()<listaady[numVertices-1].getProw()){
            int fila = listaady[i].getProw() + 1;
            int columna = listaady[i].getPcolumn();
            for(int j=0; j<listaady.length;j++){
                if(listaady[j].getProw() == fila && listaady[j].getPcolumn() == columna){
                    l2.Append2(listaady[j]);
                }
            }
        }if(listaady[i].getPcolumn()>1 && listaady[i].getProw()>1){
        int fila = listaady[i].getProw()-1;
        int columna = listaady[i].getPcolumn()-1; 
            for(int j=0; j<listaady.length; j++){
                        if(listaady[j].getProw() == fila && listaady[j].getPcolumn() == columna){
                           l2.Append2(listaady[j]);
                        } 
                }
        }if(listaady[i].getPcolumn()<listaady[numVertices-1].getPcolumn() && listaady[i].getProw()>1){
        int fila = listaady[i].getProw() + 1;
        int columna = listaady[i].getPcolumn() - 1;
            for(int j=0; j<listaady.length; j++){
                        if(listaady[j].getProw() == fila && listaady[j].getPcolumn() == columna){
                           l2.Append2(listaady[j]);
                        } 
                }
        }if(listaady[i].getPcolumn()<listaady[numVertices-1].getPcolumn() && listaady[i].getProw()<listaady[numVertices-1].getProw()){
        int fila = listaady[i].getProw() +1;
        int columna = listaady[i].getPcolumn() +1;
            for(int j=0; j<listaady.length; j++){
                        if(listaady[j].getProw() == fila && listaady[j].getPcolumn() == columna){
                           l2.Append2(listaady[j]);
                        } 
                }
        }if(listaady[i].getPcolumn()>1 && listaady[i].getProw()<listaady[numVertices-1].getProw()){
        int fila = listaady[i].getProw() -1;
        int columna = listaady[i].getPcolumn() +1;
            for(int j=0; j<listaady.length; j++){
                        if(listaady[j].getProw() == fila && listaady[j].getPcolumn() == columna){
                           l2.Append2(listaady[j]);
                        } 
                }
        }
        listaady[i].setLista(l2);
        
     }
        
    public void unirAristas2(){
    for(int i=0; i<listaady.length; i++){
    unir3(i);
    }
    }
    
    public int ind(int f, int c){
    for(int i=0; i<listaady.length; i++){
    if(listaady[i].getProw() == f && listaady[i].getPcolumn() == c){
        return i;
    }
    }
    return 0;
    }
    
    public void BFS(Casilla origen){
        Cola queque= new Cola();
        origen.setVisited(true);
        queque.encolar(origen);
        while(!queque.isEmpty()){
            Casilla nodoAct = (Casilla) queque.desencolar();
            if (nodoAct.getMineAdy()==0){
            Casilla temp = nodoAct.getLista().pFirst;
            while(temp!=null){
                if(!temp.isVisited()){
                    queque.encolar(temp);
                    temp.setVisited(true);  
                }
                }
            }
            
        }
        
    }
    
    public boolean DFS(Casilla origen){
        if (origen == null) {
            return false;
        }
        Pila stack = new Pila();
        stack.apilar(origen);
        origen.visited=true;
        while(!stack.isEmpty()){
            Casilla nodoAct =  stack.desapilar();
            if(nodoAct.mineAdy == 0){
                Casilla aux = nodoAct.lista.pFirst;
                while(aux!=null){
                //Ver si es true o false
                    if(!aux.visited){
                        stack.apilar(aux);
                        aux.visited = true;
                    }
                    aux = aux.pNext;
                }
            }
        }
        return false;
    }
}


    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
