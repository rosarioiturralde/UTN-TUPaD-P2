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
public class Universidad {
    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    public void agregarProfesor(Profesor p) {
        profesores.add(p);
    }

    public void agregarCurso(Curso c) {
        cursos.add(c);
    }

    public Profesor buscarProfesorPorId(String id) {
        for (Profesor p : profesores) {
            if (p.getId().equalsIgnoreCase(id)) {
                return p;
            }
        }
        return null;
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso c : cursos) {
            if (c.getCodigo().equalsIgnoreCase(codigo)) {
                return c;
            }
        }
        return null;
    }

    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor profesor = buscarProfesorPorId(idProfesor);

        if (curso == null || profesor == null) {
            System.out.println("❌ No se encontró el curso o profesor.");
            return;
        }

        curso.setProfesor(profesor);
        System.out.println("✅ Asignado " + profesor.getNombre() + " al curso " + curso.getNombre());
    }

    public void listarProfesores() {
        System.out.println("👨‍🏫 Profesores de la universidad:");
        for (Profesor p : profesores) {
            p.mostrarInfo();
            p.listarCursos();
            System.out.println("--------------------------");
        }
    }

    public void listarCursos() {
        System.out.println("📚 Cursos de la universidad:");
        for (Curso c : cursos) {
            c.mostrarInfo();
        }
        System.out.println("--------------------------");
    }

    public void eliminarCurso(String codigo) {
        Curso curso = buscarCursoPorCodigo(codigo);
        if (curso != null) {
            if (curso.getProfesor() != null) {
                curso.setProfesor(null); // romper relación
            }
            cursos.remove(curso);
            System.out.println("🗑️ Curso eliminado: " + codigo);
        } else {
            System.out.println("❌ No se encontró el curso.");
        }
    }

    public void eliminarProfesor(String id) {
        Profesor profesor = buscarProfesorPorId(id);
        if (profesor != null) {
            // dejar los cursos sin profesor
            List<Curso> copia = new ArrayList<>(cursos);
            for (Curso c : copia) {
                if (c.getProfesor() == profesor) {
                    c.setProfesor(null);
                }
            }
            profesores.remove(profesor);
            System.out.println("🗑️ Profesor eliminado: " + profesor.getNombre());
        } else {
            System.out.println("❌ No se encontró el profesor.");
        }
    }

    public void reporteCursosPorProfesor() {
        System.out.println("📊 Reporte: cantidad de cursos por profesor");
        for (Profesor p : profesores) {
            System.out.println(p.getNombre() + ": " + p.getCantidadCursos() + " cursos");
        }
    }
}
