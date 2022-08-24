/*
7.Pedir un número de 0 a 99999 y mostrarlo con las cifras al revés.
*/
import java.util.Scanner;


public class Ejercicio7 
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        String num = entrada.next();
        
       StringBuilder builder = new StringBuilder(num);
       String numInvertido=builder.reverse().toString();
       
       System.out.println("El numero invertido es");
       System.out.println(numInvertido);
        
    }
    
}
