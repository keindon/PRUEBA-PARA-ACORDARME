/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teoriaguia3;

import javax.swing.JOptionPane;

/**
 *
 * @author parce
 */
public class TEORIA3GUIA3COPIADO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nota;
        boolean notaV;
        do
        {
            notaV=true;
          nota=Integer.parseInt(JOptionPane.showInputDialog("introduce una nota entre 0 y 10"));  
          if(nota<1)notaV=false;
          if(nota>10)notaV=false;
          if(!notaV) { System.out.println("nota no valida");}
        }while(!notaV);
        System.out.println("gracias");
        
    }
    
}
