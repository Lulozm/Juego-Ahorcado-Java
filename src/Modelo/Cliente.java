package Modelo;

public class Cliente extends Persona {
  private int id_cliente;
private String tipo_cliente;   
              
public Cliente(int id_cliente, String tipo, String calle,String colonia, int numero, String nombre, String ap_p, String ap_m,String telefono){
  super( calle,colonia,numero,nombre,ap_p,ap_m, telefono);
    this.id_cliente=id_cliente;
  tipo_cliente=tipo;
  }
    
  public Cliente(){
  }
    


public void setCliente(int id_ciente){
id_cliente=id_ciente;
}

public int getCliente(){
return id_cliente;
}
   
public void setTipoCliente(String tipo){

tipo_cliente=tipo;
}
public String  getTipoCliente(){
return tipo_cliente;
}
    
}
