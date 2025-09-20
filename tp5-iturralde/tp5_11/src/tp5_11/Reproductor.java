/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5_11;

/**
 *
 * @author Usuario
 */
public class Reproductor {
    // Método que usa Cancion como parámetro (Dependencia de uso)
    public void reproducir(Cancion cancion) {
        System.out.println("Reproduciendo: " + cancion.getTitulo() +
                           " de " + cancion.getArtista().getNombre());
    }
}
