/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package examen2_25550691;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EXAMEN2_25550691 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner (System.in);
        int num,res,opc,res2;
        String sim;
        sim = "*";
        System.out.println("Numero entero a usar");
        num = input.nextInt();
        System.out.println("Desea ver los primos o los no primos?");
        System.out.println("1-Primos");
        System.out.println("2-No primos");
        opc = input.nextInt();
        switch(opc){
            case 1:
        for (int i = 2; i <= num; i++) {
            do {System.out.print(i+"-");
            i++;
            }while((i%2)==1);
                    }
                System.out.println("");
        for (int i = 2; i <= num; i++) {
            do {System.out.println(sim);
            i++;
            }while((i%2)==1);
            }
                    
        break;
            case 2:
            for (int i = 2; i <= num; i++) {
                        do {System.out.print(i+"-");
            i++;
            }while((i%2)==0);
        }
              break;
            default: System.out.println("Opcion no valida");
        }
        
    }
    
}
