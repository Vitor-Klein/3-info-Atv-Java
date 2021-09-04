package base;

public class Estoque extends Produto{
  private String produto,estoque;
  public Estoque(String produto, String estoque){
    super(produto, estoque);
    this.produto = produto;
    this.estoque=estoque;
  }

  public String getproduto() {
    return produto;
   }
   
   public void setproduto(String produto) {
    this.produto = produto;
   }

   public String getestoque() {
    return estoque;
   }
   
   public void setestoque(String estoque) {
    this.estoque = estoque;
   }
}
