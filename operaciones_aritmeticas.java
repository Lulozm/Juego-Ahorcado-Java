package pkg27enero2017;

import java.util.Scanner;

public class operaciones_aritmeticas {
public static void main (String args[]){   
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
    result=sumar(a1,b2);   
    System.out.println("Tu resultado es:"+ result);
    break;
 
 case 2:   
    result=resta(a1,b2);
    System.out.println("Tu resultado es:"+ result);
    break;
 
   case 3:   
    result=multiplicacion(a1,b2);
    System.out.println("Tu resultado es:"+ result);
    break;
       
   case 4:   
    result=division(a1,b2);
    System.out.println("Tu resultado es:"+ result);
    break;
       
   case 5:
   salir();
   break;    
 }}


public static int sumar(int num1,int num2){
    
  int result;
  result=num1+num2;
  
  return result;
    
}
public static int resta(int num1,int num2){
    
  int result;
  result=num1-num2;

  return result;
}
public static int multiplicacion(int num1,int num2){
    
  int result;
  result=num1*num2;
  
  return result;
}
public static int division(int num1,int num2){
    
  int result;
  result=num1/num2;

  return result;
}
public static void salir(){
  System.out.println("Fin del programa");  
  System.exit(0);
  
}}
