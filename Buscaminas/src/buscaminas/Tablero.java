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
