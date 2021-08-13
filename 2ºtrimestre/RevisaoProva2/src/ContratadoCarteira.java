public class ContratadoCarteira extends Funcionario{
  public ContratadoCarteira(int codigo,String Nome,String Cargo,int salarioBase,int salarioLiquido,int descontos,String endereço){
    super(codigo,Nome,Cargo,salarioBase,salarioLiquido,descontos,endereço);
  }
  double percentualReajuste = salarioBase + (salarioLiquido * 3)/100;
   public double CalcularSalario(percentualReajuste);
}


