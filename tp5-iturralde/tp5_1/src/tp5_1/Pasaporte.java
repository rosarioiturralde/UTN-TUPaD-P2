/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5_1;

/**
 *
 * @author Usuario
 */
public class Pasaporte {
    private int numero;
    private Foto foto;        // Composición
    private Titular titular;  // Asociación bidireccional

    public Pasaporte(int numero, Titular titular, String formatoFoto, int pixelesFoto) {
        this.numero = numero;
        this.foto = new Foto(formatoFoto, pixelesFoto); // Composición (la foto se crea dentro del pasaporte)
        this.titular = titular;
        titular.setPasaporte(this); // Se establece la bidireccionalidad
    }

    public int getNumero() {
        return numero;
    }

    public Foto getFoto() {
        return foto;
    }

    public Titular getTitular() {
        return titular;
    }

    @Override
    public String toString() {
        return "Pasaporte [numero=" + numero + ", foto=" + foto + ", titular=" + titular + "]";
    }
}
