import java.util.Scanner;

/*12.Pedir un numero entre 0 y 99 y mostrarlo 
escrito por ejemplo 56 : mostrarlo cincuenta y seis
*/

public class Ejercicio12 
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un numero entre(0-99): ");
        int num = entrada.nextInt();
        
        if(num > 99)
        {
            System.out.println("Introduce un numero valido");
        }
        
        else
        {
            switch(num)
            {
                case 0:   
                    System.out.println("Cero");
                    break;
        
        
                case 1:
                    System.out.println("Uno");
                    break;
            
                case 2:
                    System.out.println("Dos");
                    break;
               
                case 3:
                    System.out.println("Tres");
                    break;
                
                case 4:
                    System.out.println("Cuatro");
                    break;
                
                case 5:
                    System.out.println("Cinco");
                    break;
                
                case 6:
                    System.out.println("Seis");
                    break;
            
                case 7:
                    System.out.println("Siete");
                    break;
                
                case 8:
                    System.out.println("Ocho");
                    break;
                
                case 9:
                    System.out.println("Nueve");
                    break;
                
                case 10:
                    System.out.println("Diez");
                    break;
                    
                case 11:   
                    System.out.println("Once");
                    break;
        
        
                case 12:
                    System.out.println("Doce");
                    break;
            
                case 13:
                    System.out.println("Trece");
                    break;
               
                case 14:
                    System.out.println("catorce");
                    break;
                
                case 15:
                    System.out.println("Quince");
                    break;
                
                case 16:
                    System.out.println("Diesiseis");
                    break;
                
                case 17:
                    System.out.println("Diesisiete");
                    break;
            
                case 18:
                    System.out.println("Diesiocho");
                    break;
                
                case 19:
                    System.out.println("Diesinueve");
                    break;
                
                case 20:
                    System.out.println("Veinte");
                    break;
                
                case 21:
                    System.out.println("Veinti uno");
                    break;
                    
                case 22:
                    System.out.println("Veinti dos");
                    break;
                    
                case 23:   
                    System.out.println("Veinti tres");
                    break;
        
        
                case 24:
                    System.out.println("Veinti cuatro");
                    break;
            
                case 25:
                    System.out.println("Veinti cinco");
                    break;
               
                case 26:
                    System.out.println("Veinti seis");
                    break;
                
                case 27:
                    System.out.println("Veinti siete");
                    break;
                
                case 28:
                    System.out.println("Veinti ocho");
                    break;
                
                case 29:
                    System.out.println("Veinti nueve");
                    break;
            
                case 30:
                    System.out.println("Treinta");
                    break;
                
                case 31:
                    System.out.println("Treinta y uno");
                    break;
                
                case 32:
                    System.out.println("Treinta y dos");
                    break;
                    
                case 33:
                    System.out.println("Treinta y tres");
                    break;
                
                case 34:
                    System.out.println("Treinta y cuatro");
                    break;
                    
                case 35:
                    System.out.println("Treinta y cinco");
                    break;
                    
                case 36:   
                    System.out.println("Treinta y seis");
                    break;
        
        
                case 37:
                    System.out.println("Treinta y siete");
                    break;
            
                case 38:
                    System.out.println("Treinta y ocho");
                    break;
               
                case 39:
                    System.out.println("Treinta y nueve");
                    break;
                
                case 40:
                    System.out.println("Cuarenta");
                    break;
                
                case 41:
                    System.out.println("Cuarenta y uno");
                    break;
                
                case 42:
                    System.out.println("Cuarenta y dos");
                    break;
            
                case 43:
                    System.out.println("Cuarenta y tres");
                    break;
                    
                case 44:
                    System.out.println("Cuarenta y cuatro");
                    break;
                
                case 45:
                    System.out.println("Cuarenta y cinco");
                    break;
                    
                case 46:
                    System.out.println("Cuarenta y seis");
                    break;
                    
                case 47:   
                    System.out.println("Cuarenta y siete");
                    break;
        
        
                case 48:
                    System.out.println("Cuarenta y ocho");
                    break;
            
                case 49:
                    System.out.println("Cuarenta y nueve");
                    break;
               
                case 50:
                    System.out.println("Cincuenta");
                    break;
                
                case 51:
                    System.out.println("Cincuenta y uno");
                    break;
                
                case 52:
                    System.out.println("Cincuenta y dos");
                    break;
                
                case 53:
                    System.out.println("Cincuenta y tres");
                    break;
            
                case 54:
                    System.out.println("Cincuenta y cuatro");
                    break;
                
                case 55:
                    System.out.println("Cincuenta y cinco");
                    break;
                
                case 56:
                    System.out.println("Cincuenta y seis");
                    break;
                    
                case 57:
                    System.out.println("Cincuenta y siete");
                    break;
                
                case 58:
                    System.out.println("Cincuenta y ocho");
                    break;
                    
                case 59:
                    System.out.println("Cincuenta y nueve");
                    break;
                    
                case 60:   
                    System.out.println("Sesenta");
                    break;
        
        
                case 61:
                    System.out.println("Sesenta y uno");
                    break;
            
                case 62:
                    System.out.println("Sesenta y dos");
                    break;
               
                case 63:
                    System.out.println("Sesenta y tres");
                    break;
                
                case 64:
                    System.out.println("Sesenta y cuatro");
                    break;
                    
                
                case 65:
                    System.out.println("Sesenta y cinco");
                    break;
                
                case 66:
                    System.out.println("Sesenta y seis");
                    break;
                
                case 67:
                    System.out.println("Sesenta y siete");
                    break;
                    
                case 68:
                    System.out.println("Sesenta y ocho");
                    break;
                
                case 69:
                    System.out.println("Sesenta y nueve");
                    break;
                    
                case 70:
                    System.out.println("Setenta");
                    break;
                    
                case 71:   
                    System.out.println("Setenta y uno");
                    break;
        
        
                case 72:
                    System.out.println("Setenta y dos");
                    break;
            
                case 73:
                    System.out.println("Setenta y tres");
                    break;
               
                case 74:
                    System.out.println("Setenta y cuatro");
                    break;
                
                case 75:
                    System.out.println("Setenta y cinco");
                    break;
                
                case 76:
                    System.out.println("Setenta y seis");
                    break;
                
                case 77:
                    System.out.println("Setenta y siete");
                    break;
            
                case 78:
                    System.out.println("Setenta y ocho");
                    break;
                    
                case 79:
                    System.out.println("Setenta y nueve");
                    break;
                
                case 80:
                    System.out.println("Ochenta");
                    break;
                    
                case 81:
                    System.out.println("Ochenta y uno");
                    break;
                    
                case 82:   
                    System.out.println("Ochenta y dos");
                    break;
        
        
                case 83:
                    System.out.println("Ochenta y tres");
                    break;
            
                case 84:
                    System.out.println("Ochenta y cuatro");
                    break;
               
                case 85:
                    System.out.println("Ochenta y cinco");
                    break;
                
                case 86:
                    System.out.println("Ochenta y seis");
                    break;
                
                case 87:
                    System.out.println("Ochenta y siete");
                    break;
                
                case 88:
                    System.out.println("Ochenta y ocho");
                    break;
            
                case 89:
                    System.out.println("Ochenta y nueve");
                    break;
                
                case 90:
                    System.out.println("Noventa");
                    break;
                
                case 91:
                    System.out.println("Noventa y uno");
                    break;
                    
                case 92:
                    System.out.println("Noventa y dos");
                    break;
                
                case 93:
                    System.out.println("Noventa y tres");
                    break;
                    
                case 94:
                    System.out.println("Noventa y cuatro");
                    break;
                    
                case 95:   
                    System.out.println("Noventa y cinco");
                    break;
                
                case 96:
                    System.out.println("Noventa y seis");
                    break;
                    
                case 97:
                    System.out.println("Noventa y siete");
                    break;
                
                case 98:
                    System.out.println("Noventa y ocho");
                    break;
                    
                case 99:
                    System.out.println("Noventa y nueve");
                    break;
                    
               default:
                    System.out.println("El numero no es valido");
                    break;
            }    
        
        }
        
    
    }
}
