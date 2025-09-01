/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3.pkg1;

/**
 *
 * @author Usuario
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear un estudiante con datos iniciales
Estudiante estudiante1 = new Estudiante("Rosario", "Iturralde", "Programacion 2", 9.5);
// Mostrar información inicial del estudiante
System.out.println("\n--- Información Inicial ---");
estudiante1.mostrarInfo();
// Intentar subir la calificación en 1.5 puntos (debe ser válido)
System.out.println("\n--- Intentando subir la calificación en 0.5 puntos ---");
estudiante1.subirCalificacion(1.5);
// Intentar subir la calificación en 2 puntos (debe mostrar error porque supera 10)
System.out.println("\n--- Intentando subir la calificación en 2 puntos ---");
estudiante1.subirCalificacion(2);
// Intentar bajar la calificación en 3 puntos (debe ser válido)
System.out.println("\n--- Intentando bajar la calificación en 3 puntos ---");
estudiante1.bajarCalificacion(3);
// Intentar bajar la calificación en 10 puntos (debe mostrar error porque quedaría negativa)
System.out.println("\n--- Intentando bajar la calificación en 10 puntos ---");
estudiante1.bajarCalificacion(10);
// Mostrar información final del estudiante
System.out.println("\n--- Información Final ---");
estudiante1.mostrarInfo();
    }
    
}
