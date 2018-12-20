import java.util.Scanner;

public class Romano{

    public static void main(String[] args) {
      Scanner xyz=new Scanner(System.in);

      String Unidad[]={"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
      String Decena[]={"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
      String Centena[]={"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
      System.out.println("Ingresa un numero decimal");
      int N = xyz.nextInt();
      int u=N%10;
      int d=(N/10)%10;
      int c=N/100;
      if(N>=100){         
          System.out.println(Centena[c]+Decena[d]+Unidad[u]);
      }else{
          if(N>=10){
              System.out.println(Decena[d]+Unidad[u]);          
          }else{
              System.out.println(Unidad[N]);          
          }          
      }          
    }
}
