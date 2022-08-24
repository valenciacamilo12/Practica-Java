
package condicionales;
import java.util.Scanner;
//Leer un número entero y determina si es igual a 10

public class Condicionales {
    
    public static void main(String[] args)
    {
        int numero = 0;
        
        System.out.print("Introduce un numero entero: ");
        Scanner entrada = new Scanner(System.in);
        numero = entrada.nextInt();
        
        if(numero == 10)
        {
            System.out.println("El numero es igual a 10");
            System.out.println("Fin del programa");
        } 
        
        else
        {
            System.out.println("El numero no es igual a 10");
            System.out.println("Fin del programa");
        }
       
        
    }
    
}
