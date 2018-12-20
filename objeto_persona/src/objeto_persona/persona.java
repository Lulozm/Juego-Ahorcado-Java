package objeto_persona;




public class persona {

private int id_persona,edad;
private String nombre,genero;
 private static int numcabez=1;



public void setIdPersona(int id){
this.id_persona=id;
    
}
public int getIdPersona(){
return id_persona;
}


public void setEdad(int edad){
    this.edad=edad;
    
}
public int getEdad(){
return edad;
}

public void setNombre(String nombre){
this.nombre=nombre;
    
}
public String getNombre(){
return nombre;
}




public void setGenero(String genero){
this.genero=genero;
    
}
public String getGenero(){
return genero;
}
public int getCabeza(){
return numcabez;
}

public void Imprimir(){

    System.out.println("Edad: "+edad+" nombre "+nombre+" Genero "+genero+" ID "+id_persona);
}

static void cabezaPPersona(){
    System.out.println("Todas las personas tienen "+numcabez+" cabezas ");
}


}