package CincoProgramasPoo;
import java.util.Scanner;
public class CincoProgramasPoo {
    public static String conversionBinarios(int num) {  
int div=0,acum=0;
String acumBinario="", invertir="";
while(num>0){
acum=div%2;
div=num/2;
acumBinario=acumBinario+acum;
num=div;}
for (int x=acumBinario.length()-1;x>=0;x--){
invertir = invertir + acumBinario.charAt(x); }
return invertir; } 
public static double ahorro(int mes){
Scanner teclado=new Scanner(System.in);
int cont_m=0;     
double dm,acum_di=0;
String acumm="";
while(mes!=cont_m){
System.out.println("cúanto ahorrarás");
dm=teclado.nextInt();
acum_di=acum_di+dm;
cont_m=cont_m+1;
acumm=acumm+"El mes "+cont_m+ " ahorraste "+dm+"\n";}
System.out.println(acumm);
return acum_di;}
public static double conversionCAF(double centigrados){
double faren;
faren= (1.8*centigrados)+32;
return faren;}
public static String promedios(){
Scanner teclado=new Scanner(System.in);
double  prom, suma=0,cal;
String acumm="",resp;
for(int i=0;i<5;i++){
System.out.println("Nombre de la materia");
resp=teclado.next();
System.out.println("Calificación");
cal=teclado.nextInt();
suma=suma+cal;
acumm=acumm+resp+"\t"+cal+"\n";}
prom=suma/5;
acumm=acumm+"El promedio fue "+prom;
return acumm;}
public static String tablasMultiplicar(int numI, int numF){
int suma=0,opera;
String tabla="";        
for(int i=numI;i<=numF;i++){
tabla=tabla+"\n";
for(int j=1;j<=12;j++){
opera=i*j;
tabla=tabla+i+"*"+j+" = "+opera+"\n";}}
return tabla;}}