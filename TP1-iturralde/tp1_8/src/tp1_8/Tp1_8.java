/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_8;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Tp1_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el primer número entero: ");
        int num1 = entrada.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        int num2 = entrada.nextInt();

        if (num2 != 0) {
            int resultado = num1 / num2;
            System.out.println("Resultado de la división entera: " + resultado);
        } else {
            System.out.println("Error: no se puede dividir por cero.");
        }

        entrada.close();
    }


    }
    