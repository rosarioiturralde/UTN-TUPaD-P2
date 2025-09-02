/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3.pkg3;

/**
 *
 * @author Usuario
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro libro1 = new Libro("El Principito", "Antoine de Saint-Exupéry", 1943);

        // Mostrar info inicial
        System.out.println("Información inicial del libro:");
        libro1.mostrarInfo();

        // Intentar modificar con año inválido
        System.out.println("Intentando asignar un año inválido (3000)...");
        libro1.setAñoPublicacion(3000);

        // Intentar modificar con un año válido
        System.out.println("Asignando un año válido (1980)...");
        libro1.setAñoPublicacion(1980);

        // Mostrar info final
        System.out.println("Información final del libro:");
        libro1.mostrarInfo();
    }
    
}
