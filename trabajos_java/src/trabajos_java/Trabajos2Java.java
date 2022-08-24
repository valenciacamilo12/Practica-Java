package trabajos2java;

import java.util.Scanner;


public class Trabajos2Java 
{
    
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un el valor para A,B,C: ");
        
        int a = entrada.nextInt();
        int b = entrada.nextInt();
        int c = entrada.nextInt();
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
        int p = ((a+b+c)/2);
        
        int area = (p*(p-a)*(p-b)*(p-c));
        area = (int) Math.sqrt(area);
        System.out.println("El area del triangulo es igual a: "+area);
        
    }
    
}
