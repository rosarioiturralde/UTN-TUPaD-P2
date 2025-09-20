/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5_2;

/**
 *
 * @author Usuario
 */
public class Tp5_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Usuario usuario = new Usuario("María Gómez", "87654321");
        Bateria bateria = new Bateria("Samsung-123", 5000);
        Celular celular = new Celular("111222333444555", "Samsung", "Galaxy S23", bateria, usuario);

        System.out.println(celular);
        System.out.println("El usuario accede a su celular: " + usuario.getCelular().getModelo());
    }
    
}
