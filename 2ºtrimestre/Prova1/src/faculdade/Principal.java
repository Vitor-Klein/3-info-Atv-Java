package faculdade;

public class Principal {
  public static void main(String[] args) {
    Professor40Hr Professor40Hr = new Professor40Hr("Jubiscreuso", "3 A", 39, 1400.00);
    ProfessorPorHora ProfessorPorHora = new ProfessorPorHora("Burrodosherek", "3 B", 25, 5.4, 30);
    System.out.println(" Cadastro Professor Regime  ");
    System.out.println("\nNome :" + Professor40Hr.getNome() + "\nMatricula: " + Professor40Hr.getMatricula()
        + "\nIdade : " + Professor40Hr.getIdade() + "\nSalario: " + Professor40Hr.getSalario());

    ProfessorPorHora.setSalario(ProfessorPorHora.getSalario());

    System.out.println(" Cadastro Professor Horas ");
    System.out.println("\nNome :" + ProfessorPorHora.getNome() + "\nMatricula: " + ProfessorPorHora.getMatricula()
        + "\nIdade : " + ProfessorPorHora.getIdade() + "\nSalario: " + ProfessorPorHora.getSalario()
        + "\nHoras Trabalhadas :" + ProfessorPorHora.getHoras());
  }
}
