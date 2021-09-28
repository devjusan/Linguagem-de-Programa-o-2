
public class Person{

  
    private String name;
    private String addres;

     public Person(String name, String adress){
        this.name = name;
        this.addres = adress;  
    }

      public String getName(){
        return this.name;
    }

      public String getAdress(){
        return this.addres;
    }

     public void setAdress(String addres){
        this.addres = addres;
    }

     public String toString(){
        return "Person[name= " + this.getName() + ", adress=  " + this.getAdress() + "]";
    } 
}