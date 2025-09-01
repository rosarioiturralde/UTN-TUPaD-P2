package tp2.iturralde;


import java.util.Scanner;

public class ejercicio1 {

     public static void main(String[] args) {
         
        Scanner scan = new Scanner(System.in);
        int anio; 
        
        System.out.println("Ingrese un año para verficar si es bisiesto");
        anio = Integer.parseInt(scan.nextLine());
        
        if((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)){
            System.out.println("El año " + anio + " es bisiesto");
        } else {
            System.out.println("El año " + anio + " no es bisiesto");
        }
            
    }
    
}
