/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5_8;

/**
 *
 * @author Usuario
 */
public class Tp5_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Usuario usuario = new Usuario("Rosario Iturralde", "rosario_iturralde@hotmail.com");
        Documento documento = new Documento("Contrato", "Este es el contenido del contrato...");

        documento.firmarDocumento(usuario, "ABC123XYZ", "2025-09-16");
        documento.mostrarDocumento();
    }
    
}
