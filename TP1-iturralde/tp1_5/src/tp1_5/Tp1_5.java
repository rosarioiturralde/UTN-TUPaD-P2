/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_5;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Tp1_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Solicitar los dos números
        System.out.print("Ingrese el primer número entero: ");
        int num1 = entrada.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        int num2 = entrada.nextInt();

        // Realizar las operaciones
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;

        // División con verificación para evitar división por cero
        String division;
        if (num2 != 0) {
            division = String.valueOf((double) num1 / num2);
        } else {
            division = "Error: no se puede dividir por cero.";
        }

        // Mostrar los resultados
        System.out.println("\nResultados:");
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);

        entrada.close();
    }


    }
    
}
