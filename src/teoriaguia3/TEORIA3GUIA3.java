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
public class TEORIA3GUIA3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nota;
        boolean notaV=true;
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese la nota de 0 a 10");
        nota = leer.nextInt();
        while(nota < 0 || nota > 10){System.out.println("nota incorrecta, ingrese nuevamente");
        nota = leer.nextInt();
        }
        System.out.println("nota actualizada");
            }
    
}
