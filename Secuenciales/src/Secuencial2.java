
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
public class Secuencial2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ////2.	Hacer un programa que pida el precio 
        //y la cantidad de un producto y calcule el total.
        int precio;
        int cantidad;
        int total;
        Scanner lector=new Scanner(System.in);
        System.err.println("Introduzca precio y cantidad por favor");
    precio = lector.nextInt();
    cantidad = lector.nextInt();
    total = precio*cantidad;
        System.out.println("El total de su compra es" +total);
    }
    
}
