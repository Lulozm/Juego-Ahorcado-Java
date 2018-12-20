package vista;
import Modelo.*;
import controlador.*;
import java.util.Scanner;
public class Principal {
public static void main(String[] args) {
 Scanner teclado=new Scanner(System.in);
 ControladorCliente CCliente=new ControladorCliente();
 ControladorEmpleado CEmpleado=new ControladorEmpleado();
 ControladorSucursal CSucursal= new ControladorSucursal();
 ControladorProducto CProducto=  new ControladorProducto();
 
 
 
 ControladorVenta Cventa=new ControladorVenta();
 
 int usuario=0,contador=0,contrasena=123,contraGeren,contraEmple, respuesta,opc,opcc,id;
 String usuGeren,usuEmple;
 do{
 System.out.println("Tipo de usuario\n1-Gerente\n2-Empleado\n3-Salir");
 try{
 usuario=teclado.nextInt(); teclado.nextLine();}
 catch(Exception e){
 System.out.println("\nEl valor introducido es incorrecto\n");
 teclado.nextLine();}     
  if(usuario==1){
  System.out.println("Introduzca su ID");
  usuGeren=teclado.nextLine();
  do{
  System.out.println("Introduzca su contraseña");
  contraGeren=teclado.nextInt();teclado.nextLine();
  if(contraGeren!=contrasena){System.out.println("Contrasena incorrecta. Intenta otra vez");}
  if(contador==3){System.out.println("Te has equivocado 4 veces. Intenta con otro usuario"); System.exit(0);}
  contador++;
  }while(contraGeren!=contrasena);
  System.out.println("Bienvenido, Gerente");}  
  if(usuario==2){
  System.out.println("Introduzca su ID");
  usuEmple=teclado.nextLine();
  do{
  System.out.println("Introduzca su contraseña");
  contraEmple=teclado.nextInt();teclado.nextLine();
  if(contraEmple!=contrasena){System.out.println("Contrasena incorrecta. Intenta otra vez");}
  if(contador==3){System.out.println("Te has equivocado 4 veces. Intenta con otro usuario"); System.exit(0);}
  contador++;
  }while(contraEmple!=contrasena);
  System.out.println("Bienvenido, Empleado");}
  if(usuario==3){System.exit(0);}
  }while(usuario!=1&&usuario!=2);  

 usuario=1;
 
 
 if(usuario==1){
     do{
     System.out.println("               Menú       \n1-Cliente\n2-Empleado\n3-Sucursal\n4-Producto\n5-Venta");
     respuesta=teclado.nextInt();teclado.nextLine();
     switch(respuesta){
         case 1:
             //Todas las acciones para Cliente
            do{
             System.out.println("               Menú        \n1-Agrear\n2-Consultar\n3-Ver Todo\n4-Regresar");
             opc=teclado.nextInt();teclado.nextLine();
             switch(opc) {
                 case 1: //Agregar Gerente
                     Cliente cliente=new Cliente();
                     System.out.println("Id del cliente");
                     cliente.setCliente(teclado.nextInt()); teclado.nextLine();
                     System.out.println("Nombre del cliente");
                     cliente.setNombre(teclado.nextLine());
                     System.out.println("Apellido Paterno");
                     cliente.setAm(teclado.nextLine());
                     System.out.println("Apellido Materno");
                     cliente.setAp(teclado.nextLine());
                     System.out.println("Calle");
                     cliente.setCalle(teclado.nextLine());
                     System.out.println("Colonia");
                     cliente.setColonia(teclado.nextLine());
                     System.out.println("Numero de la calle");
                     cliente.setNumero(teclado.nextInt());teclado.nextLine();
                     System.out.println("Telefono");
                     cliente.setTelefono(teclado.nextLine());
                     System.out.println("Tipo");
                     cliente.setTipoCliente(teclado.nextLine());
                     CCliente.insertar(cliente);
                     break;
                case 2:
                    //  Consultar
                     System.out.println("Introduce Id del cliente");
                      id=teclado.nextInt(); teclado.nextLine();
                      if(CCliente.Buscar(id)==0){
                     System.out.println("Qué quieres hacer con el empleado \n1-Eliminar \n2-Modificar");
                     opcc=teclado.nextInt();teclado.nextLine();
                     switch(opcc){
                     case 1: /*Elimina*/
                CCliente.eliminar();
                     break;
                     case 2: /*Modifica*/ 
                    Cliente clienteMod=new Cliente();
                     System.out.println("Id del cliente");
                     clienteMod.setCliente(teclado.nextInt()); teclado.nextLine();
                     System.out.println("Nombre del cliente");
                     clienteMod.setNombre(teclado.nextLine());
                     System.out.println("Apellido Paterno");
                     clienteMod.setAm(teclado.nextLine());
                     System.out.println("Apellido Materno");
                     clienteMod.setAp(teclado.nextLine());
                     System.out.println("Calle");
                     clienteMod.setCalle(teclado.nextLine());
                     System.out.println("Colonia");
                     clienteMod.setColonia(teclado.nextLine());
                     System.out.println("Numero de la calle");
                     clienteMod.setNumero(teclado.nextInt());teclado.nextLine();
                     System.out.println("Telefono");
                     clienteMod.setTelefono(teclado.nextLine());
                     System.out.println("Tipo");
                     clienteMod.setTipoCliente(teclado.nextLine());
                     CCliente.modificar(clienteMod, id);
                             break;
                     }}
                
                     case 3: CCliente.VerTodo();
                         break;
                     }
               }while(opc<4);
            
             break;
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
         case 2:
          //Todas las acciones para Empleado
             
             do{
             System.out.println("               Menú        \n1-Agrear\n2-Consultar\n3-Ver Todo\n4-Regresar");
             opc=teclado.nextInt();teclado.nextLine();
             switch(opc) {
                 case 1: //Agregar empleado
                     Empleado empleado=new   Empleado ();
                     System.out.println("Id del empleado");
                      empleado.setIdEmpleado(teclado.nextInt()); teclado.nextLine();
                     System.out.println("Nombre del empleado");
                     empleado.setNombre(teclado.nextLine());
                     System.out.println("Apellido empleado");
                     empleado.setAm(teclado.nextLine());
                     System.out.println("Apellido Materno");
                     empleado.setAp(teclado.nextLine());
                     System.out.println("Calle");
                     empleado.setCalle(teclado.nextLine());
                     System.out.println("Colonia");
                     empleado.setColonia(teclado.nextLine());
                     System.out.println("Numero de la calle");
                     empleado.setNumero(teclado.nextInt());teclado.nextLine();
                     System.out.println("Telefono");
                     empleado.setTelefono(teclado.nextLine());
                     System.out.println("Tipo");
                     empleado.setPuestoEmpleado(teclado.nextLine());
                     CEmpleado.insertar(empleado);
                     break;
                case 2:
                    //  Consultar
                     System.out.println("Introduce Id del empleado");
                      id=teclado.nextInt(); teclado.nextLine();
                      if(CEmpleado.Buscar(id)==0){
                     System.out.println("Qué quieres hacer con el empleado \n1-Eliminar \n2-Modificar");
                     opcc=teclado.nextInt();teclado.nextLine();
                     switch(opcc){
                     case 1: /*Elimina*/
                CEmpleado.eliminar();
                     break;
                     case 2: /*Modifica*/ 
                    Empleado empleadoMod=new Empleado();
                     System.out.println("Id del empleado");
                     empleadoMod.setIdEmpleado(teclado.nextInt()); teclado.nextLine();
                     System.out.println("Nombre del empleado");
                     empleadoMod.setNombre(teclado.nextLine());
                     System.out.println("Apellido Paterno");
                     empleadoMod.setAm(teclado.nextLine());
                     System.out.println("Apellido Materno");
                     empleadoMod.setAp(teclado.nextLine());
                     System.out.println("Calle");
                     empleadoMod.setCalle(teclado.nextLine());
                     System.out.println("Colonia");
                     empleadoMod.setColonia(teclado.nextLine());
                     System.out.println("Numero de la calle");
                     empleadoMod.setNumero(teclado.nextInt());teclado.nextLine();
                     System.out.println("Telefono");
                     empleadoMod.setTelefono(teclado.nextLine());
                     System.out.println("Puesto");
                     empleadoMod.setPuestoEmpleado(teclado.nextLine());
                     CEmpleado.modificar(empleadoMod, id);
                             break;
                     }}
                
                     case 3: CEmpleado.VerTodo();
                         break;
                     }
               }while(opc<4); 
             
             
             
             break;
             
             
             
             
             
             
             
             
             
             
             
             case 3:
          //Todas las acciones para Sucursal
                 
                  
             do{
             System.out.println("               Menú        \n1-Agrear\n2-Consultar\n3-Ver Todo\n4-Regresar");
             opc=teclado.nextInt();teclado.nextLine();
             switch(opc) {
                 case 1: //Agregar sucursal
                     Sucursal sucursal=new   Sucursal ();
                     System.out.println("Id de sucursal");
                     sucursal.setIdSucursal(teclado.nextInt()); teclado.nextLine();
                     System.out.println("Nombre de sucursal");
                     sucursal.setNombre(teclado.nextLine());
                     System.out.println("Calle");
                     sucursal.setCalle(teclado.nextLine());
                     System.out.println("Colonia");
                     sucursal.setColonia(teclado.nextLine());
                     System.out.println("Numero de la calle");
                     sucursal.setNumeroCalle(teclado.nextInt());teclado.nextLine();
                     System.out.println("Telefono");
                     sucursal.setTelefono(teclado.nextLine());
                     
                     CSucursal.insertar(sucursal);
                     break;
                case 2:
                    //  Consultar
                     System.out.println("Introduce Id de sucursal");
                      id=teclado.nextInt(); teclado.nextLine();
                      if(CSucursal.Buscar(id)==0){
                     System.out.println("Qué quieres hacer con la sucursal \n1-Eliminar \n2-Modificar");
                     opcc=teclado.nextInt();teclado.nextLine();
                     switch(opcc){
                     case 1: /*Elimina*/
                CSucursal.eliminar();
                     break;
                     case 2: /*Modifica*/ 
                    Sucursal sucursalMod=new Sucursal();
                     System.out.println("Id de sucursal");
                     sucursalMod.setIdSucursal(teclado.nextInt()); teclado.nextLine();
                     System.out.println("Nombre de sucursal");
                     sucursalMod.setNombre(teclado.nextLine());
                     System.out.println("Calle");
                     sucursalMod.setCalle(teclado.nextLine());
                     System.out.println("Colonia");
                     sucursalMod.setColonia(teclado.nextLine());
                     System.out.println("Numero de la calle");
                     sucursalMod.setNumeroCalle(teclado.nextInt());teclado.nextLine();
                     System.out.println("Telefono");
                     sucursalMod.setTelefono(teclado.nextLine());
                     CSucursal.modificar(sucursalMod, id);
                             break;
                     }}
                
                     case 3: CSucursal.VerTodo();
                         break;
                     }
               }while(opc<4); 
             
                 
                 
                 
                 
                 
             break;
                 
                 
             case 4:
          //Todas las acciones para Producto
                 
                  do{
             System.out.println("               Menú        \n1-Agrear\n2-Consultar\n3-Ver Todo\n4-Regresar");
             opc=teclado.nextInt();teclado.nextLine();
             switch(opc) {
                 case 1: //Agregar  producto
                     Producto  producto=new Producto ();
                     System.out.println("Id de  producto");
                      producto.setId_producto(teclado.nextInt()); teclado.nextLine();
                     System.out.println("Nombre de  producto");
                      producto.setNombre(teclado.nextLine());
                     System.out.println("Precio de venta");
                     producto.setPrecio_venta(teclado.nextInt());teclado.nextLine();
                     System.out.println("Existencia");
                     producto.setExistencia(teclado.nextInt());teclado.nextLine();
                     System.out.println("Marca");
                     producto.setMarca(teclado.nextLine());
                     System.out.println("Presentacion");
                     producto.setPresentacion(teclado.nextLine());
                     System.out.println("Tipo de control");
                     producto.setTipo_control(teclado.nextLine());
                     System.out.println("Tipo de producto");
                     producto.setTipo_producto(teclado.nextLine());
                     System.out.println("Componente quimico");
                     producto.setComponente_quimico(teclado.nextLine());
                     CProducto.insertar(producto);
                
                  
                     break;
                case 2:
                    //  Consultar
                     System.out.println("Introduce Id producto");
                      id=teclado.nextInt(); teclado.nextLine();
                      if(CProducto.Buscar(id)==0){
                     System.out.println("Qué quieres hacer con la sucursal \n1-Eliminar \n2-Modificar");
                     opcc=teclado.nextInt();teclado.nextLine();
                     switch(opcc){
                     case 1: /*Elimina*/
                CProducto.eliminar();
                     break;
                     case 2: /*Modifica*/ 
                    Producto ProductoMod=new Producto();
                      System.out.println("Id de  producto");
                      ProductoMod.setId_producto(teclado.nextInt()); teclado.nextLine();
                     System.out.println("Nombre de  producto");
                     ProductoMod.setNombre(teclado.nextLine());
                     System.out.println("Precio de venta");
                     ProductoMod.setPrecio_venta(teclado.nextInt());teclado.nextLine();
                     System.out.println("Existencia");
                     ProductoMod.setExistencia(teclado.nextInt());teclado.nextLine();
                     System.out.println("Marca");
                     ProductoMod.setMarca(teclado.nextLine());
                     System.out.println("Presentacion");
                     ProductoMod.setPresentacion(teclado.nextLine());
                     System.out.println("Tipo de control");
                     ProductoMod.setTipo_control(teclado.nextLine());
                     System.out.println("Tipo de producto");
                     ProductoMod.setTipo_producto(teclado.nextLine());
                     System.out.println("Componente quimico");
                     ProductoMod.setComponente_quimico(teclado.nextLine());
                     
                     CProducto.modificar(ProductoMod, id);
                             break;
                     }}
                
                     case 3: CProducto.VerTodo();
                         break;
                     }
               }while(opc<4); 
                 
                 
                 
                 
                 
             break;
             case 5:
          //Todas las acciones para Venta
                 
                do{
             System.out.println("               Menú        \n1-Agrear\n2-Consultar\n3-Ver Todo\n4-Regresar");
             opc=teclado.nextInt();teclado.nextLine();
             switch(opc) {
                 case 1: //Agregar  venta
                     Venta venta =new Venta();
                     System.out.println("Id venta");
                     venta.setVenta(teclado.nextInt()); teclado.nextLine();
                     System.out.println("Fecha de venta");
                     venta.setFecha(teclado.nextLine());
                     Cventa.insertar(venta);
                break;
                case 2:
                    //  Consultar
                     System.out.println("Introduce Id de venta");
                      id=teclado.nextInt(); teclado.nextLine();
                      if(Cventa.Buscar(id)==0){
                     System.out.println("Qué quieres hacer con la sucursal \n1-Eliminar \n2-Modificar");
                     opcc=teclado.nextInt();teclado.nextLine();
                     switch(opcc){
                     case 1: /*Elimina*/
                Cventa.eliminar();
                     break;
                     case 2: /*Modifica*/ 
                    Venta ventaMod=new Venta();
                      System.out.println("Id venta");
                     ventaMod.setVenta(teclado.nextInt()); teclado.nextLine();
                     System.out.println("Fecha de venta");
                     ventaMod.setFecha(teclado.nextLine());
                     
                     Cventa.modificar(ventaMod, id);
                             break;
                     }}
                
                     case 3: Cventa.VerTodo();
                         break;
                     }
               }while(opc<4);   
               break;
             default: System.out.println("Seleccón incorrecta");
     }
     
     }while(respuesta<6);
/****************************************************************************************************/
 
}

 if(usuario==2){
 
     
     
     
     
      do{
     System.out.println("               Menú       \n1-Cliente\n2-Empleado\n3-Sucursal\n4-Producto\n5-Venta");
     respuesta=teclado.nextInt();teclado.nextLine();
     switch(respuesta){
     case 1:
     System.out.println("               Menú        \n1-Ver Todo\n2-Regresar");
     opc=teclado.nextInt();teclado.nextLine();
     switch(opc){
     case 1: CCliente.VerTodo();
     break;}
        
            
   
   case 2:
             System.out.println("               Menú        \n1-Ver Todo\n2-Regresar");
             opc=teclado.nextInt();teclado.nextLine();
             switch(opc) {
                 case 1: CEmpleado.VerTodo();
                  break;} 
             break;
             
             
             
          case 3:
          System.out.println("               Menú        \n1-Ver Todo\n2-Regresar");
             opc=teclado.nextInt();teclado.nextLine();
             switch(opc) {
                case 1: CSucursal.VerTodo();
                         break;
                     }
             break;
                 
                 
             case 4:
                           
             System.out.println("               Menú        \n1-Ver Todo\n2-Regresar");
             opc=teclado.nextInt();teclado.nextLine();
             switch(opc) {
                 
                     case 1: CProducto.VerTodo();
                         break;
                     }
               break;
                 
                 
             case 5:
           System.out.println("               Menú        \n1-Agrear \n2-Ver Todo\n3-Regresar");
             opc=teclado.nextInt();teclado.nextLine();
             switch(opc) {
                 case 1: //Agregar  venta
                     Venta venta =new Venta();
                     System.out.println("Id venta");
                     venta.setVenta(teclado.nextInt()); teclado.nextLine();
                     System.out.println("Fecha de venta");
                     venta.setFecha(teclado.nextLine());
                     Cventa.insertar(venta);
                break;
              
                case 2: Cventa.VerTodo();
                         break;
                     }
             
               break;
             default: System.out.println("Seleccón incorrecta");
     }
     
    
      }while(respuesta<6);}}}