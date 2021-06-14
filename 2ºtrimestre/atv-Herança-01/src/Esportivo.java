public class Esportivo extends Automovel {
  private String Velocidade;

  public Esportivo(int Id, String Chassi, String Marca, int Ano, String Cor, String Modelo, String Descrição, String velocidade) {
    super(Id, Chassi, Marca, Ano, Cor, Modelo, Descrição);
    this.Velocidade = Velocidade;
  }

  public String getVelocidade() {
    return Velocidade;
  }

  public void setVelocidade(String Velocidade) {
    this.Velocidade = Velocidade;
  }
}
