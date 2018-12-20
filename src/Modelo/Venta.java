package Modelo;
public class Venta {
    private String fecha; //DD-MM-AA
 private int id_venta;
    
 public Venta(String fecha, int id_venta){
     this.fecha=fecha;
     this.id_venta=id_venta;}  

public Venta(){
   }  


public void setFecha(String fecha){
this.fecha=fecha;

}
public String getFecha(){
return fecha;
}


public void setVenta(int venta){
id_venta=venta;

}
public int getVenta(){
return id_venta;
}



}
