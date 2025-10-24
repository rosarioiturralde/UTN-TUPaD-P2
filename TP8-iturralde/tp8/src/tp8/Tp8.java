/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Usuario
 */
public class Tp8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // 1. División segura
        try {
            int a = 10;
            int b = 0;
            System.out.println("Resultado: " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("Error: División por cero.");
        }

        // 2. Conversión de cadena a número
        try {
        } catch (NumberFormatException e) {
            System.out.println("Error: Formato de número inválido.");
        }

        // 3. Lectura de archivo
        try {
            try (BufferedReader reader = new BufferedReader(new FileReader("archivo.txt"))) {
                String linea;
                while ((linea = reader.readLine()) != null) {
                    System.out.println(linea);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: Archivo no encontrado.");
        } catch (IOException e) {
            System.out.println("Error de lectura del archivo.");
        }

        // 4. Excepción personalizada
        try {
            int edad = 130;
            if (edad < 0 || edad > 120) {
                throw new EdadInvalidaException("Edad fuera de rango permitido.");
            }
        } catch (EdadInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // 5. Try-with-resources
        try (BufferedReader reader = new BufferedReader(new FileReader("archivo.txt"))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo con try-with-resources.");
        }
    }

    }
    
