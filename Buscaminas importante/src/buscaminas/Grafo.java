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
 * le asigna una mina. 
 * @author zarna
 */
public class Grafo {
    int numVertices;
    int filas;
    int columnas;
    Casilla[] listaady;
    int num_minas;

    /**
     * Constructor de la clase Grafo con tres parametros.
     *
     * @param filas    int N&uacute;mero de filas del tablero.
     * @param columnas int N&uacute;mero de columnas del tablero.
     * @param minas    int N&uacute;mero de minas en el tablero.
     */
    
    public Grafo(int filas, int columnas, int minas) {
        this.numVertices = 0;
        this.filas = filas;
        this.columnas = columnas;
        this.listaady = new Casilla[filas*columnas];
        this.num_minas = minas;
    }
    
    /**
     * Crea el tablero inicializando cada casilla y almacenándola en la lista de adyacencia.
     */
    
    public void crearTablero(){
    for(int i=0; i<filas; i++){
    for(int j=0; j<columnas; j++){
    Casilla nuevo = new Casilla(i+1,j+1);
    listaady[numVertices] = nuevo;
    numVertices++;
    } 
    }
    }
    
    /**
     * Funci&oacute;n que conecta cada casilla con sus adyacentes.
     */
    
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
    
    /**
     * Funci&oacute;n que conecta una casilla específica con sus adyacentes.
     * @param i &iacute;ndice de la casilla en la lista de adyacencia.
     */
    
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
    
    /**
     * Funci&oacute;n que genera una mina en una casilla aleatoria del tablero usando la
     * libreria Random.
     * @return La casilla donde se colocó la mina, o null si no se pudo colocar.
     */
    
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
    
     /**
     * Funci&oacute;n que crea una lista de casillas que contienen minas.
     * @return List lista de casillas que contienen minas.
     */
    
    public Lista listaMina(){
    Lista lista2 = new Lista();
    lista2.Append2(generarMina());
    return lista2;
    }
    
    /**
     * Funci&oacute;n que calcula el n&uacute;mero de minas adyacentes para 
     * cada casilla del tablero.
     */
    
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
    
    /**
     * Funci&oacute;n para propositos de prueba que imprime en consola el
     * n&uacute;mero de minas adyacentes para cada casilla en el tablero.
     */
    
    public void imprimir(){
        for(int i=0;i<listaady.length;i++){
        System.out.print(listaady[i].getMineAdy());
        
        
        }
    }
    
    /**
     * Funci&oacute;n que coloca una bandera en una casilla espec&iacute;fica.
     *
     * @param fila    int posici&oacute;n fila de la casilla.
     * @param columna int posici&oacute;n columna de la casilla.
     */
    
    public void ponerBandera(int fila, int columna){
    for(int i=0; i<listaady.length ; i++){
    if(listaady[i].getProw() == fila && listaady[i].getPcolumn() == columna){
        listaady[i].setBandera(true);
    }
    }
    }
    
    /**
     * Funci&oacute;n que remueve una bandera de una casilla espec&iacute;fica.
     *
     * @param fila    int posici&oacute;n fila de la casilla.
     * @param columna int posici&oacute;n columna de la casilla.
     */
    
    public void quitarBandera(int fila, int columna){
    for(int i=0; i<listaady.length ; i++){
    if(listaady[i].getProw() == fila && listaady[i].getPcolumn() == columna && listaady[i].isBandera() == true){
        listaady[i].setBandera(false);
    }else if(listaady[i].getProw() == fila && listaady[i].getPcolumn() == columna && listaady[i].isBandera() == false){
        JOptionPane.showMessageDialog(null,"No hay bandera aqui, intente de nuevo");
    }
    }
    }
    
    /**
     * Funci&oacute;n que revisa si una casilla tiene mina o no, usando DFS o BFS.
     *
     * @see Grafo#DFS(buscaminas.Casilla)
     * @see Grafo#BFS(buscaminas.Casilla)
     * 
     * @param fila    int posici&oacute;n fila de la casilla.
     * @param columna int posici&oacute;n columna de la casilla.
     */
    
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
    
    /**
     * Funci&oacute;n que conecta una casilla espec&iacute;fica con sus casillas adyacentes (versión alternativa)
     * @param i 
     */
    
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
    
    
    /**
     * Conecta una casilla espec&iacute;fica con sus casillas adyacentes, 
     * recorriendo por la longitud de la lista de adyacencias.
     */
    
    public void unirAristas2(){
    for(int i=0; i<listaady.length; i++){
    unir3(i);
    }
    }
    
    /**
      * Busca el &iacute;ndice de un elemento en la lista de adyacencia basado en sus
      * coordenadas de fila y columna.
      *
      * @param f La fila del elemento a buscar.
      * @param c La columna del elemento a buscar.
      * @return El &iacute;ndice del elemento en la lista de adyacencia si se encuentra,
      * de lo contrario, devuelve 0.
      */
    
    public int ind(int f, int c){
    for(int i=0; i<listaady.length; i++){
    if(listaady[i].getProw() == f && listaady[i].getPcolumn() == c){
        return i;
    }
    }
    return 0;
    }
    
    /**
     * Funci&oacute;n responsable de la busqueda por anchura.
     * @param origen Casilla que marca donde inicia la busqueda.
     */
    
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
}
    /**
     * Funci&oacute;n responsable de la busqueda por profundidad.
     * @param origen Casilla que marca donde inicia la busqueda.
     * @return <code>false</code> si no tiene minas adyacentes la casilla.
     */   
    
    //public boolean DFS(Casilla origen){
    //Pila stack = new Pila();
    //stack.apilar(origen);
    //origen.visited=true;
    //while(!stack.isEmpty()){
    //Casilla nodoAct =  stack.desapilar();
    //if(nodoAct.MineAdy == 0){
    //Casilla aux = nodoAct.lista.pFirst;
    //while(aux!=null){
        //Ver si es true o false
        //if(!aux.visited){
            //stack.apilar(aux);
            //aux.visited = true;
        
        //return false;
    
    
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
