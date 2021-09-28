public class TestBook {
    public static void main(String[] args) throws Exception {
         Author[] authors = new Author[2];

        authors[0] = new Author("Autor 01","autor01@email.com.br", 'm');
        authors[1] = new Author("Autor 02","autor02@email.com.br", 'm');

        Book testBook = new Book("Java for Dummy", authors, 0);
       
        testBook.setPrice(19.99);
        testBook.setQty(99);
        
        System.out.println("Autor: " + testBook.getName());
        System.out.println("Autores : " + testBook.getAuthorNames());
        System.out.println("Price: " + testBook.getPrice());
        System.out.println("Qty: " + testBook.getQty());

        System.out.println(testBook);
       
    }
}
