
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
public class Secuencial15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//*13.	Una tienda ofrece un descuento del 15% sobre el total de la compra
//y un cliente desea saber cuanto deberá pagar finalmente por su compra.//
int descuento = 0;//15%
int precio;//cantiadad que pagó
int total; //total a pagar con descuento
Scanner lector=new Scanner (System.in);
        System.out.println("Introduzca precio de su compra");
        precio=lector.nextInt();
        descuento=(int) (precio*0.15);
        precio=(int) ((precio*0.15)+precio);
        total=(precio-descuento);
        System.out.println("El total de su comra es " +total);
        
        
    }
    
}
