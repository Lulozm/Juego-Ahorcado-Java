package Modelo;

public class Producto {
  
    
  private  int id_producto,precio_venta,existencia;
private String marca, presentacion,tipo_control,nombre,tipo_producto, componente_quimico;
public Producto(int id_producto, int precio_venta, int existencia,  String marca,String presentacion,String tipo_control,String nombre, String tipo_producto,String componente_quimico){

  this.id_producto=id_producto;
  this.precio_venta=precio_venta; 
  this.existencia=existencia;
  this.marca=marca;
  this.presentacion=presentacion;
  this.tipo_control=tipo_control;
  this.nombre=nombre;
  this.tipo_producto=tipo_producto; 
  this.componente_quimico=componente_quimico;}

public Producto(){
}

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(int precio_venta) {
        this.precio_venta = precio_venta;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public String getTipo_control() {
        return tipo_control;
    }

    public void setTipo_control(String tipo_control) {
        this.tipo_control = tipo_control;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo_producto() {
        return tipo_producto;
    }

    public void setTipo_producto(String tipo_producto) {
        this.tipo_producto = tipo_producto;
    }

    public String getComponente_quimico() {
        return componente_quimico;
    }

    public void setComponente_quimico(String componente_quimico) {
        this.componente_quimico = componente_quimico;
    }}
