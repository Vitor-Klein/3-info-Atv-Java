package faculdade;

public class Professor{
    String nome, matricula;
    int idade;
    double salario;

    public Profesor(String nome, String matricula, int idade, double salario) {
        super();
        this.nome = nome;
        this.matricula = matricula;
        this.idade = idade;
        this.salario = salario;

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }
}
