/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp6_3;

/**
 *
 * @author Usuario
 */
public class Tp6_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // 1️⃣ Crear universidad
        Universidad uni = new Universidad("UTN");

        // 2️⃣ Crear profesores
        Profesor p1 = new Profesor("P1", "Ana López", "Programación");
        Profesor p2 = new Profesor("P2", "Carlos Pérez", "Bases de Datos");
        Profesor p3 = new Profesor("P3", "Lucía Gómez", "Sistemas Operativos");

        // 3️⃣ Crear cursos
        Curso c1 = new Curso("C1", "Introducción a la Programación");
        Curso c2 = new Curso("C2", "Programación Avanzada");
        Curso c3 = new Curso("C3", "Base de Datos I");
        Curso c4 = new Curso("C4", "Sistemas Operativos");
        Curso c5 = new Curso("C5", "Arquitectura de Computadoras");

        // 4️⃣ Agregar a la universidad
        uni.agregarProfesor(p1);
        uni.agregarProfesor(p2);
        uni.agregarProfesor(p3);

        uni.agregarCurso(c1);
        uni.agregarCurso(c2);
        uni.agregarCurso(c3);
        uni.agregarCurso(c4);
        uni.agregarCurso(c5);

        // 5️⃣ Asignar profesores
        uni.asignarProfesorACurso("C1", "P1");
        uni.asignarProfesorACurso("C2", "P1");
        uni.asignarProfesorACurso("C3", "P2");
        uni.asignarProfesorACurso("C4", "P3");

        // 6️⃣ Listar todo
        uni.listarCursos();
        uni.listarProfesores();

        // 7️⃣ Cambiar profesor de un curso
        uni.asignarProfesorACurso("C4", "P2");

        // Verificar sincronización
        uni.listarCursos();
        uni.listarProfesores();

        // 8️⃣ Eliminar curso
        uni.eliminarCurso("C3");
        uni.listarProfesores();

        // 9️⃣ Eliminar profesor
        uni.eliminarProfesor("P1");
        uni.listarCursos();

        // 🔟 Reporte
        uni.reporteCursosPorProfesor();
    }
    
}
