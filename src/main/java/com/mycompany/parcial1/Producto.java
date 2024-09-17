package com.mycompany.parcial1;

public abstract class Producto {
    private String nombre;
    private String Descripcion;
    private int inventario;
    private double precio;

    public Producto(String nombre, String Descripcion, int inventario, double precio) {
        this.nombre = nombre;
        this.Descripcion = Descripcion;
        this.inventario = inventario;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getInventario() {
        return inventario;
    }

    public void setInventario(int inventario) {
        this.inventario = inventario;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}
