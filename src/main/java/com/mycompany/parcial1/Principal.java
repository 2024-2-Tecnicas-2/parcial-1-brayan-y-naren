package com.mycompany.parcial1;

import java.util.Scanner;

public class Principal {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Bienvenido a Dispositivos SA");
        System.out.println("1) Registrar nuevo producto");
        System.out.println("2) Registrar pedido");
        System.out.println("3) Mostrar inventario");
        System.out.println("4) Salir");
    }
     System.out.println("Ingrese una opcion: ")
    int opc = sc.nextInt();
    switch (opc) {
        case 1:
            
            break;
        case 2:
            break;
        case 3:
            break;
        case 4:
          break;
            System.out.println("Gracias por usar nuestro sistema, hasta pronto");
          
        default:
            System.out.println("Valor incorrecto");
    }
}
