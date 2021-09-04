package base;

public class MPProduto extends Produto{
  private String produto,MateriaPrima;
  public MPProduto(String produto, String MateriaPrima){
    super(produto, MateriaPrima);
    this.produto = produto;
    this.MateriaPrima=MateriaPrima;
  }

  public String getproduto() {
    return produto;
   }
   
   public void setproduto(String produto) {
    this.produto = produto;
   }

   public String getMateriaPrima() {
    return MateriaPrima;
   }
   
   public void setMateriaPrima(String MateriaPrima) {
    this.MateriaPrima = MateriaPrima;
   }
}
