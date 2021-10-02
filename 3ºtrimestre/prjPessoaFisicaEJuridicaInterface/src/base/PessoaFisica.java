package base;

public class PessoaFisica extends Pessoa {

  private String cpf;
  
  public PessoaFisica(String nome, double altura, int idade, 
  String endereco, String telefone, String CPF) {
  super(nome, altura, idade, endereco, telefone);
  this.cpf = CPF; 
  }
  
  
  public String getCpf() {
  return cpf;
  }
  
  
  public void setCpf(String cpf) {
  this.cpf = cpf;
  }
  
  
  
  
  }
