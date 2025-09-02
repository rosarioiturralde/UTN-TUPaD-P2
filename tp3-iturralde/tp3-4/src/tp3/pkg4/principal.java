/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3.pkg4;

/**
 *
 * @author Usuario
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        Gallina g1 = new Gallina(1, 2);
        Gallina g2 = new Gallina(2, 1);

        // Mostrar estado inicial
        System.out.println("Estado inicial de las gallinas:");
        g1.mostrarEstado();
        g2.mostrarEstado();

        // Simular acciones
        System.out.println("Simulación en la granja...");
        g1.ponerHuevo();
        g1.ponerHuevo();
        g1.envejecer();

        g2.ponerHuevo();
        g2.envejecer();
        g2.envejecer();

        // Mostrar estado final
        System.out.println("Estado final de las gallinas:");
        g1.mostrarEstado();
        g2.mostrarEstado();
    }
    }
    
