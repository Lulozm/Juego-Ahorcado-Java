package pro;
import java.util.Scanner;
public class TestProfesor {
 public static void main(String[] args) {
     int cont=0, respuesta=0;
Profesor profesor[]=new Profesor[10];
Scanner teclado =new Scanner(System.in);   
ControladorPersona controlador=new ControladorPersona();

int id=0;

do{
    
     System.out.println("1-Ingresar datos\n2-Eliminar Registro\n3-Buscar Registro \n4-Cosultar Registro \n5-Salir");     
respuesta=teclado.nextInt();
     switch(respuesta){
         case 1:  
         Profesor profe=new Profesor();
        profe.setIdProfesor(id); 
        id++;
        teclado.nextLine();
          System.out.println("Ingresa nombre");
        profe.setNombre(teclado.nextLine());
        System.out.println("Ingresa apellido parterno");
        profe.setAp(teclado.nextLine());
        System.out.println("Ingresa apellido materno");
        profe.setAm(teclado.nextLine());
        System.out.println("Ingresa Salario");
        profe.setSalario(teclado.nextDouble()); teclado.nextLine();
        controlador.Insertar(profe);
        
        break;
         case 4:
         controlador.Consultar();
         break;
     }}while(respuesta<5);      
             
     
 
 
 }
}
