public class Automovel {
  private int Id;
  private String Chassi;
  private String Marca;
  private int Ano;
  private String Cor;
  private String Modelo;
  private String Descrição;

  public Automovel(int Id, String Chassi, String Marca, int Ano, String Cor, String Modelo, String Descrição){
    super();
    this.Id = Id;
    this.Chassi = Chassi;
    this.Marca = Marca;
    this.Ano = Ano;
    this.Cor = Cor;
    this.Modelo = Modelo;
    this.Descrição = Descrição;
  }

  public int getId() {
		return Id;
	}
	public void setId(int Id) {
		this.Id = Id;
	}

  public String getChassi() {
    return Chassi;
  }
  public void setChassi(String Chassi) {
    this.Chassi = Chassi;
  }

  public String getMarca() {
    return Marca;
  }
  public void setMarca(String Marca) {
    this.Marca = Marca;
  }

  public int getAno() {
    return Ano;
  }
  public void setAno(int Ano) {
    this.Ano = Ano;
  }

  public String getCor() {
    return Cor;
  }
  public void setCor(String Cor) {
    this.Cor = Cor;
  }  
  
  public String getModelo() {
    return Modelo;
  }
  public void setModelo(String Modelo) {
    this.Modelo = Modelo;
  }  
  
  public String getDescrição() {
    return Descrição;
  }
  public void setDescrição(String Descrição) {
    this.Descrição = Descrição;
  }

}
