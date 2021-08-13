abstract class Funcionario {
  private int codigo;
  private String Nome;
  private String Cargo;
  private int salarioBase;
  private int salarioLiquido;
  private int descontos;
  private String endereço;

  public abstract double CalcularSalario();


  public Funcionario(int codigo,String Nome,String Cargo,int salarioBase,int salarioLiquido,int descontos,String endereço){
    super();
    this.codigo = codigo;
    this.Nome = Nome;
    this.Cargo = Cargo;
    this.salarioBase = salarioBase;
    this.salarioLiquido = salarioLiquido;
    this.descontos = descontos;
    this.endereço = endereço;
  }

  public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

  public String getNome() {
    return Nome;
  }
  public void setNome(String Nome) {
    this.Nome = Nome;
  }

  public String getCargo() {
    return Cargo;
  }
  public void setCargo(String Cargo) {
    this.Cargo = Cargo;
  }

  public int getSalarioBase() {
    return salarioBase;
  }
  public void setSalarioBase(int salarioBase) {
    this.salarioBase = salarioBase;
  }

  public int getSalarioLiquido() {
    return salarioLiquido;
  }
  public void setSalarioLiquido(int salarioLiquido) {
    this.salarioLiquido = salarioLiquido;
  }  
  
  public int getDescontos() {
    return descontos;
  }
  public void setDescontos(int descontos) {
    this.descontos = descontos;
  }  
  
  public String getEndereço() {
    return endereço;
  }
  public void setEndereço(String endereço) {
    this.endereço = endereço;
  }

}

