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
public class ejercicio8 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        double precio, impuesto, descuento;
        
        System.out.println("Ingrese el precio base del producto:");
        precio = scan.nextDouble();
        
        System.out.println("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%):");
        impuesto = scan.nextDouble();
        
        // Le pedimos al usuario el porcentaje de descuento
        System.out.println("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%):");
        descuento = scan.nextDouble();
        
        // Alojamos el retorno del metodo en una variable
        double precioFinal = calcularPrecioFinal(precio, impuesto, descuento);
        
        System.out.println("El precio final del producto es: $" + precioFinal);
    }
    
        public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento){
        double precioFinal = precioBase + ((precioBase * impuesto)/100) - ((precioBase * descuento)/100);
        return precioFinal;
    }
}
