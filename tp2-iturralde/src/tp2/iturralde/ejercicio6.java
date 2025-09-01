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
public class ejercicio6 {
     public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
           
        
        int contPositivos = 0, contNegativos = 0, contCeros = 0, num;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Ingrese el numero " + i + ": ");
            num = Integer.parseInt(scan.nextLine());
            
            // Verificamos si es igual a 0, menor a 0 o mayor a 0
            if(num > 0) {
                contPositivos++; 
            } else if (num < 0) {
                contNegativos++;
            } else if (num == 0){
                contCeros++;
            }
        }
        
        System.out.println("Resultados");
        System.out.print("Positivos: " + contPositivos + "\n");
        System.out.print("Negativos: " + contNegativos + "\n");
        System.out.print("Ceros: " + contCeros);
        
    }
}
