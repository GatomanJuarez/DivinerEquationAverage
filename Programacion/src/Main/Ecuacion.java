package Main;

import javax.swing.JOptionPane;

public class Ecuacion {
    public static void main (String args[]){
        int salida;
        double resultado, x1,x2;
        do{
        x2=0;
        x1 = 0;
        resultado = 0;
        x1=Integer.parseInt(JOptionPane.showInputDialog("Dame el valor de x"));
        x2 = x1 * x1;
        resultado = (((3* x2)+(2 * x1)+ 8))/(x2 - 16);
        System.out.print("El resultado de la ecuacion es:  "+resultado);
        
        salida=Integer.parseInt(JOptionPane.showInputDialog("0 para salir"));
        }
        while (salida !=0);
        }
    
}