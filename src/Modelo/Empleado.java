package Modelo;
public class Empleado extends Persona{
   private int id_empleado;
   private String puesto;
  
   public Empleado(int id_empleado, String puesto, String calle,String colonia, int numero, String nombre, String ap_p, String ap_m,String telefono ){
super(  calle,colonia,numero,nombre,ap_p,ap_m, telefono);
       this.id_empleado=id_empleado;
   this.puesto=puesto;}
  
   
   public Empleado(){} 
   
   public void setIdEmpleado(int id_empleado){
   this.id_empleado=id_empleado;}
   public int getIdEmpleado(){
   return id_empleado;  }
   
public void setPuestoEmpleado(String puesto){
this.puesto=puesto;}
public String getPuestoEmpleado(){
return puesto;}   
   
}
