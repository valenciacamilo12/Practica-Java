/*
 5.Algoritmo que nos indique si un número 
entero, leído de teclado, tiene 1, 2, 3 o más de 3 dígitos. Considerar los negativos.
 */
import java.util.Scanner;


public class Ejercicio5 
{
    public static void main(String [] args)
    {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int num = entrada.nextInt();
        int con = 0;
        
        if(num >= 1 && num <= 9)
        {
            System.out.println("El numero tiene un digito");
        }
        
        else if(num >= 10 && num <= 99)
        {
            System.out.println("El numero tiene dos digitos");
        }
        
        else if(num >= 100 && num <= 999)
        {
            System.out.println("El numero tiene tres digitos");
        }
        
        else if(num >= 1000 && num <= 9999)
        {
            System.out.println("El numero tiene cuatro digitos");
        }
        
        else if(num >= 10000 && num <= 99999)
        {
            System.out.println("El numero tiene cinco digitos");
        }
    }
    
}
