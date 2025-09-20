/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5_4;

/**
 *
 * @author Usuario
 */
public class Tp5_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Cliente cliente = new Cliente("Rosario Iturralde", "34150798");
        Banco banco = new Banco("Banco Nación", "30-12345678-9");
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("1234-5678-9876-5432", "12/27", cliente, banco);

        System.out.println(tarjeta);
        System.out.println("El cliente accede a su tarjeta: " + cliente.getTarjeta().getNumero());
        System.out.println("Banco emisor: " + tarjeta.getBanco().getNombre());
    }
    
}
