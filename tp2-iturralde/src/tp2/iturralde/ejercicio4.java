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
        
        Scanner scan = new Scanner(System.in);
        
        int precio;
        double precioConDescuento;
        char categoria;
        
        System.out.println("Ingrese el precio del producto");
        precio = Integer.parseInt(scan.nextLine());
        
        System.out.println("Ingrese la categoria: A, B o C)");
        categoria = scan.nextLine().charAt(0);
        
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
