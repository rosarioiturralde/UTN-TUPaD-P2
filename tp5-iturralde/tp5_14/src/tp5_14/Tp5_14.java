/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5_14;

/**
 *
 * @author Usuario
 */
public class Tp5_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear proyectos
        Proyecto proyecto1 = new Proyecto("Video Tutorial Java", 15);
        Proyecto proyecto2 = new Proyecto("Spot Publicitario", 5);

        // Crear editor de video
        EditorVideo editor = new EditorVideo();

        // Exportar proyectos (dependencia de creación)
        editor.exportar("MP4", proyecto1);
        editor.exportar("AVI", proyecto2);
    }
    
}
