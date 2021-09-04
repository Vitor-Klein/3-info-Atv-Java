package base;

public class Producao{
  private String Lote,Produto,Q_produzida,Custo, data_entrega;
  public Producao(String Lote, String Produto ,String Q_produzida,String Custo, String data_entrega){
    super();
    this.Lote = Lote;
    this.Produto=Produto;
    this.Q_produzida=Q_produzida;
    this.Custo=Custo;
    this.data_entrega=data_entrega;
  }

  public String getLote() {
    return Lote;
   }
   
   public void setLote(String Lote) {
    this.Lote = Lote;
   }

   public String getProduto() {
    return Produto;
   }
   
   public void setProduto(String Produto) {
    this.Produto = Produto;
   }

   public String getQ_produzida() {
    return Q_produzida;
   }
   
   public void setQ_produzida(String Q_produzida) {
    this.Q_produzida = Q_produzida;
   }

   public String getCusto() {
    return Custo;
   }
   
   public void setCusto(String Custo) {
    this.Custo = Custo;
   }

   public String getdata_entrega() {
    return data_entrega;
   }
   
   public void setdata_entrega(String data_entrega) {
    this.data_entrega = data_entrega;
   }

}
