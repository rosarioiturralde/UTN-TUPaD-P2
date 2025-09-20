/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5_13;

/**
 *
 * @author Usuario
 */
public class GeneradorQR {
    // Método que crea un CodigoQR (Dependencia de creación)
    public void generar(String datos, Usuario usuario) {
        CodigoQR codigo = new CodigoQR(datos, usuario); // Aquí se crea el objeto
        System.out.println("Generando código QR para " + usuario.getNombre() +
                           " con datos: " + codigo.getDatos());
    }
}
