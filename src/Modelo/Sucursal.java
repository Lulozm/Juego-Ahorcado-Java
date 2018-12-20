package Modelo;
public class Sucursal {
int id_sucursal, numero;
String Nombre, calle, colonia, telefono1;
    
public Sucursal(int id_sucursal, String nombre,int numero, String calle,String colonia,String telefono1){
this.id_sucursal=id_sucursal;
this.numero=numero;
this.Nombre=nombre;
this.calle=calle;
this.colonia=colonia;
this.telefono1=telefono1;

}
public Sucursal(){

id_sucursal=0;
numero=0;
Nombre=null;
calle=null;
colonia=null;
telefono1=null;

}


public void setIdSucursal(int id_sucursal){
this.id_sucursal=id_sucursal;}
public int getIdSucursal(){
return id_sucursal;
}
public void setNumeroCalle(int numero){
this.numero=numero;
}
public int getNumeroCalle(){
return numero;
}


public void setCalle(String calle){}
public String getCalle(){
return calle;}

public void setNombre(String nombre){
Nombre=nombre;
}
public String getNombre(){
return Nombre;}

public void setColonia(String colonia){
this.colonia=colonia;
}
public String getColonia(){
return colonia;}


public void setTelefono(String telefono){
telefono1=telefono;
}
public String getTelefono(){
return telefono1;}
    
}    



