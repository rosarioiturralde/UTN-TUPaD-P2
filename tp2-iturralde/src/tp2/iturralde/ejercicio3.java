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
public class ejercicio3 {
    
     public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int edad; 
        String etapaVida = "";
        
        System.out.println("Ingrese su edad:");
        edad = Integer.parseInt(scan.nextLine());
        
        if(edad < 12) {
            etapaVida = "Niño";
        } else if (edad >= 12 && edad <= 17) {
            etapaVida = "Adolescente";
        } else if (edad >= 18 && edad <= 59) {
            etapaVida = "Adulto";
        } else if (edad >= 60 ) {
            etapaVida = "Adulto mayor";
        } 
            
        System.out.println("Eres un " + etapaVida);
    } 
}
