package tp2.iturralde;

import java.util.Scanner;

public class ejercicio2 {
     public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int numUno, numDos, numTres, mayor;
        
        System.out.println("Ingrese tres numeros");
        System.out.println("Primer numero: ");
        numUno = Integer.parseInt(scan.nextLine()); 
        System.out.println("Segundo numero: ");
        numDos = Integer.parseInt(scan.nextLine()); 
        System.out.println("Tercer numero: ");
        numTres = Integer.parseInt(scan.nextLine()); 
        
        mayor = numUno; // se inicializa la variable con el primer numero ingresado

        if (numDos > mayor) { // Vericamos si numDos es mayor se guarda su valor
            mayor = numDos;
        } 
        if (numTres > mayor) { // En el caso que num3 sea mayor se guarda su valor 
            mayor = numTres;
        }
        
        System.out.println("El mayor es: " + mayor);
    }
    
}
