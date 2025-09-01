package tp2.iturralde;


import java.util.Scanner;

public class ejercicio1 {

     public static void main(String[] args) {
        // scanner es un objeto que se utiliza para declar el ingreso de datos
        Scanner input = new Scanner(System.in);
        int anio; // esta variable declarada es donde se va a leer el valor que de el usuario
        
        // con esta sentencia se pide el valor al usiario
        System.out.println("Ingrese un año para verficar si es bisiesto");
        anio = Integer.parseInt(input.nextLine());
        
        // Estructura condicioal que verifica si el año es bisiesto o no
        if((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)){
            System.out.println("El año " + anio + " es bisiesto");
        } else {
            System.out.println("El año " + anio + " no es bisiesto");
        }
            
    }
    
}
