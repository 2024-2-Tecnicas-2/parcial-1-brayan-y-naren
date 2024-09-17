package com.mycompany.parcial1;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
public static Scanner sc = new Scanner(System.in);
    static ArrayList<Producto> inventario = new ArrayList<>();

    public static void main(String[] args) {
        int opc;
        while (true) {
            System.out.println("--------------------------------------------------------");
            System.out.println("1. Agregar dispositivos");
            System.out.println("2. Vender dispositivos");
            System.out.println("3. Mostrar dispositivos");
            System.out.println("4. Calcular valor total de inventario");
            System.out.print("Ingrese una opción: ");
            opc = Integer.parseInt(sc.nextLine());
            switch (opc) {
                case 1:
                    System.out.println("1. Laptop");
                    System.out.println("2. Smartphone");
                    System.out.println("3. Tablet");
                    System.out.print("Ingrese una opción: ");
                    opc = Integer.parseInt(sc.nextLine());
                    switch (opc) {
                        case 1: {
                            Laptop newLaptop = new Laptop();
                            System.out.print("Ingrese la nombre de la laptop: ");
                            String nombre = sc.nextLine();
                            newLaptop.setNombre(nombre);
                            System.out.print("Ingrese el nombre del decripcion: ");
                            String Descripcion = sc.nextLine();
                            newLaptop.setDescripcion(Descripcion);
                            System.out.print("Ingrese el Stock donde se ubicará: ");
                            int inventario = Integer.parseInt(sc.nextLine());
                            newLaptop.setInventario(inventario);
                            System.out.print("Ingrese el precio: ");
                            double precio = Double.parseDouble(sc.nextLine());
                            newLaptop.setPrecio(precio);
                            agregarDispositivo(newLaptop);
                            break;
                        }
                        case 2: {
                            Telefono newTelefono = new Telefono();
                            System.out.print("Ingrese la nombre de la laptop: ");
                            String nombre = sc.nextLine();
                            newTelefono.setNombre(nombre);
                            System.out.print("Ingrese el nombre del decripcion: ");
                            String Descripcion = sc.nextLine();
                            newTelefono.setDescripcion(Descripcion);
                            System.out.print("Ingrese el Stock donde se ubicará: ");
                            int inventario = Integer.parseInt(sc.nextLine());
                            newTelefono.setInventario(inventario);
                            System.out.print("Ingrese el precio: ");
                            double precio = Double.parseDouble(sc.nextLine());
                            newTelefono.setPrecio(precio);
                            agregarDispositivo(newTelefono);
                            break;
                        
                        }
                        case 3: {
                            Accesorio newAccesorio = new Accesorio();
                            System.out.print("Ingrese la nombre de la Accesorio: ");
                            String nombre = sc.nextLine();
                            newAccesorio.setNombre(nombre);
                            System.out.print("Ingrese el nombre del decripcion: ");
                            String Descripcion = sc.nextLine();
                            newAccesorio.setDescripcion(Descripcion);
                            System.out.print("Ingrese el Stock donde se ubicará: ");
                            int inventario = Integer.parseInt(sc.nextLine());
                            newAccesorio.setInventario(inventario);
                            System.out.print("Ingrese el precio: ");
                            double precio = Double.parseDouble(sc.nextLine());
                            newAccesorio.setPrecio(precio);
                            agregarDispositivo(newAccesorio);
                            break;
                        }
                        default:
                            System.out.println("Ingrese una opción correcta");
                            break;
                    }
                    break;
                case 2:
                    mostrarInventario();
                    System.out.print("El dispositivo que van a comprar (índice): ");
                    int index = Integer.parseInt(sc.nextLine());
                    System.out.print("Ingrese la cantidad: ");
                    int cantidad = Integer.parseInt(sc.nextLine());
                    venderDispositivo(index, cantidad);
                    break;
                case 3:
                    mostrarInventario();
                    break;
                case 4:
                    System.out.println("Total de dinero de todos los dispositivos: " + calcularValorTotalInventario());
                    break;
                default:
                    System.out.println("Ingrese una opción correcta");
                    break;
            }
        }
    }

    public static void agregarDispositivo(Producto dispositivo) {
        inventario.add(dispositivo);
    }

    public static void venderDispositivo(int index, int cantidad) {
        if (index < 0 || index >= inventario.size()) {
            System.out.println("Índice inválido");
            return;
        }

        Producto dispositivo = inventario.get(index);

        // Verifica si el dispositivo tiene suficiente stock
        if (cantidad > dispositivo.getInventario()) {
            System.out.println("No hay suficiente stock para completar la venta.");
            return;
        }

        // Reduce la cantidad de stock
        dispositivo.setInventario(dispositivo.getInventario() - cantidad);

        // Opcional: Si el stock llega a 0, puedes eliminar el dispositivo del inventario
        if (dispositivo.getInventario() == 0) {
            inventario.remove(index);
            System.out.println("El dispositivo " + dispositivo.getNombre() + " ha sido vendido y removido del inventario.");
        } else {
            System.out.println("Se han vendido " + cantidad + " unidades del dispositivo " + dispositivo.getNombre() + ".");
        }
    }

    public static void mostrarInventario() {
        if (inventario.isEmpty()) {
            System.out.println("El inventario está vacío.");
        } else {
            System.out.println("Inventario de dispositivos:");
            for (int i = 0; i < inventario.size(); i++) {
                Producto dispositivo = inventario.get(i);
                System.out.println((i + 1) + ". " + dispositivo.toString());
            }
        }
    }

    public static double calcularValorTotalInventario() {
        double suma = 0;
        for (Producto dispositivo : inventario) {
            suma += dispositivo.getPrecio();
        }
        return suma;
    }
}
