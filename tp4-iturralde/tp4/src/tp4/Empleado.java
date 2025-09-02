/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4;

/**
 *
 * @author Usuario
 */
public class Empleado {
  
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0;

    // Constructor completo
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }

    // Constructor parcial con id automático y salario por defecto
    public Empleado(String nombre, String puesto) {
        this.id = ++totalEmpleados; // id automático
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 5000000.0; // salario por defecto
    }

    // Método sobrecargado: aumento por porcentaje
    public void actualizarSalario(double porcentaje) {
        this.salario += this.salario * (porcentaje / 100);
    }

    // Método sobrecargado: aumento fijo
    public void actualizarSalario(int aumentoFijo) {
        this.salario += aumentoFijo;
    }

    // Método toString para mostrar info legible
    @Override
    public String toString() {
        return "Empleado [ID: " + id + ", Nombre: " + nombre + ", Puesto: " + puesto + ", Salario: $" + salario + "]";
    }

    // Método estático para mostrar total de empleados
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }
}  

