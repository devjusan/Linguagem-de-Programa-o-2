public class App {
    public static void main(String[] args) throws Exception {
        author autor = new author("Valmir/Gregory", "email@email.com", 'f');

        System.out.println("Author: " + autor.getName());
         System.out.println("email: " + autor.getEmail());
         System.out.println("Gender: " + autor.getGender());
         autor.setEmail("email@email.com");
         System.out.println(autor.toString());

    }
}
