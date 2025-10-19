/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6_2;

import java.util.ArrayList;
import java.util.List;
import javax.lang.model.SourceVersion;

/**
 *
 * @author Usuario
 */
public class Biblioteca {
    private String nombre;
    private List<Libro> libros;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        libros.add(new Libro(isbn, titulo, anioPublicacion, autor));
    }

    public void listarLibros() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros en la biblioteca.");
        } else {
            System.out.println("📚 Libros en la biblioteca '" + nombre + "':");
            for (Libro libro : libros) {
                libro.mostrarInfo();
            }
        }
    }

    public void buscarLibroPorIsbn(String isbn) {
        for (Libro libro : libros) {
            if (libro.getIsbn().equalsIgnoreCase(isbn)) {
                System.out.println("✅ Libro encontrado:");
                libro.mostrarInfo();
                return;
            }
        }
        System.out.println("❌ No se encontró un libro con ISBN " + isbn);
    }

    public void eliminarLibro(String isbn) {
        Libro encontrado = null;
        for (Libro libro : libros) {
            if (libro.getIsbn().equalsIgnoreCase(isbn)) {
                encontrado = libro;
                break;
            }
        }
        if (encontrado != null) {
            libros.remove(encontrado);
            System.out.println("🗑️ Libro eliminado con ISBN: " + isbn);
        } else {
            System.out.println("❌ No se encontró un libro con ISBN " + isbn);
        }
    }

    public void obtenerCantidadLibros() {
        System.out.println("📘 Cantidad total de libros: " + libros.size());
    }

    public void filtrarLibrosPorAnio(int anio) {
        System.out.println("📅 Libros publicados en el año " + anio + ":");
        boolean encontrado = false;
        for (Libro libro : libros) {
            if (libro.getAnioPublicacion() == anio) {
                libro.mostrarInfo();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No hay libros de ese año.");
        }
    }

    public void mostrarAutoresDisponibles() {
        System.out.println("👩‍🏫 Autores de libros disponibles:");
        List<String> nombresAutores = new ArrayList<>();
        for (Libro libro : libros) {
            String nombreAutor = libro.getAutor().getNombre();
            if (!nombresAutores.contains(nombreAutor)) {
                nombresAutores.add(nombreAutor);
                System.out.println("- " + nombreAutor);
            }
        }
    }
}

