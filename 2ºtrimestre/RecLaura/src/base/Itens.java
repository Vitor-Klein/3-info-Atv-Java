package base;

public class Itens extends Pedido{
  private String produto,pedido;
  public Itens(String produto, String pedido ,String ID_pedido){
    super(produto, pedido, ID_pedido);
    this.produto = produto;
    this.pedido=pedido;
  }

  public String getproduto() {
    return produto;
   }
   
   public void setproduto(String produto) {
    this.produto = produto;
   }

   public String getpedido() {
    return pedido;
   }
   
   public void setpedido(String pedido) {
    this.pedido = pedido;
   }
}
