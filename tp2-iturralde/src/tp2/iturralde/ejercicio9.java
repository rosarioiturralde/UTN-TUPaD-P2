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
public class ejercicio9 {
     public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        double peso, precioProducto;
        String zona;
        
        System.out.println("Ingrese el precio del producto");
        precioProducto = scan.nextDouble();
        
        System.out.println("Ingrese el peso del paquete");
        peso = scan.nextDouble();
        scan.nextLine(); // Consumimos el Enter que quedó pendiente
        
        System.out.println("Ingrese la zona de envio(Nacional/Internacional)");
        zona = scan.nextLine();
        
        double costoEnvio = calcularCostoEnvio(peso, zona);
        
        double precioFinal = calcularTotalCompra(precioProducto, costoEnvio);
        
        System.out.println("El costo de envio es: " + costoEnvio);
        System.out.println("El total a pagar es: " + precioFinal);
    }
    
    
    public static double calcularCostoEnvio(double peso, String zona){
        double costoEnvio = 0;
        if(zona.equalsIgnoreCase("Nacional")){
            costoEnvio = peso * 5;
        } else if (zona.equalsIgnoreCase("Internacional")){
            costoEnvio = peso * 10;
        }
        
        return costoEnvio;
    }
    
    
    public static double calcularTotalCompra(double precioProducto, double costoEnvio){
        return precioProducto + costoEnvio;
    }
}
