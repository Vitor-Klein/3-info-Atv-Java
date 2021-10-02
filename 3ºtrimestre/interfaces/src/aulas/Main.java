package aulas;
public class Main {
  public static void main(String[] args) {
    CanetaEsferografica ce = new CanetaEsferografica();
    Lapis la = new Lagis();
    Giz gz = new Giz();

    ce.setCor("Azul");
    ce.Escrever();

    la.setCor("Grafite");
    la.Escrever();

    gz.setCor("Branco");
    gz.Escrever();
  }
}
