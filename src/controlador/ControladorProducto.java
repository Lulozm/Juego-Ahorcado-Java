package controlador;
import Modelo.*;
import vista.*;

public class ControladorProducto {
 Producto producto=new Producto();
Producto productoarray[]=new Producto[10];
int cont=0,a=0;        

public void insertar(Producto producto){
productoarray[cont]=producto;
cont++;}

public int Buscar(int id){
int error=0;
for(int i=0; i<cont;i++){
if(productoarray[i].getId_producto()==id){
System.out.println("id :"+productoarray[i].getId_producto()+"\nprecio venta:"+productoarray[i].getPrecio_venta()+"\nExistencia :"+productoarray[i].getExistencia()+"\nMarca :"+productoarray[i].getMarca() +"\npresentacion :"+productoarray[i].getPresentacion()+"\ntipo control :"+productoarray[i].getTipo_control()+"\nNombre :"+productoarray[i].getNombre()+"\ntipo de producto :"+productoarray[i].getTipo_producto()+"\ncomponente quimico:"+productoarray[i].getComponente_quimico());
}}
return error;}

public  void modificar(  Producto productoMod, int id){
for(int i=0; i<cont;i++){
if( productoarray[i].getId_producto()==id){
 productoarray[i]= productoMod;
}else{System.out.println("No se encontró ese  producto");}}}

public void VerTodo(){
for(int i=0; i<cont;i++){
System.out.println("id :"+productoarray[i].getId_producto()+"\nprecio venta:"+productoarray[i].getPrecio_venta()+"\nExistencia :"+productoarray[i].getExistencia()+"\nMarca :"+productoarray[i].getMarca() +"\npresentacion :"+productoarray[i].getPresentacion()+"\ntipo control :"+productoarray[i].getTipo_control()+"\nNombre :"+productoarray[i].getNombre()+"\ntipo de producto :"+productoarray[i].getTipo_producto()+"\ncomponente quimico:"+productoarray[i].getComponente_quimico());
}}

public void eliminar (){
    System.out.println("Eliminado");
}}
     