package aulas;

public class Giz implements Caneta {

  public String mensagem = "essa é a mensagem do Giz";
    public String cor;

    public String getCor() {
      return cor;
      }
      
      
      public void setCor(String cor) {
      this.cor = cor;
      }

  @Override
  public String Escrever() {

    System.out.println(mensagem);
    return mensagem;
  }

  @Override
  public String SelecionaCor() {
    String aux;
    aux = getCor();
    return aux;
  }
  
}
