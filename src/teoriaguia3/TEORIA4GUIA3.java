/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teoriaguia3;

import java.util.Scanner;

/**
 *
 * @author parce
 */
public class TEORIA4GUIA3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num, cont, contfinal;
        cont=0;
        contfinal=20;
        Scanner leer = new Scanner(System.in);
        do{
            System.out.println("ingrese el numero secreto");
        num = leer.nextInt();
        cont=(cont+1);
        if (cont>contfinal){System.out.println("intentos agotados");
        break;}
        }while(num!=0);
        System.out.println("Felicidades, el numero secreto es: "+num);
    }
    
}
