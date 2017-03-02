package Main;

 import java.util.Random;
import javax.swing.JOptionPane;
 
public class Adivinador {
  public static void main (String args[]){
       
       int intentos = 5;
        
        Random rnd=new Random();
        int r=rnd.nextInt(50)+1;
        
        int numero;
        
        
        System.out.println( "Intenta adivinar el numero (1 al 50)" );
       
        do
        {
           numero =Integer.parseInt(JOptionPane.showInputDialog("Dame tu numero")); 
            if ( numero == r ) 
            {
                System.out.println("Adivinaste el numero, el numero es: " + r );
            }
            else 
            {
                intentos = intentos - 1 ;
                System.out.println( "No es correcto te quedan " + intentos + " intentos." );
            }
        } while (intentos>0 && numero != r);
        
        if (intentos==0)
            System.out.println("Lo siento el numero era: " + r );
    }   
}
