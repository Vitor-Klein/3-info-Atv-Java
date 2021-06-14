public class Principal {
  public static void main(String[] args) {
    Esportivo esportivo1 = new Esportivo(1029, "novo","Chevrolet", 2019, "verde", "Marea", "Muito bom", "100Km/h");

    Utilitario utilitario1 = new Utilitario(1239, "usado","Mustang", 1909, "amarelo", "Turbo", "otimo", "200Km/h");

    System.out.println(" Automovel Esportivo  ");
    System.out.println(
        "\nID :" + esportivo1.getId() + "\nChassis: " + esportivo1.getChassi() + "\nMarca : " + esportivo1.getMarca() + "\nAno: " + esportivo1.getAno()
            + "\nCor:" + esportivo1.getCor() + "\nModelo:" + esportivo1.getModelo() + "\nDescricao:" + esportivo1.getDescrição() + "\n");

    System.out.println(" Automovel Utilitario  ");
    System.out.println(
        "\nID :" + utilitario1.getId() + "\nChassis: " + utilitario1.getChassi() + "\nMarca : " + utilitario1.getMarca() + "\nAno: " + utilitario1.getAno()
            + "\nCor:" + utilitario1.getCor() + "\nModelo:" + utilitario1.getModelo() + "\nDescricao:" + utilitario1.getDescrição() + "\n");
  }
}