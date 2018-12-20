/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lulu;

import java.util.Scanner;

/**
 *
 * @author LulúLoz
 */
public class Converciones_Moneda {
    public static void main (String[] args){
    
    Scanner entrada=new Scanner(System.in);
     
     
     double dinero, resultado;
    int moneda;
     
     System.out.println ("¿Qué tipo de moneda usas?");
      System.out.println("1-Dolar");
       System.out.println("2-Euro");
        System.out.println("-3Jen");
     
     
     moneda=entrada.nextInt();
     
     System.out.println("¿Cuánto dinero darás?");
     dinero=entrada.nextDouble();

     if(moneda==1){
     resultado=dinero*18.72;
      System.out.println("El resultado de la converción es "+resultado);
     }
     
     else{ 
            if(moneda==2){
     resultado=dinero*20.44; System.out.println("El resultado de la converción es "+resultado);}
            
            
            else{ if(moneda==3){
     resultado=dinero*0.117; System.out.println("El resultado de la converción es "+resultado);}
            
            }
     
     }

}

}
