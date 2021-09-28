public class testStaff {
  
     public static void main(String[] args) throws Exception {
      
      Staff staff = new Staff("Valmir/Gregory", "rua 123","Escola", 22);
        System.out.println("Name: " + staff.getName());
        System.out.println("Adress: " + staff.getAdress());
        System.out.println("School: " + staff.getSchool());
        System.out.println("Pay: " + staff.getPay());
    

      
        staff.setSchool("Escola");
        staff.setPay(22);

        System.out.println(staff.toString());
  
     }
}
