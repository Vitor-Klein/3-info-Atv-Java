package base;

public class PessoaJuridica extends Pessoa {
  private String IE;
  private String cnpj;

  public PessoaJuridica(String nome, double altura, int idade, 
  String endereco, String telefone, String CPF){
    super(nome, altura, idade, endereco, telefone);
    this.IE = IE;     
    this.cnpj = cnpj;   
  }

  public String getIE() {
    return IE;
  }

  public void setIE(String iE) {
    IE = iE;
  }

  public String getCnpj() {
    return cnpj;
  }

  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  
}
