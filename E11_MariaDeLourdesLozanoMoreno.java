package e9_mariadelourdeslozanomoreno;
import java.util.Scanner;

public class E11_MariaDeLourdesLozanoMoreno {
public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
               
        int mes,cont_m=0;     
        double dm,acum_di=0;
        String acumm="";
        
        System.out.println("Captura el número de meses que ahorraste");
        mes= teclado.nextInt();
        
        while(mes!=cont_m){
            System.out.println("cúanto ahorrarás");
            dm=teclado.nextInt();
            
            acum_di=acum_di+dm;
            cont_m=cont_m+1;
            acumm=acumm+"El mes "+cont_m+ " ahorraste "+dm+"\n";
           
        }
        System.out.println(acumm);
        System.out.println("El total de tus ahorros es "+acum_di);
        
}
}

