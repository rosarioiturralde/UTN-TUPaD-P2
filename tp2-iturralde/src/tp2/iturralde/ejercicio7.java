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
        
        Scanner scan = new Scanner(System.in);
        int nota;
        
        do{
            System.out.println("Ingrese una nota(0-10)");
            nota = Integer.parseInt(scan.nextLine());
            
            if(nota < 0 || nota > 10) {
                System.out.println("ERROR: nota invalida. Ingrese una nota entre 0 y 10 ");
            } else{
                System.out.println("Nota guardada correctamente");
            }
        }while(nota < 0 || nota > 10);
    }
}
