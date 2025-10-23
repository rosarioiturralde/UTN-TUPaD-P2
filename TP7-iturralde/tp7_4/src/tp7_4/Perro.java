/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp7_4;

/**
 *
 * @author Usuario
 */

class Perro extends Animal {
    public Perro() {
        super("Perro");
    }

    @Override
    public void hacerSonido() {
        System.out.println("Guau!");
    }
}

