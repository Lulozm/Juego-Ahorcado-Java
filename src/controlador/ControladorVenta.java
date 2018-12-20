package controlador;
import Modelo.*;
import vista.*;

public class ControladorVenta {
 Venta venta=new Venta();
Venta ventaarray[]=new Venta[10];
int cont=0,a=0;        

public void insertar(Venta venta){
ventaarray[cont]=venta;
cont++;}

public int Buscar(int id){
int error=0;
for(int i=0; i<cont;i++){
if(ventaarray[i].getVenta()==id){
System.out.println("Id: "+ventaarray[i].getVenta()+"\nFecha"+ventaarray[i].getFecha());}}
return error;}

public  void modificar(Venta ventaMod, int id){
for(int i=0; i<cont;i++){
if(ventaarray[i].getVenta()==id){
ventaarray[i]=ventaMod;
}else{System.out.println("No se encontró ese usuario");}}}

public void VerTodo(){
for(int i=0; i<cont;i++){
System.out.println("Id: "+ventaarray[i].getVenta()+"\nFecha"+ventaarray[i].getFecha());
}}        
public void eliminar (){
    System.out.println("Eliminado");
}}
        
       