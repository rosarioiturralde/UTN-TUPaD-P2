/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_4;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Tp1_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Solicitar el nombre
        try ( // Crear un objeto Scanner para leer desde la consola
                Scanner entrada = new Scanner(System.in)) {
            // Solicitar el nombre
            System.out.print("Ingrese su nombre: ");
            String nombre = entrada.nextLine();
            // Solicitar la edad
            System.out.print("Ingrese su edad: ");
            int edad = entrada.nextInt();
            // Mostrar los datos ingresados
            System.out.println("Nombre ingresado: " + nombre);
            System.out.println("Edad ingresada: " + edad);
            // Cerrar el Scanner
        }


    }
    
}
