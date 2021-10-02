package base;

public class TesteLivro {
  private static void main(String[] args){
    Livro[] livros = new Livro[5];
    livros[0] = new Livro("Willyan", "Romeu e Julieta");
    livros[1] = new Livro("Vitor", "Brilho Eterno");
    livros[2] = new Livro("J.K.Rolling", "Harry Potter");

    for(int i = 0; i < livros.length; i++){
      livros[i].ordenar(livros);
      System.out.println("");
    }
  }
}
