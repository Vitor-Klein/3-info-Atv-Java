package faculdade;

public class Professor40Hr extends Professor{
    public Profesor40Hr(String nome, String matricula, int idade, double salario) {
        super(nome, matricula, idade, salario);
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
