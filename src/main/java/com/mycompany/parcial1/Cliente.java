
package com.mycompany.parcial1;


public class Cliente {
   String nombre;
   String direccion;
   String listaPedidos;

    public Cliente(String nombre, String direccion, String listaPedidos) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.listaPedidos = listaPedidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getListaPedidos() {
        return listaPedidos;
    }

    public void setListaPedidos(String listaPedidos) {
        this.listaPedidos = listaPedidos;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", direccion=" + direccion + ", listaPedidos=" + listaPedidos + '}';
    }
   
}
