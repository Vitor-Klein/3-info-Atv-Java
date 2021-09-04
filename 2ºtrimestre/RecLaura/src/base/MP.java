package base;

public class MP{
  private String ID_Mp,nome,descricao,quant;
  public MP(String ID_Mp, String nome ,String descricao,String quant){
    super();
    this.ID_Mp = ID_Mp;
    this.nome=nome;
    this.descricao=descricao;
    this.quant=quant;
  }

  public String getID_Mp() {
    return ID_Mp;
   }
   
   public void setID_Mp(String ID_Mp) {
    this.ID_Mp = ID_Mp;
   }

   public String getnome() {
    return nome;
   }
   
   public void setnome(String nome) {
    this.nome = nome;
   }

   public String getdescricao() {
    return descricao;
   }
   
   public void setdescricao(String descricao) {
    this.descricao = descricao;
   }

   public String getquant() {
    return quant;
   }
   
   public void setquant(String quant) {
    this.quant = quant;
   }
}
