package trabajos_java;
import java.util.Scanner;

public class Trabajos_java 
{
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un numero y te dire a que dia pertenece: ");
        int num = entrada.nextInt();
        
        
        switch(num)
        {
            case 1:
                System.out.println("El dia que le corresponde al numero es");
                System.out.println("Lunes");
                break;
            
            case 2:
                System.out.println("El dia que le corresponde al numero es");
                System.out.println("Martes");
                break;
                
            case 3:
                System.out.println("El dia que le corresponde al numero es");
                System.out.println("Miercoles");
                break;
                
            case 4:
                System.out.println("El dia que le corresponde al numero es");
                System.out.println("Jueves");
                break;
                
            case 5:
                System.out.println("El dia que le corresponde al numero es");
                System.out.println("Viernes");
                break;
                
            case 6:
                System.out.println("El dia que le corresponde al numero es");
                System.out.println("Sabado");
                break;
                
            case 7:
                System.out.println("El dia que le corresponde al numero es");
                System.out.println("Domingo");
                break;
                
            default:
                System.out.println("El numero introducido no corresponde a ningun numero");
                
        }
       
    }
    
}
