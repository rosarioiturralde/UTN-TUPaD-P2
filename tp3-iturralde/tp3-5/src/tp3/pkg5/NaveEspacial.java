/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3.pkg5;

/**
 *
 * @author Usuario
 */
public class NaveEspacial {
   
    private String nombre;
    private int combustible;
    private final int CAPACIDAD_MAXIMA = 100; // límite de combustible

    // Constructor
    public NaveEspacial(String nombre, int combustibleInicial) {
        this.nombre = nombre;
        if (combustibleInicial <= CAPACIDAD_MAXIMA) {
            this.combustible = combustibleInicial;
        } else {
            this.combustible = CAPACIDAD_MAXIMA;
        }
    }

    // Método para despegar
    public void despegar() {
        if (combustible >= 10) {
            combustible -= 10;
            System.out.println("🚀 La nave " + nombre + " despegó. Combustible restante: " + combustible);
        } else {
            System.out.println("⚠️ No hay suficiente combustible para despegar.");
        }
    }

    // Método para avanzar cierta distancia
    public void avanzar(int distancia) {
        int consumo = distancia * 2; // por ejemplo: 2 unidades de combustible por cada unidad de distancia
        if (combustible >= consumo) {
            combustible -= consumo;
            System.out.println("➡️ La nave avanzó " + distancia + " km. Combustible restante: " + combustible);
        } else {
            System.out.println("⛽ Combustible insuficiente para avanzar " + distancia + " km.");
        }
    }

    // Método para recargar combustible
    public void recargarCombustible(int cantidad) {
        if (combustible + cantidad > CAPACIDAD_MAXIMA) {
            combustible = CAPACIDAD_MAXIMA;
            System.out.println("⛽ Se recargó al máximo. Combustible actual: " + combustible);
        } else {
            combustible += cantidad;
            System.out.println("⛽ Se recargaron " + cantidad + " unidades. Combustible actual: " + combustible);
        }
    }

    // Mostrar estado
    public void mostrarEstado() {
        System.out.println("🛰️ Nave: " + nombre);
        System.out.println("Combustible: " + combustible + "/" + CAPACIDAD_MAXIMA);
        System.out.println("-------------------------");
    }
}
