/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5_14;

/**
 *
 * @author Usuario
 */
public class EditorVideo {
    // Método que crea un Render (Dependencia de creación)
    public void exportar(String formato, Proyecto proyecto) {
        Render render = new Render(formato, proyecto); // se crea el objeto
        System.out.println("Exportando proyecto '" + proyecto.getNombre() +
                           "' en formato " + render.getFormato() +
                           " con duración " + proyecto.getDuracionMin() + " min.");
}
    }
