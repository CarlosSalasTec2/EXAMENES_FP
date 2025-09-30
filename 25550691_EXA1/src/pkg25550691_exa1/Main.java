/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg25550691_exa1;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Main {
    final static String PIN="1234";
    
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int op,Saldo,ret,s2,dep;
        Saldo=5000;
        String pin;
        Scanner input = new Scanner(System.in);
        System.out.println("******BIENVENIDO******");
        System.out.println("Banco del cerro de por ahí");
        System.out.println("Introduzca su PIN");
        pin=input.nextLine();
        if (pin.equals(PIN)){
        System.out.println("Seleccione una opcion:");
        System.out.println("1=Consultar saldo");
        System.out.println("2=Retirar dinero");
        System.out.println("3=Depositar dinero");
        op=input.nextInt();
        if (op==1){
            System.out.print("Su saldo es de: ");
            System.out.println(Saldo);
        }else{
        if(op==2){
        System.out.println("Cuanto desea retirar?");
        ret=input.nextInt();
        if(ret<=Saldo){
        s2=(Saldo-ret);
        System.out.print("Su saldo restante es de: ");
            System.out.println(s2);
        }else{
        System.out.println("Cantidad no valida");
        }
        }else{
            if(op==3){
            System.out.println("Cuanto desea depositar?");
            dep=input.nextInt();
            s2=(Saldo+dep);
            System.out.print("Su saldo ahora es de: ");
            System.out.println(s2);
            }
        }
        }
        }else{
        System.out.println("No vcalida");    
        }
    }
    
}
