/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5_13;

/**
 *
 * @author Usuario
 */
public class Tp5_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   // Crear usuarios
        Usuario user1 = new Usuario("Rosario");
        Usuario user2 = new Usuario("Ignacio");

        // Crear generador de QR
        GeneradorQR generador = new GeneradorQR();

        // Generar códigos QR (dependencia de creación)
        generador.generar("https://www.ejemplo.com/perfil/rosario", user1);
        generador.generar("https://www.ejemplo.com/perfil/ignacio", user2);
}
    }
