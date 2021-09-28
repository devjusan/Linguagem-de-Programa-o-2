import java.util.Arrays;

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;


    public Book(String name, Author[] authors, double price){
        this.name = name ;
        this.authors = authors;
        this.price = price;

    }

       public Book(String name, Author[] authors, double price, int qty){
        this.name = name ;
        this.authors = authors;
        this.price = price;
        this.qty = qty;

    }

     public String getName(){
        return this.name;
    }

     public Author[] getAuthors() {
       return this.authors;
    }

      public double getPrice(){
        return this.price;
    }
    
      public void setPrice(double price){
        this.price  = price;
    }

        public int getQty(){
        return this.qty;
    }
    
      public void setQty(int qty){
        this.qty  = qty;
    }

     public String toString(){
        return "Book[name= " + this.getName() + ", authors= { " + Arrays.toString(authors) + "}, price= " + this.getPrice() +  ", qty" + this.getQty() + "]";
    }

    //contador
    public String getAuthorNames(){
        int contador = 0;
        for(int i = 0; i < this.authors.length; i++){
          if(this.authors[i]!=null){
            contador++;
          }
        }
        String name = "";
        for(int  i = 0; i < contador; i++){
          if(i == 0){
            name = this.authors[i].getName();
          }else{
            name = name + ", " + this.authors[i].getName();
          }
        }
        return name;
    }

}