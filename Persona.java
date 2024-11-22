public class Persona{
  public String name;
  public int age;
  public Persona(){
    this.name="";
    this.age=0;
  }
  public Persona(String name, int age){
    this.name=name;
    this.age=age;
    
  }
  public void showInfo(){
    System.out.println("Nombre: "+this.name);
    System.out.println("Edad: "+this.age);
  }
  
}
