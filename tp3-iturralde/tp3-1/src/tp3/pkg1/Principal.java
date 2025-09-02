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
        
        Estudiante estudiante1 = new Estudiante();
        
        estudiante1.nombre ="Rosario";
        estudiante1.apellido ="Iturralde";  
        estudiante1.curso= "Programacion 2";
        estudiante1.calificacion = 9.5;
        
// Mostrar información inicial del estudiante
System.out.println("Datos estudiante: " 
        + estudiante1.nombre
        + estudiante1.apellido
        + ", " + "curso " 
        + estudiante1.curso 
        + "nota " 
        + estudiante1.calificacion);

System.out.println("\n--- Intentando subir la calificación en 0.5 puntos ---");
estudiante1.subirCalificacion(0.5);
System.out.println("\n--- Intentando bajar la calificación en 3 puntos ---");
estudiante1.bajarCalificacion(3);
System.out.println("\n--- Información Final ---");
estudiante1.mostrarInfo();
    }
    
}
