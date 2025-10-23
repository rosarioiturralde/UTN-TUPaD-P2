/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp7_4;

/**
 *
 * @author Usuario
 */
public class Tp7_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Animal[] animales = {
            new Perro(),
            new Gato(),
            new Vaca()
        };

        for (Animal a : animales) {
            a.describirAnimal();
            a.hacerSonido();
        }
    }

    
}
