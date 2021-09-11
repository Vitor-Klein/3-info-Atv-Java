package base;

public class Livro {
  private String autor;
  private String titulo;

  public Livro(String autor, String titulo) {
    super();
    this.autor = autor;
    this.titulo = titulo;
  }

  public String getAutor() {
    return autor;
    }
    
    
    public void setAutor(String autor) {
      this.autor = autor;
    }

    public String getTitulo() {
      return titulo;
      }
      
      
      public void setTitulo(String titulo) {
        this.titulo = titulo;
      }
}
