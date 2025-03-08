/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 * Implementaci&oacute;n de grafos en forma de listas de ayacencia. 
 * @author zarna
 */
public class Grafo {
    int numVertices;
    int filas;
    int columnas;
    Casilla[] listaady;
    int num_minas;

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
        if(listaady[i].Pcolumn>1){
            int fila = listaady[i].Prow;
            int columna = listaady[i].Pcolumn -1;
            for(int j=0; j<listaady.length; j++){
                if(listaady[j].Prow == fila && listaady[j].Pcolumn == columna){
                    l2.Append2(listaady[j]);
                }
            }
        
        }if(listaady[i].Pcolumn<listaady[numVertices-1].Pcolumn){
        int fila = listaady[i].Prow;
        int columna = listaady[i].Pcolumn +1;
        for(int j=0; j<listaady.length; j++){
                if(listaady[j].Prow == fila && listaady[j].Pcolumn == columna){
                   listaady[i].lista.Append2(listaady[j]);
                } 
        }
        }if(listaady[i].Prow>1){
        int fila = listaady[i].Prow-1;
        int columna = listaady[i].Pcolumn;
            for(int j=0; j<listaady.length; j++){
                    if(listaady[j].Prow == fila && listaady[j].Pcolumn == columna){
                       l2.Append2(listaady[j]);
                    } 
            }
        }if(listaady[i].Prow<listaady[numVertices-1].Prow){
        int fila = listaady[i].Prow+1;
        int columna = listaady[i].Pcolumn;
            for(int j=0; j<listaady.length; j++){
                    if(listaady[j].Prow == fila && listaady[j].Pcolumn == columna){
                       l2.Append2(listaady[j]);
                    } 
            }
        }if(listaady[i].Pcolumn>1 && listaady[i].Prow>1){
        int fila = listaady[i].Prow-1;
        int columna = listaady[i].Pcolumn-1; 
            for(int j=0; j<listaady.length; j++){
                        if(listaady[j].Prow == fila && listaady[j].Pcolumn == columna){
                           l2.Append2(listaady[j]);
                        } 
                }
        }if(listaady[i].Pcolumn>1 && listaady[i].Prow<listaady[numVertices-1].Prow){
        int fila = listaady[i].Prow+1;
        int columna = listaady[i].Pcolumn-1; 
            for(int j=0; j<listaady.length; j++){
                        if(listaady[j].Prow == fila && listaady[j].Pcolumn == columna){
                           listaady[i].lista.Append2(listaady[j]);
                        } 
                }
        }if(listaady[i].Pcolumn<listaady[numVertices-1].Pcolumn && listaady[i].Prow<listaady[numVertices-1].Prow){
            int fila = listaady[i].Prow+1;
            int columna = listaady[i].Pcolumn+1; 
            for(int j=0; j<listaady.length; j++){
                        if(listaady[j].Prow == fila && listaady[j].Pcolumn == columna){
                           l2.Append2(listaady[j]);
                        } 
                }
        }if(listaady[i].Pcolumn<listaady[numVertices-1].Pcolumn && listaady[i].Prow>1){
            int fila = listaady[i].Prow-1;
            int columna = listaady[i].Pcolumn+1; 
            for(int j=0; j<listaady.length; j++){
                        if(listaady[j].Prow == fila && listaady[j].Pcolumn == columna){
                           l2.Append2(listaady[j]);
                        } 
                }
        }
        listaady[i].lista = l2;
    }
    }
    
    
    
    public void unir(int i){
     
     Lista l2 = new Lista();
        l2.Append2(listaady[i]);
        if(listaady[i].Pcolumn>1){
            int fila = listaady[i].Prow;
            int columna = listaady[i].Pcolumn -1;
            for(int j=0; j<listaady.length; j++){
                if(listaady[j].Prow == fila && listaady[j].Pcolumn == columna){
                    l2.Append2(listaady[j]);
                }
            }
        
        }if(listaady[i].Pcolumn<listaady[numVertices-1].Pcolumn){
        int fila = listaady[i].Prow;
        int columna = listaady[i].Pcolumn +1;
        for(int j=0; j<listaady.length; j++){
                if(listaady[j].Prow == fila && listaady[j].Pcolumn == columna){
                   listaady[i].lista.Append2(listaady[j]);
                } 
        }
        }if(listaady[i].Prow>1){
        int fila = listaady[i].Prow-1;
        int columna = listaady[i].Pcolumn;
            for(int j=0; j<listaady.length; j++){
                    if(listaady[j].Prow == fila && listaady[j].Pcolumn == columna){
                       l2.Append2(listaady[j]);
                    } 
            }
        }if(listaady[i].Prow<listaady[numVertices-1].Prow){
        int fila = listaady[i].Prow+1;
        int columna = listaady[i].Pcolumn;
            for(int j=0; j<listaady.length; j++){
                    if(listaady[j].Prow == fila && listaady[j].Pcolumn == columna){
                       l2.Append2(listaady[j]);
                    } 
            }
        }if(listaady[i].Pcolumn>1 && listaady[i].Prow>1){
        int fila = listaady[i].Prow-1;
        int columna = listaady[i].Pcolumn-1; 
            for(int j=0; j<listaady.length; j++){
                        if(listaady[j].Prow == fila && listaady[j].Pcolumn == columna){
                           l2.Append2(listaady[j]);
                        } 
                }
        }if(listaady[i].Pcolumn>1 && listaady[i].Prow<listaady[numVertices-1].Prow){
        int fila = listaady[i].Prow+1;
        int columna = listaady[i].Pcolumn-1; 
            for(int j=0; j<listaady.length; j++){
                        if(listaady[j].Prow == fila && listaady[j].Pcolumn == columna){
                           listaady[i].lista.Append2(listaady[j]);
                        } 
                }
        }if(listaady[i].Pcolumn<listaady[numVertices-1].Pcolumn && listaady[i].Prow<listaady[numVertices-1].Prow){
            int fila = listaady[i].Prow+1;
            int columna = listaady[i].Pcolumn+1; 
            for(int j=0; j<listaady.length; j++){
                        if(listaady[j].Prow == fila && listaady[j].Pcolumn == columna){
                           l2.Append2(listaady[j]);
                        } 
                }
        }if(listaady[i].Pcolumn<listaady[numVertices-1].Pcolumn && listaady[i].Prow>1){
            int fila = listaady[i].Prow-1;
            int columna = listaady[i].Pcolumn+1; 
            for(int j=0; j<listaady.length; j++){
                        if(listaady[j].Prow == fila && listaady[j].Pcolumn == columna){
                           l2.Append2(listaady[j]);
                        } 
                }
        }
        listaady[i].lista = l2;
        listaady[i].lista.recorrer();
     }
    
    public Casilla generarMina(){
    Random m = new Random();
    int mina = 0;
    Lista lol = new Lista();
        while(mina != num_minas){
        int pFilas = m.nextInt(filas);
        int pColumnas = m.nextInt(columnas);
            for(int i=0; i<listaady.length; i++){
            if(listaady[i].Prow == pFilas && listaady[i].Pcolumn == pColumnas){
            listaady[i].Mine = true;
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
    Casilla aux = listaady[i].lista.pFirst;
    while(aux!=null){
        if(aux.Mine == true){
        listaady[i].mineAdy++;
        aux = aux.pNext;
        }else{
        aux = aux.pNext;
        } 
    }
    }
    }
    
    public void imprimir(){
        for(int i=0;i<listaady.length;i++){
        System.out.print(listaady[i].mineAdy);
        
        
        }
    }
    
    
    public void ponerBandera(int fila, int columna){
    for(int i=0; i<listaady.length ; i++){
    if(listaady[i].Prow == fila && listaady[i].Pcolumn == columna){
        listaady[i].bandera = true;
    }
    }
    }
    
    public void quitarBandera(int fila, int columna){
    for(int i=0; i<listaady.length ; i++){
    if(listaady[i].Prow == fila && listaady[i].Pcolumn == columna && listaady[i].bandera == true){
        listaady[i].bandera = false;
    }else if(listaady[i].Prow == fila && listaady[i].Pcolumn == columna && listaady[i].bandera == false){
        JOptionPane.showMessageDialog(null,"No hay bandera aqui, intente de nuevo");
    }
    }
    }
    
    public void barrerCasilla(int fila, int columna){
        // Hay que hacerle una validacion antes
        for(int i=0; i<listaady.length; i++){
            if(listaady[i].Prow == fila && listaady[i].Pcolumn == columna){
                if(listaady[i].Mine == true){
                // Muestra todos los numeros de las casillas
                
                JOptionPane.showMessageDialog(null, "Perdiste");
                }else if(listaady[i].Mine == false && listaady[i].mineAdy>0){
                // Muestra la casilla
                }else if(listaady[i].Mine == false && listaady[i].mineAdy==0){
                //DFS o BFS
                }
            }

            break;
        }
     
    }
    public void unir3(int i){
     Lista l2 = new Lista();
        l2.Append2(listaady[i]);
        if(listaady[i].Pcolumn>1){
            int fila = listaady[i].Prow;
            int columna = listaady[i].Pcolumn -1;
            for(int j=0; j<listaady.length; j++){
                if(listaady[j].Prow == fila && listaady[j].Pcolumn == columna){
                    l2.Append2(listaady[j]);
                }
            }
        }if(listaady[i].Pcolumn<listaady[numVertices-1].Pcolumn){
            int fila = listaady[i].Prow;
            int columna = listaady[i].Pcolumn +1;
            for(int j=0; j<listaady.length;j++){
                if(listaady[j].Prow == fila && listaady[j].Pcolumn == columna){
                    l2.Append2(listaady[j]);
                }
            }
        }if(listaady[i].Prow>1){
            int fila = listaady[i].Prow - 1;
            int columna = listaady[i].Pcolumn;
            for(int j=0; j<listaady.length;j++){
                if(listaady[j].Prow == fila && listaady[j].Pcolumn == columna){
                    l2.Append2(listaady[j]);
                }
            }
        }if(listaady[i].Prow<listaady[numVertices-1].Prow){
            int fila = listaady[i].Prow + 1;
            int columna = listaady[i].Pcolumn;
            for(int j=0; j<listaady.length;j++){
                if(listaady[j].Prow == fila && listaady[j].Pcolumn == columna){
                    l2.Append2(listaady[j]);
                }
            }
        }if(listaady[i].Pcolumn>1 && listaady[i].Prow>1){
        int fila = listaady[i].Prow-1;
        int columna = listaady[i].Pcolumn-1; 
            for(int j=0; j<listaady.length; j++){
                        if(listaady[j].Prow == fila && listaady[j].Pcolumn == columna){
                           l2.Append2(listaady[j]);
                        } 
                }
        }if(listaady[i].Pcolumn<listaady[numVertices-1].Pcolumn && listaady[i].Prow>1){
        int fila = listaady[i].Prow + 1;
        int columna = listaady[i].Pcolumn - 1;
            for(int j=0; j<listaady.length; j++){
                        if(listaady[j].Prow == fila && listaady[j].Pcolumn == columna){
                           l2.Append2(listaady[j]);
                        } 
                }
        }if(listaady[i].Pcolumn<listaady[numVertices-1].Pcolumn && listaady[i].Prow<listaady[numVertices-1].Prow){
        int fila = listaady[i].Prow +1;
        int columna = listaady[i].Pcolumn +1;
            for(int j=0; j<listaady.length; j++){
                        if(listaady[j].Prow == fila && listaady[j].Pcolumn == columna){
                           l2.Append2(listaady[j]);
                        } 
                }
        }if(listaady[i].Pcolumn>1 && listaady[i].Prow<listaady[numVertices-1].Prow){
        int fila = listaady[i].Prow -1;
        int columna = listaady[i].Pcolumn +1;
            for(int j=0; j<listaady.length; j++){
                        if(listaady[j].Prow == fila && listaady[j].Pcolumn == columna){
                           l2.Append2(listaady[j]);
                        } 
                }
        }
        listaady[i].lista = l2;
        
     }
        
    public void unirAristas2(){
    for(int i=0; i<listaady.length; i++){
    unir3(i);
    }
    }
    
    public int ind(int f, int c){
    for(int i=0; i<listaady.length; i++){
    if(listaady[i].Prow == f && listaady[i].Pcolumn == c){
        return i;
    }
    }
    return 0;
    }
    

    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
