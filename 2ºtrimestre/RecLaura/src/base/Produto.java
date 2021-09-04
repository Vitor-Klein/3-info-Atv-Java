package base;

public class Produto {
  private String ID_produto,nome,tamanho,cor,valor;
  public Produto(String ID_produto, String nome ,String tamanho, String cor, String valor){
    super(ID_produto,nome,tamanho,cor,valor);
    this.ID_produto = ID_produto;
    this.nome=nome;
    this.tamanho=tamanho;
    this.cor=cor;
    this.valor=valor;
  }

  public String getID_produto() {
    return ID_produto;
   }
   
   public void setID_produto(String ID_produto) {
    this.ID_produto = ID_produto;
   }

   public String getnome() {
    return nome;
   }
   
   public void setnome(String nome) {
    this.nome = nome;
   }
   public String gettamanho() {
    return tamanho;
   }
   
   public void settamanho(String tamanho) {
    this.tamanho = tamanho;
   }

   public String getcor() {
    return cor;
   }
   
   public void setcor(String cor) {
    this.cor = cor;
   }
   public String getvalor() {
    return valor;
   }
   
   public void setvalor(String valor) {
    this.valor = valor;
   }
}
