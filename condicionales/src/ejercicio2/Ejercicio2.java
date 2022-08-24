/*Leer un número entero de dos dígitos, guardar cada dígito en una variable diferente y
luego mostrarlas en pantalla.*/
package ejercicio2;

import java.util.Scanner;


public class Ejercicio2
{
    public static void main(String[] args)
    {
        int numero = 0,digito1 = 0,digito2 = 0;
        
        System.out.print("Introduce un numero: ");
        Scanner entrada = new Scanner(System.in);
        numero = entrada.nextInt();
        
        digito1 = numero / 10;
        digito2 = numero % 10;
        
        System.out.println(digito1);
        System.out.println(digito2);
         
    
    
    
    }
    
}
