package controlador;
import Modelo.*;
import vista.*;

public class ControladorSucursal {
 Sucursal sucursal=new Sucursal();
Sucursal sucursalarray[]=new Sucursal[10];
int cont=0,a=0;        

public void insertar(Sucursal sucursal){
sucursalarray[cont]=sucursal;
cont++;}

public int Buscar(int id){
int error=0;
for(int i=0; i<cont;i++){
if(sucursalarray[i].getIdSucursal()==id){
System.out.println("Id: "+sucursalarray[i].getIdSucursal()+"\nNombre: "+sucursalarray[i].getNombre()+"\n Domicilio: "+sucursalarray[i].getColonia()+" "+sucursalarray[i].getNumeroCalle()+"\n Telefono"+sucursalarray[i].getTelefono());
}}
return error;}

public  void modificar(Sucursal sucursalMod, int id){
for(int i=0; i<cont;i++){
if(sucursalarray[i].getIdSucursal()==id){
sucursalarray[i]=sucursalMod;
}else{System.out.println("No se encontró ese usuario");}}}

public void VerTodo(){
for(int i=0; i<cont;i++){
System.out.println("Id: "+sucursalarray[i].getIdSucursal()+"\nNombre: "+sucursalarray[i].getNombre()+"\n Domicilio: "+sucursalarray[i].getColonia()+" "+sucursalarray[i].getNumeroCalle()+"\n Telefono"+sucursalarray[i].getTelefono());
}}

public void eliminar (){
    System.out.println("Eliminado");
}}
     