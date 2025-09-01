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
public class ejercicio7 {
     public static void main(String[] args) {
        // Declaramos input para leer los datos
        Scanner input = new Scanner(System.in);
        int nota;
        
        do{
            System.out.println("Ingrese una nota(0-10)");
            nota = Integer.parseInt(input.nextLine());
            
            // En el caso que la nota sea menor que 0 o mayor a 10 lanza un mensaje de error sino lanaza un mensaje de éxito
            if(nota < 0 || nota > 10) {
                System.out.println("ERROR: nota invalida. Ingrese una nota entre 0 y 10 ");
            } else{
                System.out.println("Nota guardada correctamente");
            }
        }while(nota < 0 || nota > 10);
    }
}
