    package pro;
    public class ControladorPersona {
    int cont=0;
    Profesor profesor[]=new Profesor[5];
    
    public void Insertar(Profesor profe){
    profesor[cont]=profe;
    cont=cont+1;}
    
    public void Consultar(){
    for(int i=0; i<cont;i++){
    System.out.println(profesor[i].getIdProfesor()+" "+profesor[i].getNombre()+" "+profesor[i].getAp()+" "+profesor[i].getAm()+" "+profesor[i].getSalario());}
    
    }}
