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
public class ejercicio11 {
     
    public static final double DESCUENTO_ESPECIAL = 0.10;
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese el precio del producto");
        double precio = scan.nextDouble();
        
        calcularDescuentoEspecial(precio);
    }
    
    
        public static void calcularDescuentoEspecial(double precio){
        double descuentoAplicado = precio * DESCUENTO_ESPECIAL;
        double precioFinal = precio - descuentoAplicado;
        
        System.out.println("El descuento aplicado es de: " + descuentoAplicado);
        System.out.println("El precio final del producto es: " + precioFinal);
    }
    
}
