package controlador;
import Modelo.*;
import vista.*;

public class ControladorCliente {
 Cliente cliente=new Cliente();
Cliente clientearray[]=new Cliente[10];
int cont=0,a=0;        

public void insertar(Cliente cliente){
clientearray[cont]=cliente;
cont++;}

public int Buscar(int id){
int error=0;
for(int i=0; i<cont;i++){
if(clientearray[i].getCliente()==id){
System.out.println("Id: "+clientearray[i].getCliente()+"\nNombre: "+clientearray[i].getNombre()+"\n Apellidos "+clientearray[i].getAm()+" "+clientearray[i].getAp()+"\n Domicilio: "+clientearray[i].getColonia()+" "+clientearray[i].getNumero()+"\nTipo "+clientearray[i].getTipoCliente()+"\n Telefono"+clientearray[i].getTelefono());
}}
return error;}

public  void modificar(Cliente clienteMod, int id){
for(int i=0; i<cont;i++){
if(clientearray[i].getCliente()==id){
clientearray[i]=clienteMod;
}else{System.out.println("No se encontró ese usuario");}}}

public void VerTodo(){
for(int i=0; i<cont;i++){
System.out.println("\nId: "+clientearray[i].getCliente()+"\nNombre: "+clientearray[i].getNombre()+"\n Apellidos "+clientearray[i].getAm()+" "+clientearray[i].getAp()+"\n Domicilio "+clientearray[i].getColonia()+" "+clientearray[i].getNumero()+"\nTipo "+clientearray[i].getTipoCliente()+"\n Telefono"+clientearray[i].getTelefono()+"\n"  );}}
        
public void eliminar (){
    System.out.println("Eliminado");
}}
        
       