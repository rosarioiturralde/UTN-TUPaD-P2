/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5_12;

/**
 *
 * @author Usuario
 */
public class Tp5_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear contribuyentes
        Contribuyente contrib1 = new Contribuyente("Juan Perez", "20-12345678-9");
        Contribuyente contrib2 = new Contribuyente("Maria Lopez", "27-87654321-0");

        // Crear impuestos asociados a los contribuyentes
        Impuesto impuesto1 = new Impuesto(1500.50, contrib1);
        Impuesto impuesto2 = new Impuesto(2300.75, contrib2);
        
        // Crear calculadora
        Calculadora calculadora = new Calculadora();

        // Usar el método calcular (dependencia de uso)
        calculadora.calcular(impuesto1);
        calculadora.calcular(impuesto2);
    }
    
}
