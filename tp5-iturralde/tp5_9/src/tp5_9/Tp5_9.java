/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5_9;

/**
 *
 * @author Usuario
 */
public class Tp5_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Paciente paciente = new Paciente("Rosario Iturralde", "OSDE");
        Profesional profesional = new Profesional("Dra. Guillermina Martinez", "Ginecologa");
        CitaMedica cita = new CitaMedica("2025-09-25", "15:30", paciente, profesional);

        cita.mostrarCita();
    }
    
}
