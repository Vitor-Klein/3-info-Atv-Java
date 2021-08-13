public class ComissionadoTemporario extends Funcionario{
  public ComissionadoTemporario(int codigo,String Nome,String Cargo,int salarioBase,int salarioLiquido,int descontos,String endereço){
    super(codigo,Nome,Cargo,salarioBase,salarioLiquido,descontos,endereço);
  }
   public int CalcularSalario(int salarioBase,int salarioLiquido){
    CalcularSalario(100,2000);
    double percentualReajuste = (100 + 2000 *1.5)/100;

   }
}