/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5_12;

/**
 *
 * @author Usuario
 */
public class Calculadora {
    // Método que usa Impuesto como parámetro (Dependencia de uso)
    public void calcular(Impuesto impuesto) {
        System.out.println("Calculando impuesto de " + impuesto.getMonto() +
                           " para el contribuyente " + impuesto.getContribuyente().getNombre());
    }
}
