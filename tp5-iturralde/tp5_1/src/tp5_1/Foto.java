/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5_1;

/**
 *
 * @author Usuario
 */
public class Foto {
   
    private String formato;
    private int pixeles;

    public Foto(String formato, int pixeles) {
        this.formato = formato;
        this.pixeles = pixeles;
    }

    public String getFormato() {
        return formato;
    }

    public int getPixeles() {
        return pixeles;
    }

    @Override
    public String toString() {
        return "Foto [formato=" + formato + ", pixeles=" + pixeles + "]";
    }
}
    
