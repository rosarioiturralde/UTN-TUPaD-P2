/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5_7;

/**
 *
 * @author Usuario
 */
public class Vehiculo {
     public String patente;
    private String modelo;
    private Motor motor;       // agregación
    private Conductor conductor; // asociación bidireccional

    public Vehiculo(String patente, String modelo, Motor motor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
    }
    
     public void setConductor(Conductor conductor) {
        this.conductor = conductor;
        conductor.setVehiculo(this); // sincroniza la relación
    }
     
     public void mostrarVehiculo() {
        System.out.println("Vehículo:");
        System.out.println("Patente: " + patente);
        System.out.println("Modelo: " + modelo);
        System.out.println("Motor: " + motor.getTipo() + " - Serie: " + motor.getNumeroSerie());
        if (conductor != null) {
            System.out.println("Conductor: " + conductor.getNombre() + " (Licencia: " + conductor.getLicencia() + ")");
        } else {
            System.out.println("Sin conductor asignado.");
        }
    }
}
