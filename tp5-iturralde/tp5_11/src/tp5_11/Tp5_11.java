/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5_11;

/**
 *
 * @author Usuario
 */
public class Tp5_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Crear artistas
        Artista artista1 = new Artista("Shakira", "Pop");
        Artista artista2 = new Artista("Metallica", "Rock");

        // Crear canciones asociadas a los artistas
        Cancion cancion1 = new Cancion("Copa Vacia", artista1);
        Cancion cancion2 = new Cancion("Enter Sandman", artista2);

        // Crear reproductor
        Reproductor reproductor = new Reproductor();

        // Usar el método reproducir (dependencia de uso)
        reproductor.reproducir(cancion1);
        reproductor.reproducir(cancion2);
    }
    
}
