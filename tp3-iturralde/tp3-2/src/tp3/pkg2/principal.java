/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3.pkg2;

/**
 *
 * @author Usuario
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Mascota miMascota = new Mascota("Inca", "Perro", 8);

        System.out.println("Información inicial de la mascota:");
        miMascota.mostrarInfo();

        System.out.println("Simulando cumpleaños...");
        miMascota.cumplirAnios();

        System.out.println("Información después del cumpleaños:");
        miMascota.mostrarInfo();
    }
    }
    
