/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5_10;

/**
 *
 * @author Usuario
 */
public class CuentaBancaria {
    private String cbu;
    private double saldo;
    private ClaveSeguridad clave; // composición
    private Titular titular;      // asociación bidireccional
    
    public CuentaBancaria(String cbu, double saldo, ClaveSeguridad clave) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.clave = clave;
    }
    
    public void setTitular(Titular titular) {
        this.titular = titular;
        titular.setCuenta(this); // sincroniza la relación bidireccional
    }

    public void depositar(double monto) {
        saldo += monto;
    }
    
    public void extraer(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
        } else {
            System.out.println("Fondos insuficientes.");
        }
    }
    
    public void mostrarCuenta() {
        System.out.println("Cuenta Bancaria:");
        System.out.println("CBU: " + cbu);
        System.out.println("Saldo: $" + saldo);
        System.out.println("Clave: " + clave.getCodigo() + " (Última modificación: " + clave.getUltimaModificacion() + ")");
        if (titular != null) {
            System.out.println("Titular: " + titular.getNombre() + " - DNI: " + titular.getDni());
        }
    }
}
