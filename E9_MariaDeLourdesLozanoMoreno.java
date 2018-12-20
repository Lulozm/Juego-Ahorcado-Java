
package e9_mariadelourdeslozanomoreno;
import java.util.Scanner;
public class E9_MariaDeLourdesLozanoMoreno {
public static void main(String[] args) {
Scanner teclado= new Scanner(System.in);
        
int  cont_nu=0,cont_ne=0,cont_po=0,numero,cant,cont_gen=0,resp;
double acum_nu=0,acum_ne=0,acum_po=0,acum_cant=0,acum_gen=0;
     
       System.out.println("Captura 1- Para iniciar la captura"+"\n"+"Captura 2- Para salir");
        resp= teclado.nextInt();
        
        while(resp!=2){
            System.out.println("Captura tu número");
            cant=teclado.nextInt();
            if(cant==0){
            cont_nu=cont_nu+1;
            acum_nu=acum_nu+cant;}
            
            if(cant<0){
            cont_ne=cont_ne+1;
            acum_ne=acum_ne+cant;}
         
            if (cant>0){
            cont_po=cont_po+1;
            acum_po=acum_po+cant;}
            
            System.out.println("Captura 1- Para continuar la captura"+"\n"+"Captura 2- Para salir");
            resp= teclado.nextInt();
            
        }
            cont_gen=cont_gen+1;
            acum_gen=acum_nu+acum_ne+acum_po;
            
System.out.println("La cantidad capturada de números nulos fue:"+cont_nu+"\n"+"La suma de todos estos es:"+acum_nu+"\n"+
"La cantidad capturada de números positivos fue:"+cont_po+"\n"+"La suma de todos estos es:"+acum_po+"\n"+
"La cantidad capturada de números negativos fue:"+cont_ne+"\n"+ "La suma de todos estos es:"+acum_ne+"\n");
        
        
        
            
            }
}


        
        
        
        
        
  