package base;

public class Pedido extends Cliente {
  private String ID_pedido,data,pagamento,entrega;
  public Pedido(String Endereço,String Telefone, String Nome,String Ramo,String Razão_Social,String CNPJ,String NomeFantasia, String ID, String ID_pedido,String data,String pagamento,String entrega){
    super(Endereço, Telefone, Nome, Ramo, Razão_Social, CNPJ, NomeFantasia, ID);
    this.ID_pedido = ID_pedido;
    this.data=data;
    this.pagamento=pagamento;
    this.entrega=entrega;
  }

  public String getID_pedido() {
    return ID_pedido;
   }
   
   public void setID_pedido(String ID_pedido) {
    this.ID_pedido = ID_pedido;
   }

   public String getdata() {
    return data;
   }
   
   public void setdata(String data) {
    this.data = data;
   }

   public String getpagamento() {
    return pagamento;
   }
   
   public void setpagamento(String pagamento) {
    this.pagamento = pagamento;
   }

   public String getentrega() {
    return entrega;
   }
   
   public void setentrega(String entrega) {
    this.entrega = entrega;
   }

}
