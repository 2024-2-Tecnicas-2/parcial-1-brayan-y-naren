
package com.mycompany.parcial1;


public class Telefono extends Producto {
    

    public Telefono(String nombre, String Descripcion, int inventario, double precio) {
        super(nombre, Descripcion, inventario, precio);
    }
    public Telefono(){
        super(null, null, 0, 0);
    }
}