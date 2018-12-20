package controlador;
import Modelo.*;
import vista.*;
public class ControladorEmpleado {
    
 Empleado cliente=new Empleado();
Empleado Empleadoarray[]=new Empleado[10];
int cont=0,a=0;        

public void insertar(Empleado Empleado){
Empleadoarray[cont]=Empleado;
cont++;}

public int Buscar(int id){
int error=0;
for(int i=0; i<cont;i++){
if(Empleadoarray[i].getIdEmpleado()==id){
System.out.println("Id: "+Empleadoarray[i].getIdEmpleado()+"\nNombre: "+Empleadoarray[i].getNombre()+"\n Apellidos "+Empleadoarray[i].getAm()+" "+Empleadoarray[i].getAp()+"\n Domicilio: "+Empleadoarray[i].getColonia()+" "+Empleadoarray[i].getNumero()+"\nPuesto "+Empleadoarray[i].getPuestoEmpleado()  +"\n Telefono"+Empleadoarray[i].getTelefono());
}}
return error;}

public  void modificar(Empleado EmpleadoMod, int id){
for(int i=0; i<cont;i++){
if(Empleadoarray[i].getIdEmpleado()==id){
Empleadoarray[i]=EmpleadoMod;
}else{System.out.println("No se encontró ese usuario");}}}

public void VerTodo(){
for(int i=0; i<cont;i++){
System.out.println("\nId: "+Empleadoarray[i].getIdEmpleado()+"\nNombre: "+Empleadoarray[i].getNombre()+"\n Apellidos "+Empleadoarray[i].getAm()+" "+Empleadoarray[i].getAp()+"\n Domicilio: "+Empleadoarray[i].getColonia()+" "+Empleadoarray[i].getNumero()+"\nPuesto "+Empleadoarray[i].getPuestoEmpleado()+"\n Telefono"+Empleadoarray[i].getTelefono()+"\n"  );}}
        
public void eliminar (){
    System.out.println("Eliminado");
}}
        
