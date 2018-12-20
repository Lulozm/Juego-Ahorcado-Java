package actividad7_maria_delourdes_lozano_moreno;
import java.util.Scanner;

public class Actividad7_Maria_DeLourdes_Lozano_Moreno3 {

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);    
    int sueldo,horex,categ,sueldonu,prec_horex,prec_horext;
    
    System.out.println("Captura tú sueldo actual");
    sueldo=sc.nextInt();
    System.out.println("Captura el número de horas extras trabajadas");
    horex=sc.nextInt();
    System.out.println("Captura tú categoría de trabajo:1,2,3,4");
    categ=sc.nextInt();
    
    
    switch (categ){
     case 1:
        prec_horex=30;
       if(horex>30){
       prec_horext=horex*prec_horex;
       sueldonu=prec_horext+sueldo;
       System.out.println("Tú nuevo sueldo es:"+sueldonu);      
        break;
       }
       else {prec_horext=30*prec_horex;
       sueldonu=prec_horext+sueldo;
       System.out.println("Tú nuevo sueldo es:"+sueldonu); 
       }
       break;
         
     case 2:
        prec_horex=38;
       if(horex>30){
       prec_horext=horex*prec_horex;
       sueldonu=prec_horext+sueldo;
       System.out.println("Tú nuevo sueldo es:"+sueldonu);      
        break;
       }
       else {prec_horext=30*prec_horex;
       sueldonu=prec_horext+sueldo;
       System.out.println("Tú nuevo sueldo es:"+sueldonu); 
       }
        break;
         
      case 3:
        prec_horex=50;
       if(horex>30){
       prec_horext=horex*prec_horex;
       sueldonu=prec_horext+sueldo;
       System.out.println("Tú nuevo sueldo es:"+sueldonu);      
        break;
       }
       else {prec_horext=30*prec_horex;
       sueldonu=prec_horext+sueldo;
       System.out.println("Tú nuevo sueldo es:"+sueldonu); 
       }
    
          break;
      case 4:
        prec_horex=70;
       if(horex>30){
       prec_horext=horex*prec_horex;
       sueldonu=prec_horext+sueldo;
       System.out.println("Tú nuevo sueldo es:"+sueldonu);      
        break;
       }
       else {prec_horext=30*prec_horex;
       sueldonu=prec_horext+sueldo;
       System.out.println("Tú nuevo sueldo es:"+sueldonu); 
       }
          
        break; 
       default:
        System.out.println("No se puede realizar la operación (ERROR)");   
        break;
         
    //switch 
    }
       
        

    
    
    
}
}

