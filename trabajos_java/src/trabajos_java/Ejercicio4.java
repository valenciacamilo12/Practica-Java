import java.util.Scanner;
/*
4.Se desea convertir las calificaciones alfabéticas A, B, C, D, E y F a calificaciones numéricas 4, 5, 6, 7, 8 y 9 
respectivamente. Los valores de  A, B,C,D,E  y F  se representarán por la variable LETRA.
 */

public class Ejercicio4 
{
    public static void main(String [] args)
    {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce una letra entre(A, B,C,D,E  y F): ");
        char letra = entrada.next().charAt(0);
        
        switch(letra)
        {
            case 'A':   
                System.out.println("El numero al cual le pertenece la letra es:");
                System.out.println("4");
                break;
        
        
            case 'B':
                System.out.println("El numero al cual le pertenece la letra es:");
                System.out.println("5");
                break;
            
            case 'C':
                System.out.println("El numero al cual le pertenece la letra es:");
                System.out.println("6");
                break;
               
            case 'D':
                System.out.println("El numero al cual le pertenece la letra es:");
                System.out.println("7");
                break;
                
            case 'E':
                System.out.println("El numero al cual le pertenece la letra es:");
                System.out.println("8");
                break;
            
            case'F':
                System.out.println("El numero al cual le pertenece la letra es:");
                System.out.println("9");
                break;
            
            default:
                System.out.print("La letra no esta en el rango de calificaciones");
                break;
        }
    
    
    
    }
    
}
