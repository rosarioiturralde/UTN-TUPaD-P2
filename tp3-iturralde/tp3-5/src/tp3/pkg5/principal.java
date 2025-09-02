/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3.pkg5;

/**
 *
 * @author Usuario
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        NaveEspacial nave = new NaveEspacial("Explorer", 50);

        // Estado inicial
        System.out.println("Estado inicial:");
        nave.mostrarEstado();

        // Intentar avanzar sin recargar
        System.out.println("Intentando avanzar 30 km...");
        nave.avanzar(30);

        // Recargar combustible
        System.out.println("Recargando combustible...");
        nave.recargarCombustible(40);

        // Avanzar correctamente
        System.out.println("Intentando avanzar 20 km...");
        nave.avanzar(20);

        // Mostrar estado final
        System.out.println("Estado final:");
        nave.mostrarEstado();
    }
    }
    
