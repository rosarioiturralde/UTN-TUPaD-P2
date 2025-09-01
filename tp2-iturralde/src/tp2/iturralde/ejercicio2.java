package tp2.iturralde;

import java.util.Scanner;

public class ejercicio2 {
     public static void main(String[] args) {
        // se declara que va a haber un input para leer los datos
        Scanner input = new Scanner(System.in);
        
        // Declaramos variables
        int numUno, numDos, numTres, mayor;
        
        // ingreso del usuario
        System.out.println("Ingrese 3 numeros");
        System.out.println("Primer numero: ");
        numUno = Integer.parseInt(input.nextLine()); 
        System.out.println("Segundo numero: ");
        numDos = Integer.parseInt(input.nextLine()); 
        System.out.println("Tercer numero: ");
        numTres = Integer.parseInt(input.nextLine()); 
        
        mayor = numUno; // se inicializa la variable con el primer numero ingresado

        if (numDos > mayor) { // Vericamos si numDos es mayor se guarda su valor
            mayor = numDos;
        } 
        if (numTres > mayor) { // En el caso que num3 sea mayor se guarda su valor 
            mayor = numTres;
        }
        
        // Mostramos al mayor
        System.out.println("El mayor es: " + mayor);
    }
    
}
