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
public class TEORIAGUIA3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numA, numB;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        numA=leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        numB=leer.nextInt();
        if (numA>25) {System.out.println("el primer numero es mayor a 25");
        
        }else System.out.println("el primer numero es menor o igual a 25 ");
        if (numB>25) {System.out.println("el segundo numero es mayor a 25");  
        
        }else  System.out.println("el segundo numero es igual o menor a 25");
    } 
}
