/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp6_2;

/**
 *
 * @author Usuario
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                // 1️⃣ Crear biblioteca
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");

        // 2️⃣ Crear autores
        Autor autor1 = new Autor("A1", "Gabriel García Márquez", "Colombiana");
        Autor autor2 = new Autor("A2", "Julio Cortázar", "Argentina");
        Autor autor3 = new Autor("A3", "Isabel Allende", "Chilena");

        // 3️⃣ Agregar libros
        biblioteca.agregarLibro("ISBN001", "Cien años de soledad", 1967, autor1);
        biblioteca.agregarLibro("ISBN002", "El amor en los tiempos del cólera", 1985, autor1);
        biblioteca.agregarLibro("ISBN003", "Rayuela", 1963, autor2);
        biblioteca.agregarLibro("ISBN004", "Casa de los espíritus", 1982, autor3);
        biblioteca.agregarLibro("ISBN005", "Paula", 1994, autor3);

        // 4️⃣ Listar todos los libros
        biblioteca.listarLibros();

        // 5️⃣ Buscar libro por ISBN
        biblioteca.buscarLibroPorIsbn("ISBN003");

        // 6️⃣ Filtrar libros por año
        biblioteca.filtrarLibrosPorAnio(1985);

        // 7️⃣ Eliminar un libro
        biblioteca.eliminarLibro("ISBN002");

        // Listar nuevamente
        biblioteca.listarLibros();

        // 8️⃣ Mostrar cantidad total
        biblioteca.obtenerCantidadLibros();

        // 9️⃣ Mostrar autores disponibles
        biblioteca.mostrarAutoresDisponibles();
    }
    }
    
