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
public class ejercicio10 {
     public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        
        // Declaramos las variables para alojar los datos ingresados por el usuario
        int stockActual, cantidadVendida, cantidadRecibida;
        
        System.out.println("Ingrese el stock actual del producto");
        stockActual = Integer.parseInt(scan.nextLine());
        
        System.out.println("Ingrese la cantidad vendida");
        cantidadVendida = Integer.parseInt(scan.nextLine());
        
        System.out.println("Ingrese la cantidad recibida");
        cantidadRecibida = Integer.parseInt(scan.nextLine());
        
        // Llamamos al metodo actualizarStock, y alojamos el valor de retorno en una variable
        int nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);
        
        System.out.println("El nuevo stock del producto es: " + nuevoStock);
    }
    
    
    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida){
        int nuevoStock = (stockActual - cantidadVendida) + cantidadRecibida;
        return nuevoStock;
    }
}
