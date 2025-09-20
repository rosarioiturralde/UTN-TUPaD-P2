/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5_6;

/**
 *
 * @author Usuario
 */
public class Reserva {
    private String fecha;
    private String hora;
    private Cliente cliente; // asociación unidireccional
    private Mesa mesa;       // agregación

    public Reserva(String fecha, String hora, Cliente cliente, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.cliente = cliente;
        this.mesa = mesa;
    }
    
     public void mostrarReserva() {
        System.out.println("Reserva:");
        System.out.println("Fecha: " + fecha);
        System.out.println("Hora: " + hora);
        System.out.println("Cliente: " + cliente.getNombre() + " (" + cliente.getTelefono() + ")");
        System.out.println("Mesa: N°" + mesa.getNumero() + " - Capacidad: " + mesa.getCapacidad());
    }
}
