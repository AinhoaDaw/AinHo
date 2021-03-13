
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ainho
 */
public class Secuencial4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ////4.Hacer un programa que calcule 
        //el cuadrado de un número
            int numero;
            int cuadrado;
            Scanner lector=new Scanner(System.in);
          System.out.println("Introduzca el numero para saber su cuadrado");
          numero =lector.nextInt();
          cuadrado=(numero*numero);
          System.out.println("el cuadrado de su número es " +cuadrado);
          
    }
    
}
