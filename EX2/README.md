# LP2

## Exercicio 02 de Java 

Um livro pode ser escrito por um ou muitos autores, por esta razão a classe booking
deve ter um array de autores, conforme o modelo abaixo:

- O construtor deve receber um array de autores

- Uma vez que o livro é instanciado o seu autor não pode ser adicionado ou removido.

- O método toString() deve retornar a seguinte resposta:

"Book[name=?,authors={Author[name=?,email=?,gender=?],......},price=?,qty=?]".
Você deve:

- Escrever um código para a classe Book, você deve reutilizar o código do Author
escrito no exercício 1

- Escrever uma classe de teste, chamada TestBook, para testar a classe Book.

Dicas:

// Crie e aloque o array de autores.

Author[] authors = new Author[2];

authors[0] = new Author("Autor 01", "autor01@somewhere.com.br", 'm');

authors[1] = new Author("Autor 02", "autor02@nowhere.com.br", 'm');

// Declarar e alocar a instância de um booking.

Book testeBook = new Book("Java for Dummy", authors, 19.99, 99);

System.out.println(testeBook); // toString()

# Integrantes 
- Valmir   Matricula: CB3010619
- Gregory    Matricula: CB3012107
