public class Utilitario extends Automovel {
  private String Passageiros;

  public Utilitario(int Id, String Chassi, String Marca, int Ano, String Cor, String Modelo, String Descrição, String velocidade) {
    super(Id, Chassi, Marca, Ano, Cor, Modelo, Descrição);
    this.Passageiros = Passageiros;
  }

  public String getPassageiros() {
    return Passageiros;
  }

  public void setPassageiros(String Passageiros) {
    this.Passageiros = Passageiros;
  }
}
