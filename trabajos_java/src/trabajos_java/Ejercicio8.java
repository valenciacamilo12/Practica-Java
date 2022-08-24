/*
Pedir el día, el mes y el año de una fecha e indicar 
si la fecha es correcta, suponiendo todos los meses de 30 días.
 */
package trabajos_java;
import java.util.Scanner;


public class Ejercicio8 
{
    public static void main(String[] args)
    {
        Scanner entrada1 = new Scanner(System.in);
        System.out.println("Introduce el numero del mes: ");
        System.out.println("Introduce el numero del dia: ");
        System.out.println("Introduce el numero del año: ");
        int mes = entrada1.nextInt(),dia = entrada1.nextInt(),annio = entrada1.nextInt(),con = 0;
        
        
        if(mes >= 1 && mes <= 12)
        {
            con ++;
        }
        
        if(dia >= 1 && dia <= 30)
        {
            con ++;
        }
        
        
        if(annio >= 1900 && annio <= 3000)
        {
            con ++;
        }
            
        if(con == 3)
        {
            System.out.println("Los datos coinciden con una fecha valida");
            System.out.println("Mes/"+mes+"/Dia/"+dia+"/año/"+annio);
        }
        
        else
        {
            System.out.println("Los datos no coinciden con una fecha valida");
            System.out.println("Introduce los datos una vez mas");
        }
          
    }
    
}
