/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5_13;

/**
 *
 * @author Usuario
 */
public class CodigoQR {
    private String datos;
    private Usuario usuario; // Asociación unidireccional hacia Usuario

    // Constructor
    public CodigoQR(String datos, Usuario usuario) {
        this.datos = datos;
        this.usuario = usuario;
    }
    
    // Getters
    public String getDatos() {
        return datos;
    }

    public Usuario getUsuario() {
        return usuario;
    }
}
