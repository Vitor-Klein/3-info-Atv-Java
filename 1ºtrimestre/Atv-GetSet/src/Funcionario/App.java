package Funcionario;

public class App {
    public static void main(String[] args) {
    Funcionario a = new Funcionario();
    a.setMatricula(3412343);
    a.setNome("Ana");
    a.setSalario(2500);
    a.setDepartamento("chefe");
    a.setRg(121312312);
    a.setCpf(5452354);


    System.out.println("nome:"+a.getNome());
    System.out.println("Matricula:"+a.getMatricula());
    System.out.println("Salario:"+a.getSalario());
    System.out.println("Departamento:"+a.getDepartamento());
    System.out.println("Rg:"+a.getRg());
    System.out.println("Cpf:"+a.getCpf());
    
}

}