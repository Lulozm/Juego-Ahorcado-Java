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
public class coordenadas {
    
     public static void main(String[] args) {
     
    int x,y;
    int plano;
    
    System.out.println("Dame un valor para X en el plano carteciano");
    Scanner entrada=new Scanner(System.in);    
   
    x=entrada.nextInt();
        System.out.println("Dame un valor para X en el plano carteciano");
       
        y=entrada.nextInt();
    
     if(x>0 && y>0){
           plano=1;
         System.out.println("El punto introducido está en plano "+ plano); }
         
         else{
        if(x<0 && y>0){
           
         plano=2;
         System.out.println("El punto introducido está en plano "+ plano); }
         
        else{
        if(x<0 && y<0){
            plano=3;
         System.out.println("El punto introducido está en plano "+ plano); }
         
            
        
        else{
        if(x>0 && y<0){
            plano=4;
         System.out.println("El punto introducido está en plano "+ plano); }
         
            } } } }}
    
    
    

