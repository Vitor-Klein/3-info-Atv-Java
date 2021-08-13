package faculdade;

public class ProfessorPorHora extends Professor{
    private int horas;

    public ProfessorPorHora(String nome, String matricula, int idade, double salario, int horas) {
        super(nome, matricula, idade, salario);
        this.horas = horas;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public void setSalario(double salario) {
        this.salario = salario * horas;
    }

}
