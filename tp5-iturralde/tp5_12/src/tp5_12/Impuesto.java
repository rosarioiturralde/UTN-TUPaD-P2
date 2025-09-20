/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5_12;

/**
 *
 * @author Usuario
 */
public class Impuesto {
    private double monto;
    private Contribuyente contribuyente; // Asociación unidireccional hacia Contribuyente

    // Constructor
    public Impuesto(double monto, Contribuyente contribuyente) {
        this.monto = monto;
        this.contribuyente = contribuyente;
    }
    
     // Getters y Setters
    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public Contribuyente getContribuyente() {
        return contribuyente;
    }
    
    public void setContribuyente(Contribuyente contribuyente) {
        this.contribuyente = contribuyente;
    }
}
