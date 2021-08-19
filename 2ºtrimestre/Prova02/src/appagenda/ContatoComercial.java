package appagenda;

public class ContatoComercial extends ContatoBasico {
  protected String atividade;
  protected String funcionario;

  publicContatoComercial(String nome, String atividade, String funcionario)
  {   super(nome);
       this.atividade=atividade;
       this.funcionario=funcionario;
  }

  @Override
  public String getDados() {
    String dados = super.getDados();
    dados += atividade + " contato Sr(a): " + funcionario;
    return dados;
  }
}