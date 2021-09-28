package base;

public class Pessoa {


  private String nome ;
  private double altura;
  private int idade;
  private String endereco, telefone;

  public Pessoa(){
    super();
  }
  
  public Pessoa(String nome, double altura, int idade, String endereco, String telefone) {
  this.nome = nome;
  this.altura = altura;
  this.idade = idade;
  this.endereco = endereco;
  this.telefone = telefone;
  }
  public String getNome() {
  return nome;
  }
  public void setNome(String nome) {
  this.nome = nome;
  }
  public double getAltura() {
  return altura;
  }
  public void setAltura(double altura) {
  this.altura = altura;
  }
  public int getIdade() {
  return idade;
  }
  public void setIdade(int idade) {
  this.idade = idade;
  }
  public String getEndereco() {
  return endereco;
  }
  public void setEndereco(String endereco) {
  this.endereco = endereco;
  }
  public String getTelefone() {
  return telefone;
  }
  public void setTelefone(String telefone) {
  this.telefone = telefone;
  }
  
  }
  