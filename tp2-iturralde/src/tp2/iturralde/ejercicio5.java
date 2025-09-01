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
public class ejercicio5 {
    public static void main(String[] args) {
        
        Scanner print = new Scanner(System.in);
            
        int num = 1;
        int sumaPares = 0;
        
        while(num != 0){
            System.out.println("Ingrese un numero(0 para terminar)");
            num = Integer.parseInt(print.nextLine());
            
            if(num % 2 == 0){
                sumaPares = sumaPares + num; // Acumulamos la suma de numeros pares
            }
        }
        
        System.out.println("La suma de los numeros pares es: " + sumaPares);
        
    }
    
}
