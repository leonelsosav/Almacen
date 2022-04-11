package com.ibm.academia;

public class Limpieza extends Producto {

    private String componenetes;
    private Double litros;

    public Limpieza(String nombre, Double precio, String componenetes, Double litros) {
        super(nombre, precio);
        this.componenetes = componenetes;
        this.litros = litros;
    }

    public String getComponenetes() {
        return componenetes;
    }

    public Double getLitros() {
        return litros;
    }

    public String toString() {
        return super.toString() + "\nComponenetes: " + componenetes + "\nLitros: " + litros;
    }
    
}
