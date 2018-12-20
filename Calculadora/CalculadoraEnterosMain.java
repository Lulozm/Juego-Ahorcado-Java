
package CalculadoraEnterosMain;

import java.util.Scanner;
import CalculadoraEnteros.*;
public class CalculadoraEnterosMain {
    public static void main(String args []){
    Scanner teclado= new Scanner(System.in);   

int a1,b2,opcion,result;
System.out.println("Ingresa primer valor");
    a1=teclado.nextInt();
    System.out.println("Ingresa segundo valor");
    b2=teclado.nextInt();
 
System.out.println("Seleccione una operación aritmética \n1-Suma 1  \n2-Resta 2  \n3-Multiplicación 3   \n4-División 4 \n5-Salir 5 "); 
opcion=teclado.nextInt();


    
 switch(opcion){
    
case 1:   
 
    result=CalculadoraEnteros.sumar(a1, b2); 
   
    System.out.println("Tu resultado es:"+ result);
    break;
 
 case 2:   
    result=CalculadoraEnteros.resta(a1, b2);
    System.out.println("Tu resultado es:"+ result);
    break;
 
   case 3:   
    result=CalculadoraEnteros.multiplicacion(a1, b2);
    System.out.println("Tu resultado es:"+ result);
    break;
       
   case 4:   
    result=CalculadoraEnteros.division(a1, b2);
    System.out.println("Tu resultado es:"+ result);
    break;
       
   case 5:CalculadoraEnteros.salir();
 
   break;    
 }


 


 }}