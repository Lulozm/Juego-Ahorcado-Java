package Modelo;
public class Persona {
private int  numero; 
private String calle, colonia, nombre, ap_p,ap_m, telefono;

public Persona( String calle,String colonia, int numero, String nombre, String ap_p, String ap_m,String telefono){             

this.nombre=nombre;
this.calle=calle;
this.colonia=colonia;
this.ap_p=ap_p;
this.ap_m=ap_m;
this.numero=numero;
this.telefono=telefono;
}

public Persona(){}



public void setNumero(int numero){
this.numero=numero;

}
public int getNumero(){
return numero;
}

public void setNombre(String nombre){
this.nombre=nombre;

}
public String getNombre(){
return nombre;
}

public void setCalle(String calle){
this.calle=calle;
}
public String getCalle(){
return calle;
}

public void setColonia(String colonia){
this.colonia=colonia;
}
public String getColonia(){
return colonia;
}

public void setAp(String ap){
ap_p=ap;
}
public String getAp(){
return ap_p;
}

public void setAm(String am){
ap_m=am;
}
public String getAm(){
return ap_m;
}
public void setTelefono(String telefono){
this.telefono=telefono;
}
public String getTelefono(){
return telefono;
}




}