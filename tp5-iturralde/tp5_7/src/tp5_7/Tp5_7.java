/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5_7;

/**
 *
 * @author Usuario
 */
public class Tp5_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Motor motor = new Motor("V8", "XXXX");
        Vehiculo vehiculo = new Vehiculo("JTJ155", "Toyota Corolla", motor);
        Conductor conductor = new Conductor("Rosario Iturralde", "123456789");

        vehiculo.setConductor(conductor);
        

        vehiculo.mostrarVehiculo();
        System.out.println(conductor.getVehiculo().patente 
                           + "El conductor " + conductor.getNombre() + " conduce el vehículo con patente ");
    }
    
}
