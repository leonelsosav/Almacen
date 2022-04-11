package com.ibm.academia;

public class Main {

    public static void main(String[] args) {
        Producto[] productos = new Producto[8];
        productos[0] = new Lacteo("Leche", 21.0, 10, 10);
        productos[1] = new Lacteo("Yogurth", 25.0, 20, 20);
        productos[2] = new Fruta("Pera", 7.0, 0.5, "Verde");
        productos[3] = new Fruta("Naranja", 8.0, 0.5, "Amarilla");
        productos[4] = new Limpieza("Lavatrastes", 35.0, "Aromatizante", 0.5);
        productos[5] = new Limpieza("Limpiador de baño", 25.0, "Colorante", 1.0);
        productos[6] = new NoPerecible("Jamon", 50.0, 250, 1000);
        productos[7] = new NoPerecible("Queso", 60.0, 200, 800);

        for (Producto producto : productos) {
            System.out.println(producto);
            System.out.println("---------------------------------");
        }
    }

    
}
