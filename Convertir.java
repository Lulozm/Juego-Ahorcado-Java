/* Programa para convertir el decimal a binario, octal y hexadecimal c: */

import algoritmos.Equivalencia;
import java.io.*;

public class Convertir{
	
	public static void main(String args[]){
    int ndecimal=0; //Aquí almacenará el decimal ingresado por el wey que use mi programa

    try{
    System.out.println("Ingrese un numero entero en decimal");
    BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    ndecimal = Integer.parseInt(entrada.readLine());
    Equivalencia operacion = new Equivalencia(ndecimal);
    System.out.println("El número decimal"+ndecimal+ "En binario es: "+ operacion.convertirBinario());
    System.out.println("El número decimal"+ndecimal+ "En octal es: "+ operacion.convertirOctal());
    System.out.println("El número decimal"+ndecimal+ "En Hexadecimal es: "+ operacion.convertirHexadecimal());




    }catch(IOException e) {}


	}
}