/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp4;

/**
 *
 * @author Usuario
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Empleado e1 = new Empleado(1, "Rosario Iturralde", "Gerente", 8500000);
        Empleado e2 = new Empleado("Ignacio Iacovelli", "Veterinario");
        Empleado e3 = new Empleado("Bautista Iacovelli", "Maquinista");

        e2.actualizarSalario(10); // aumento por porcentaje
        e3.actualizarSalario(500000); // aumento fijo

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

        System.out.println("Total de empleados creados: " + Empleado.mostrarTotalEmpleados());
    }
}
    