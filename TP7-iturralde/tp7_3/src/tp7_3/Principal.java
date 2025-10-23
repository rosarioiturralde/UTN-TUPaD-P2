/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp7_3;

/**
 *
 * @author Usuario
 */
public class Principal {

    public static void main(String[] args) {
        Empleado[] empleados = {
            new EmpleadoPlanta("Ana", 500000),
            new EmpleadoTemporal("Luis", 120, 3000)
        };

        for (Empleado e : empleados) {
            System.out.println(e.nombre + " - Sueldo: " + e.calcularSueldo());

            if (e instanceof EmpleadoPlanta) {
                System.out.println("Es empleado de planta.");
            } else if (e instanceof EmpleadoTemporal) {
                System.out.println("Es empleado temporal.");
            }
        }
    }
}

