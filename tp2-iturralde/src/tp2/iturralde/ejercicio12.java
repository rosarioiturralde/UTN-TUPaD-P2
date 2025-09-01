/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2.iturralde;

/**
 *
 * @author Usuario
 */
public class ejercicio12 {
     public static void main(String[] args) {
       
        double[] precioProducto = {199.99, 299.5, 149.75, 399.0, 89.99};
        
        System.out.println("Precios originales: ");
        for(double precio : precioProducto){
            System.out.println("Precio: " + precio);
        }
        
        
        precioProducto[2] = 129.99;
        
        
        System.out.println("Precios modificados: ");
        for(double precio : precioProducto){
            System.out.println("Precio: " + precio);
        }
    }
    
}
