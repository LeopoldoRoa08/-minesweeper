/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buscaminas;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
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
    System.out.print(listaady[numVertices].Prow);
    System.out.println(listaady[numVertices].Pcolumn);
    numVertices++;
    System.out.print(numVertices);
    } 
    }
    System.out.print(listaady[numVertices-1].Pcolumn);
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
    
    public void adyacency(){
    listaady[7].lista.recorrer();
    }
    
    
    
    public void generarMina(int minas){
    Random m = new Random();
    int mina = 0;
    while(minas != num_minas){
    int pFilas = m.nextInt(filas);
    int pColumnas = m.nextInt(columnas);
    for(int i=0; i<listaady.length; i++){
    if(listaady[i].Prow == pFilas && listaady[i].Pcolumn == pColumnas){
    listaady[i].Mine = true;
    mina++;
    }
    }
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
        //Ver despues
        
    }
    
    
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
