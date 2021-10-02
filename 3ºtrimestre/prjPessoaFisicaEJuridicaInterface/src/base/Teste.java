package base;

public class Teste {
  public static void main(String[] args){
    PessoaJuridica pj = new PessoaJuridica();
    pj.setNome("Vitor");
    pj.setAltura(1.75);
    pj.setEndereco("Rua Santa Cruz");
    pj.setIdade(17);
    pj.setCnpj("1222834834");
    pj.imprime();
  }
}
