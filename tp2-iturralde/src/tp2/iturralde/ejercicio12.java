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
        // Declaramos el array de precios y le asignamos valores a cada posicion
        double[] precioProducto = {199.99, 299.5, 149.75, 399.0, 89.99};
        
        // Mostramos los precios originales recorriendo el array con un for-each
        System.out.println("Precios originales: ");
        for(double precio : precioProducto){
            System.out.println("Precio: " + precio);
        }
        
        //  Modificamos el precio de la posicion 2
        precioProducto[2] = 129.99;
        
        // Mostramos los precios modificados recorriendo el array con un for-each
        System.out.println("Precios modificados: ");
        for(double precio : precioProducto){
            System.out.println("Precio: " + precio);
        }
    }
    
}
