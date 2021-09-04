package base;

public class Fornecedor extends MPFormecedor {
  private String ID_Forn,endereco,nome,CNPJ, Telefone, Razão_Social;
  public Fornecedor(String ID_Forn,String Telefone,String Razão_Social,String nome,String CNPJ, String endereco){
    super(ID_Forn, Telefone, endereco, Razão_Social, CNPJ);
    this.ID_Forn = ID_Forn;
    this.endereco=endereco;
    this.nome=nome;
    this.CNPJ=CNPJ;
    this.Telefone = Telefone;
    this.Razão_Social = Razão_Social;
  }

  public String getTelefone() {
    return Telefone;
   }
   
   public void setTelefone(String Telefone) {
    this.Telefone = Telefone;
   }

   public String getRazão_Social() {
    return Razão_Social;
   }
   
   public void setRazão_Social(String Razão_Social) {
    this.Razão_Social = Razão_Social;
   }

  public String getID_Forn() {
    return ID_Forn;
   }
   
   public void setID_Forn(String ID_Forn) {
    this.ID_Forn = ID_Forn;
   }

   public String getendereco() {
    return endereco;
   }
   
   public void setendereco(String endereco) {
    this.endereco = endereco;
   }

   public String getnome() {
    return nome;
   }
   
   public void setnome(String nome) {
    this.nome = nome;
   }

   public String getCNPJ() {
    return CNPJ;
   }
   
   public void setCNPJ(String CNPJ) {
    this.CNPJ = CNPJ;
   }

}

