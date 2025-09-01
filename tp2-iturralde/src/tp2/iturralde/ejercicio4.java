/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2.iturralde;

import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class ejercicio4 {
    
     public static void main(String[] args) {
        // esta linea se usa para declara que va a haber un objeto input
        Scanner input = new Scanner(System.in);
        
        // varables
        int precio;
        double precioConDescuento;
        char categoria;
        
        // Pedimos el precio al usuario
        System.out.println("Ingrese el precio del producto");
        precio = Integer.parseInt(input.nextLine());
        
        // Pedimos la categoria al usuario
        System.out.println("Ingrese la categoria del producto (A, B o C)");
        categoria = input.nextLine().charAt(0);
        
        // Utilizamos un switch para manejar las condiciones segun la categoria ingresada
        switch (categoria) {
            case 'A':
            case 'a':
                precioConDescuento = precio -(precio * 0.10);
                System.out.print("Descuento aplicado 10%");
                System.out.println("");
                System.out.print("Precio final: $" + precioConDescuento);
                break;
            case 'B':
            case 'b':
                precioConDescuento = precio -(precio * 0.15);
                System.out.print("Descuento aplicado 15%");
                System.out.println("");
                System.out.print("Precio final: $" + precioConDescuento);
                break;
            case 'C':
            case 'c':
                precioConDescuento = precio -(precio * 0.20);
                System.out.print("Descuento aplicado 20%");
                System.out.println("");
                System.out.print("Precio final: $" + precioConDescuento);
                break;
            default:
                System.out.println("No ingreso una categoria valida");
                break;
        }
        
     }    
    
}
