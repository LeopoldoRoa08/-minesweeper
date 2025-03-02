/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buscaminas;

/**
 *
 * @author leopo
 */

 public class Tablero {
    private int rows;
    private int columns;
    private GrafoLA<Integer> grafo;
    private Casilla[][]casillas;

    public Tablero(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.grafo = new GrafoLA<>(rows*columns,false);
        this.casillas=new Casilla[rows][columns];
        
    }
    
    
    private void inicializarTablero() {
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns; c++) {
                casillas[r][c] = new Casilla<>(r, c); // Inicializar casilla
                int index = r * columns + c;
                if (r > 0) grafo.insertaArista(index, (r - 1) * columns + c); // Celda de arriba
                if (r < rows - 1) grafo.insertaArista(index, (r + 1) * columns + c); // Celda de abajo
                if (c > 0) grafo.insertaArista(index, r * columns + (c - 1)); // Celda a la izquierda
                if (c < columns - 1) grafo.insertaArista(index, r * columns + (c + 1)); // Celda a la derecha
            }
        }
        grafo.numVertices = rows * columns; // Establecer el número de vértices
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public GrafoLA<Integer> getGrafo() {
        return grafo;
    }

    public Casilla[][] getCasillas() {
        return casillas;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public void setGrafo(GrafoLA<Integer> grafo) {
        this.grafo = grafo;
    }

    public void setCasillas(Casilla[][] casillas) {
        this.casillas = casillas;
    }
    
    
    
}
