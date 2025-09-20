/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5_8;

/**
 *
 * @author Usuario
 */
public class Documento {
 private String titulo;
    private String contenido;
    private FirmaDigital firmaDigital; // composición

    public Documento(String titulo, String contenido) {
        this.titulo = titulo;
        this.contenido = contenido;
    }

     public void firmarDocumento(Usuario usuario, String codigoHash, String fecha) {
        this.firmaDigital = new FirmaDigital(codigoHash, fecha, usuario);
    }
     
     public void mostrarDocumento() {
        System.out.println("Documento: " + titulo);
        System.out.println("Contenido: " + contenido);
        if (firmaDigital != null) {
            System.out.println("Firmado por: " + firmaDigital.getUsuario().getNombre() + 
                               " (" + firmaDigital.getUsuario().getEmail() + ")");
            System.out.println("Hash: " + firmaDigital.getCodigoHash() + 
                               " - Fecha: " + firmaDigital.getFecha());
        } else {
            System.out.println("Documento sin firmar.");
        }
    }
}
