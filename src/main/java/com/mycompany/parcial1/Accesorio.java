
package com.mycompany.parcial1;


public class Accesorio extends Producto {
    
    
    public Accesorio(String nombre, String Descripcion, int inventario, double precio) {
        super(nombre, Descripcion, inventario, precio);
    }
    public Accesorio(){
        super(null, null, 0, 0);
    }
}
