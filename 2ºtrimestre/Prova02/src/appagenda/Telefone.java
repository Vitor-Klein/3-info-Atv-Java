package appagenda;

public class Telefone {
  private String numero;
  private String tipo;

  publicTelefone(String numero, String tipo)
    {   this.numero = numero;
         this.tipo = tipo;
    }

  public String getTelefone() {
    return numero + " " + tipo;
  }
}