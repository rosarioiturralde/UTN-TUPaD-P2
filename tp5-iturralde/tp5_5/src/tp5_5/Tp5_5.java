/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5_5;

/**
 *
 * @author Usuario
 */
public class Tp5_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Propietario propietario = new Propietario("Rosario Iturralde", "34150798");
        Computadora compu = new Computadora("Asus", "SN12345", "Asus Prime", "Intel Z790", propietario);

        System.out.println(compu);
        System.out.println("El propietario accede a su computadora: " + propietario.getComputadora().getMarca());
        System.out.println("Placa madre: " + compu.getPlacaMadre().getModelo());
    }
    }
    
