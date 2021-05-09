package client;

import client.Client;
import client.Contract;

public class ClientContect {
  public static void main(String[] args) {
    Client firstClient = new Client();
    Contract firstContract = new Contract();

    firstClient.CodigoCliente = 2312313;
    firstContract.CodigoDoContrato = 8334289;
    firstContract.NumeroDOContrato = 23;
    firstContract.CodigoDaModalidadeDoContrato = 4354554;

    System.out.println("Código do cliente: "+ firstClient.CodigoCliente);
    System.out.println("Código do contrato: "+ firstContract.CodigoDoContrato);
    System.out.println("Numero do contrato: "+ firstContract.NumeroDOContrato);
    System.out.println("Código da modalidade do contrato: "+ firstContract.CodigoDaModalidadeDoContrato);


  }
}
