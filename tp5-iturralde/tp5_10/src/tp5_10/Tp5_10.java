/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5_10;

/**
 *
 * @author Usuario
 */
public class Tp5_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ClaveSeguridad clave = new ClaveSeguridad("ABC123", "2025-09-10");
        CuentaBancaria cuenta = new CuentaBancaria("000123456789", 50000, clave);
        Titular titular = new Titular("Rosario Iturralde", "34150798");

        cuenta.setTitular(titular);

        cuenta.depositar(20000);
        cuenta.extraer(10000);
        cuenta.mostrarCuenta();
    }
    
}
