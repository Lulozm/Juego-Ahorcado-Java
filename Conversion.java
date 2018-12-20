import java.util.Scanner;

public class Conversion{

    public static void main (String[] args) {

        int exp, digito, numero;
        double binario;
        Scanner xyz = new Scanner(System.in);

        do{  
            System.out.print("Introduce un numero decimal ");
            numero = xyz.nextInt();
        }while(numero<0);

        exp=0;
        binario=0;
        while(numero!=0){
                digito = numero % 2;            
                binario = binario + digito * Math.pow(10, exp);   
                exp++;
                numero = numero/2;
        }
        System.out.printf("Binario: %.0f %n", binario);
    }
}