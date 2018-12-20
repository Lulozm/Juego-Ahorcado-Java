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
public class Sueldo_Trabajador {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner entrada=new Scanner(System.in);
        
        double resultado1, resultado2, paga, antiguedad;
        
        System.out.println("¿Cuánto gana el trabajador?");
        
    paga=entrada.nextDouble();
        
    
    System.out.println("¿Cuánta antigüedad tiene?");
        
   antiguedad=entrada.nextDouble();
        
        if(paga<=500 && antiguedad>=10){
           
            resultado1=paga*.20;
            
            resultado2=resultado1+paga;
         System.out.println("El sueldo del trabajador es "+resultado2);
        
        }
        else{
        if(paga<=500 && antiguedad <10){
            resultado1=paga*.05;
            
            
            resultado2=resultado1+paga;
            
         System.out.println("El sueldo del trabajador es "+resultado2);
        
        
        }
        else{
        if(paga>=500){
            System.out.println("El sueldo del trabajador es " + paga);
            }}}}}
