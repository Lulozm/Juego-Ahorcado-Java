package CincoProgramasPooMain;
import java.util.Scanner;
import CincoProgramasPoo.*;
public class CincoProgramasPooMain {
public static void main(String[] args) {
Scanner teclado=new Scanner(System.in);
int respuesta;
System.out.println("Elige un programa\n1-Conversion decimal a binario \n2-Ahorro por mes\n3-Conversion de ºC a ºF\n4-Promedio de calificaciones\n5-Tablas de mutiplicar");
respuesta=teclado.nextInt();
switch(respuesta){
case 1:
int num;
String metodoBinarios;
System.out.println("Introduce un número en decimal");
num=teclado.nextInt();   
metodoBinarios=CincoProgramasPoo.conversionBinarios(num);
System.out.println("El número decimal "+ num+ " es "+ metodoBinarios+ " en binario");
break;  
case 2:
int mes;
double metodoAhorro;
System.out.println("Captura el número de meses que ahorraste");
mes= teclado.nextInt();
metodoAhorro= CincoProgramasPoo.ahorro(mes);
System.out.println("Lo ahorrado fue " +metodoAhorro);
break;
case 3:
double centigrados,metodoConversionesCAF;   
System.out.println("Introduce los grados centigrados que quieres convertir");
centigrados=teclado.nextDouble();
metodoConversionesCAF=CincoProgramasPoo.conversionCAF(centigrados);
System.out.println("La conversion de "+centigrados+" ºC "+ " es "+metodoConversionesCAF +"ºF");
break; 
case 4:
String resp,metodoPromedios;
double cal;        
metodoPromedios=CincoProgramasPoo.promedios();
System.out.println("\n\nLas calificaiones fueron:\nNombre\tCalificacion\n"+metodoPromedios);    
break;
case 5:
int numI, numF;
String metodoTablasM;
System.out.println("Introduce el numero inicial de la tabla de multiplicar");
numI=teclado.nextInt();
System.out.println("Introduce el numero final de la tabla de multiplicar");
numF=teclado.nextInt();
metodoTablasM=CincoProgramasPoo.tablasMultiplicar(numI,numF);
System.out.println("\n\nLas tablas de multiplicar seleccionadas son:\n"+metodoTablasM);
break;  
default:
System.out.println("Adios");
System.exit(0); }}}