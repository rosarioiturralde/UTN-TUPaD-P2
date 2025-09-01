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
    // atributos de la consigna para la clase estudiante
private String nombre;
private String apellido;
private String curso;
private double calificacion;

// Constructor para inicializar un estudiante
public Estudiante(String nombre, String apellido, String curso, double calificacion) {
this.nombre = nombre;
this.apellido = apellido;
this.curso = curso;
setCalificacion(calificacion); // Usamos setter para aplicar reglas de validación
}
 // Método para mostrar la información del estudiante
public void mostrarInfo() {
System.out.println("Estudiante: " + apellido + ", " + nombre);
System.out.println("Curso: " + curso);
System.out.println("Calificación: " + calificacion);
}

// Método para subir la calificación del estudiante
public void subirCalificacion(double puntos) {
// Verificamos si al sumar los puntos la calificación no supera el máximo permitido (10)
if (calificacion + puntos <= 10) {
// Si no supera el máximo, aumentamos la calificación
calificacion += puntos;
// Mostramos un mensaje con la nueva calificación
System.out.println("La calificación ha aumentado a: " + calificacion);
} else {
// Si supera el máximo, mostramos un mensaje de error
System.out.println("Error: No se puede superar la calificación máxima de 10.");
}
}

// Método para bajar la calificación del estudiante
public void bajarCalificacion(double puntos) {
    // Verificamos si al restar los puntos la calificación no es menor que el mínimo permitido (0)
if (calificacion - puntos >= 0) {
// Si no es menor que 0, disminuimos la calificación
calificacion -= puntos;
// Mostramos un mensaje con la nueva calificación
System.out.println("La calificación ha disminuido a: " + calificacion);
} else {
// Si es menor que 0, mostramos un mensaje de error
System.out.println("Error: No se puede tener una calificación menor a 0.");
}
}

// Getters y Setters para encapsulación y validación
public String getNombre() {
return nombre;
}
public void setNombre(String nombre) {
this.nombre = nombre;
}
public String getApellido() {
return apellido;
}
public void setApellido(String apellido) {
this.apellido = apellido;
}
public String getCurso() {
return curso;
}
public void setCurso(String curso) {
this.curso = curso;
}
public double getCalificacion() {
return calificacion;
}

public void setCalificacion(double calificacion) {
if (calificacion < 0) {
this.calificacion = 0; // Evita valores negativos
} else if (calificacion > 10) {
this.calificacion = 10; // Evita valores mayores a 10
} else {
this.calificacion = calificacion;
}
}
}
