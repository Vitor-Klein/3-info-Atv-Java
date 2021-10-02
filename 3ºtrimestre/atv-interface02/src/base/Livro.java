package base;

public class Livro implements Comparavel{
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

      @Override
      public int Comparar(Object t){
        int comparacao = 0;

        if(t instanceof Livro){
          Livro a = (Livro) t;
          comparacao = this.getAutor().compareTo(a.getAutor());

          if (comparacao == 0) {
            comparacao = this.getTitulo().compareTo(a.getTitulo());
          }
        }
        return comparacao;
      }

      public void ordenar(Comparavel[] objeto){
        for(int i = 0; i < objeto.length; i++){
          for(int j = 0; j < objeto.length; j++){
            if(objeto[i].Comparar(objeto[j]) > 0){
              Comparavel aux = objeto[i];
              objeto[i] = objeto[j];
              objeto[j] = aux;
            }
          }
        }
      }
}
