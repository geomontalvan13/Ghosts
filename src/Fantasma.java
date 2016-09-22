/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Fantasma {
    String nombre;
    int fila, columna;
    boolean Bueno;

    public Fantasma(String nombre, int columna, int fila, boolean Bueno) {
        this.nombre = nombre;
        this.fila = fila;
        this.columna = columna;
        this.Bueno = Bueno;
    }
    public Fantasma(String nombre, int columna, int fila) {
        this.nombre = nombre;
        this.fila = fila;
        this.columna = columna;
     
    }

}
