/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6_3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos;

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarCurso(Curso c) {
        if (!cursos.contains(c)) {
            cursos.add(c);
            if (c.getProfesor() != this) {
                c.setProfesor(this); // sincroniza el otro lado
            }
        }
    }

    public void eliminarCurso(Curso c) {
        if (cursos.remove(c)) {
            if (c.getProfesor() == this) {
                c.setProfesor(null); // rompe relación
            }
        }
    }

    public void listarCursos() {
        if (cursos.isEmpty()) {
            System.out.println(nombre + " no dicta cursos actualmente.");
        } else {
            System.out.println("Cursos dictados por " + nombre + ":");
            for (Curso c : cursos) {
                System.out.println(" - " + c.getCodigo() + " | " + c.getNombre());
            }
        }
    }

    public void mostrarInfo() {
        System.out.println("👨‍🏫 Profesor: " + nombre + " (" + especialidad + ")");
        System.out.println("ID: " + id + " | Cursos a cargo: " + cursos.size());
    }

    public int getCantidadCursos() {
        return cursos.size();
    }
}
