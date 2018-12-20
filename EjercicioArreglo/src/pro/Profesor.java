package pro;
import Modelo.Persona;
public class Profesor extends Persona{
  private  int id_Profesor;
   private double salario;
       
public Profesor(String calle, String colonia, String nombre, String ap_p,String ap_m,String telefono, String tipo,int id_persona, int numero, int id_Profesor, double salario){ 
super(id_persona, nombre, ap_p, ap_m,  calle, colonia,numero, telefono);
this.id_Profesor=id_Profesor;
this.salario=salario; }
public Profesor(){} 



public void setIdProfesor(int id_Profesor){
this.id_Profesor=id_Profesor;}
public int getIdProfesor(){
return id_Profesor;  }
public void setSalario(double Salario){
this.salario=Salario;}
public double getSalario(){
return salario;}}

    
   
    
    
    
    
    
