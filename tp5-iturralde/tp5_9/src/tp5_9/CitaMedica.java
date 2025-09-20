/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5_9;

/**
 *
 * @author Usuario
 */
public class CitaMedica {
    private String fecha;
    private String hora;
    private Paciente paciente;        // asociación unidireccional
    private Profesional profesional;  // asociación unidireccional
    
    public CitaMedica(String fecha, String hora, Paciente paciente, Profesional profesional) {
        this.fecha = fecha;
        this.hora = hora;
        this.paciente = paciente;
        this.profesional = profesional;
    }
    
     public void mostrarCita() {
        System.out.println("Cita Médica:");
        System.out.println("Fecha: " + fecha + " - Hora: " + hora);
        System.out.println("Paciente: " + paciente.getNombre() + " (Obra social: " + paciente.getObraSocial() + ")");
        System.out.println("Profesional: " + profesional.getNombre() + " - Especialidad: " + profesional.getEspecialidad());
    }
}
