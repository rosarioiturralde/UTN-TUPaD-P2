/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3.pkg1;

/**
 *
 * @author Usuario
 */
public class Estudiante {
   
String nombre;
String apellido;
String curso;
double calificacion;

 // Método msostrarInfo
public void mostrarInfo() {
System.out.println("Estudiante: " + nombre + ", " + apellido);
System.out.println("Curso: " + curso);
System.out.println("Calificación: " + calificacion);
}

// Método subirCalificación,con reglas de valdación 
public void subirCalificacion(double puntos) {
if (calificacion + puntos <= 10) {
calificacion += puntos;
System.out.println("La calificación ha aumentado a: " + calificacion);
} else {
System.out.println("Error: No se puede superar la calificación máxima de 10.");
}
}

// Método para bajarCalificación, con reglas de validación
public void bajarCalificacion(double puntos) {
if (calificacion - puntos >= 0) {
// Si no es menor que 0, disminuimos la calificación
calificacion -= puntos;
System.out.println("La calificación ha disminuido a: " + calificacion);
} else {
System.out.println("Error: No se puede tener una calificación menor a 0.");
}
}

}