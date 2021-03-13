
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
public class Secuencial3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //3.	Hacer un programa que pida tres números A, B, C, 
        //y después haga el cálculo siguiente:
        //D=((A+B) / C).//
        int numeroA;
        int numeroB;
        int numeroC;
        int numeroD;
        Scanner lector=new Scanner(System.in);
        System.out.println("Introduce tres numeros por favor");
        numeroA=lector.nextInt();
        numeroB=lector.nextInt();
        numeroC=lector.nextInt();
        numeroD=((numeroA+numeroB)/numeroC);
        System.err.println("El total es" +numeroD);
    }
    
}
