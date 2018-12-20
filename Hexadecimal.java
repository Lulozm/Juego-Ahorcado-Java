import java.util.Scanner;

public class Hexadecimal{

   public static void main(String args[]){
     int rem;
     String str2=""; 
     
     Scanner input = new Scanner( System.in );
     System.out.print("Ingresa un numero decimal");
     int num =input.nextInt();

     
     char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
 
     while(num>0)
     {
       rem=num%16; 
       str2=hex[rem]+str2; 
       num=num/16;
     }
     System.out.println("Tu numero en hexadecimal es"+str2);
  }
  }

