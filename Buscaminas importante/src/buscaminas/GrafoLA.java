 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buscaminas;

/**
 * Una implementaci&oacute;n de grafos usando listas adyacentes.La lisa mantendra
 un control de cada nueva casilla a la que se le asigna una mina.
 * @author LeBron
 * @param <T>
 */
public class GrafoLA <T>{
   
    private Casilla  pfirst;
    int numVertices;
    
    
    public GrafoLA () {
        pfirst = null;
       numVertices = 0;
        
    }
    
    //public GrafoLA (int max, boolean d) {
       // numVertices = 0;
        //dirigido = d;
       // maxNodos = max;
        //listaAdy = new Lista[max];
   // }
    
   // public void insertaArista (int i, int j) {
       // if (i >= numVertices){
            //throw new IllegalArgumentException("No existe tal vertice en el grafo");
        //}else{    
            //listaAdy[i].Append(j);
            //if(!dirigido)
                //listaAdy[j].Append(i);
       // }
    }
    
   // public void eliminaArista (int i, int j) {
       // if (i >= numVertices){
          //  throw new IllegalArgumentException("No existe tal vertice en el grafo");
       // }else{    
            //listaAdy[i].Delete(j);
           // if(!dirigido)
                //listaAdy[j].Delete(i);
        //}
    //}
//}
