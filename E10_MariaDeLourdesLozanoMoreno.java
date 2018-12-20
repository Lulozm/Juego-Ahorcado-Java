
package e9_mariadelourdeslozanomoreno;
import java.util.Scanner;
public class E10_MariaDeLourdesLozanoMoreno {
    
    
public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        
       
        int cont=0,resp,codigo;      
        double prec=0,acum=0,iva,tot;
        
        System.out.println("Captura 1- Para iniciar la captura"+"\n"+"Captura 2- Para salir");
        resp= teclado.nextInt();
        
         while(resp==1){
             System.out.println("Captura el costo del producto");
              prec= teclado.nextInt();
             
             System.out.println("Captura el codigo del producto");
              codigo= teclado.nextInt();
        
          cont=cont+1;  
          acum=prec+acum;
         
        System.out.println("Captura 1- Para continuar con la captura"+"\n"+"Captura 2- Para salir");
        resp= teclado.nextInt();
          

}
        iva=(acum*.16)+acum;
        
        System.out.println("El subtotal es:"+acum+"\n"+"El total es:"+iva+"\n"+"El número de productos es:"+cont);
}
}





