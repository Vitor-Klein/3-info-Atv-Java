import java.util.Scanner;

public class Aluno {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    String Name, endereco;
    double matricula, telefone;

    System.out.println("Informe seu nome: ");
    Name = sc.next();
    System.out.println("informe sua matricula: ");
    matricula = sc.nextDouble();
    System.out.println("informe seu endereco: ");
    endereco = sc.next();
    System.out.println("informe seu telefone: ");
    telefone = sc.nextDouble();

    System.out.println("Nome: " + Name);
    System.out.println("matricula: " + matricula);
    System.out.println("endereco: " + endereco);
    System.out.println("telefone: " + telefone);
  }
}
