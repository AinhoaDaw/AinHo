
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
public class Secuencial1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //1.	Hacer un programa que pida dos números enteros y los sume.
        int numero;
        int numero2;
        int total;
        Scanner lector=new Scanner (System.in);
        System.out.println("Introduzca dos numero por favor");
            numero=lector.nextInt();
            numero2=lector.nextInt();
            total=numero+numero2;
        String Total = null;
            System.out.println("El rusultado es" +total);
    }
}
