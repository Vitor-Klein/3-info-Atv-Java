public class ContratadoCarteira extends Funcionario{
  public ContratadoCarteira(int codigo,String Nome,String Cargo,int salarioBase,int salarioLiquido,int descontos,String endereço){
    super(codigo,Nome,Cargo,salarioBase,salarioLiquido,descontos,endereço);
  }
   public int CalcularSalario(int salarioBase,int salarioLiquido){
    CalcularSalario(2000,3000);
    double percentualReajuste = (2000 + 3000 *3)/100;
   }
}


