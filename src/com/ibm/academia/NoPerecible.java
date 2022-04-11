package com.ibm.academia;

public class NoPerecible extends Producto {

    private Integer contenido;
    private Integer calorias;

    public NoPerecible(String nombre, Double precio, Integer contenido, Integer calorias) {
        super(nombre, precio);
        this.contenido = contenido;
        this.calorias = calorias;
    }

    public Integer getContenido() {
        return contenido;
    }

    public Integer getCalorias() {
        return calorias;
    }

    public String toString() {
        return super.toString() + "\nContenido: " + contenido + "\nCalorias: " + calorias;
    }

}
