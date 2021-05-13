package locadora;
import locadora.Client;
import locadora.Locacao;
import locadora.Automovel;
import locadora.Marca;
import locadora.Modelo;


public class main {
  public static void main(String[] args) {
    Client oClient = new Client();
    oClient.setClient_cod(873462374);
    oClient.setClient_name("Alcina");
    oClient.setClient_email("fakeemail@troxa.com");
    oClient.setClient_cpf(123123123);
    oClient.setClient_endereco("logo ali virando a esquina");
    oClient.setClient_numero(564353454);
    oClient.setClient_complemento("centro");
    oClient.setClient_cod(234678);

    Locacao aLocadora = new Locacao();
    aLocadora.setlocacao_cod(23434);
    aLocadora.setAuto_cod(675435);
    aLocadora.setClient_cod(345345);
    aLocadora.setLocacao_km(456456);
    aLocadora.setdt_cadastro(23232);

    Automovel oAutomovel = new Automovel();
    oAutomovel.setAuto_cod(342423);
    oAutomovel.setMarca_cod(2112);
    oAutomovel.setModelo_cod(65756);
    oAutomovel.setAuto_nome("Civic");

    Marca aMarca = new Marca();
    aMarca.setMarca_cod(34234);
    aMarca.setMarca_desc("uma marca bem bosta");

    Modelo oModelo = new Modelo();

    oModelo.setModelo_cod(24234234);
    oModelo.setModelo_desc("uma merda");
    
  }
}
