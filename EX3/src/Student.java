public class Student  extends Person{

    private String program;
    private int year;
    private double free;

     public  Student(String name, String adress,String program,int year,double free ){
        super(name, adress);
        this.program = program;
        this. year =  year;  
        this.free = free;
    }

     public String getProgram(){
        return this.program;
    }

     public void setProgram(String program){
        this.program = program;
    }

      public int getYear(){
        return this.year;
    }

     public void setYear(int year){
        this.year = year;
    }

       public double getFree(){
        return this.free;
    }

     public void setFree(double free){
        this.free = free;
    }

     public String toString(){
        return "Student[" + super.toString() +"program= " + this.getProgram() + ", year= " + this.getYear() +  ",free=" + this.getFree() + "]";
    } 
}
