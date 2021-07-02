package Supermercado;

public class Supermercado {
  int contador;
  private Caixa[] caixa = new Caixa[10];

  public void adicionaCaixa(Caixa c) {

    if (this.contador < this.caixa.length) {
      caixa[this.contador] = c;
      System.out.println("Caixa inserido na posição: " + this.contador);
      this.contador++;
    }
  }
}