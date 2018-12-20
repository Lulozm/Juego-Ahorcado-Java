
package objeto_persona;
import java.util.Scanner;                                      

public class testpersona {

    public static void main(String[] args) {
     Scanner sc= new Scanner (System.in);  
     
        persona Persona= new persona();
        persona Persona2=new persona();
        
        System.out.println("Captura tu id");
        Persona.setIdPersona(sc.nextInt());sc.nextLine();
        System.out.println("Captura tu nombre");
        Persona.setNombre(sc.nextLine());
        System.out.println("Captura tu edad");
        Persona.setEdad(sc.nextInt());sc.nextLine();
        System.out.println("Captura tu género");
        Persona.setGenero(sc.nextLine());
        Persona.Imprimir();
        Persona.cabezaPPersona();
        
        System.out.println("Captura tu id 2");
        Persona2.setIdPersona(sc.nextInt());sc.nextLine();
        if(Persona.getIdPersona()==Persona2.getIdPersona()){
        while(Persona.getIdPersona()==Persona2.getIdPersona()){
            System.out.println("Tus ID son repetidos Cambialos");
            System.out.println("Introduce nuevo ID para persona 2");
         Persona.setIdPersona(sc.nextInt());
            
        }
        
        }
        System.out.println("Se actualizó el ID 2");sc.nextLine();
        System.out.println("Captura tu nombre 2");
        Persona2.setNombre(sc.nextLine());
        System.out.println("Captura tu edad 2");
        Persona2.setEdad(sc.nextInt());sc.nextLine();
        System.out.println("Captura tu género 2");
        Persona2.setGenero(sc.nextLine());
        Persona2.Imprimir();
        Persona2.cabezaPPersona();
        
        
        
    }
}
