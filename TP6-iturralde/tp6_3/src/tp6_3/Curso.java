/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6_3;

/**
 *
 * @author Usuario
 */
public class Curso {
   private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    // Manejo bidireccional: siempre sincroniza ambos lados
    public void setProfesor(Profesor nuevoProfesor) {
        if (this.profesor == nuevoProfesor) return;

        // Si ya tenía profesor previo, quitarlo de su lista
        if (this.profesor != null) {
            Profesor anterior = this.profesor;
            this.profesor = null;
            anterior.eliminarCurso(this);
        }

        // Asignar nuevo profesor (si no es null)
        this.profesor = nuevoProfesor;
        if (nuevoProfesor != null && !nuevoProfesor.equals(this.profesor)) {
            nuevoProfesor.agregarCurso(this);
        }
    }

    public void mostrarInfo() {
        System.out.print("📘 Curso: " + codigo + " | " + nombre);
        if (profesor != null) {
            System.out.println(" | Profesor: " + profesor.getNombre());
        } else {
            System.out.println(" | Profesor: (sin asignar)");
        }
    } 
}
