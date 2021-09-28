public class testStudent {
     public static void main(String[] args) throws Exception {
      
      Student student = new Student("Fullstack Java Deeveloper", "rua 12345", "Java", 2021, 2.0);

        System.out.println("Name: " + student.getName());
        System.out.println("Adress: " + student.getAdress());
        System.out.println("Program: " + student.getProgram());
        System.out.println("Year: " + student.getYear());
        System.out.println("Free: " + student.getFree());

        student.setProgram("java"); 
        student.setYear(2021); 
        student.setFree(2.0); 

        System.out.println(student.toString());
    }
}
