package locadora;
import locadora.Automovel;
import locadora.Client;


public class Locacao {
  public int locacao_cod;
  public int auto_cod;
  public int cliente_cod;
  public int locacao_km;
  public int dt_cadastro;

  
  public int getlocacao_cod() { return locacao_cod; }
  public int getAuto_cod() { return auto_cod; }
  public int getClient_cod() { return cliente_cod; }
  public int gelLocacao_km() { return locacao_km; }
  public int getDt_cadastro() { return dt_cadastro; }

  public void setlocacao_cod( int locacao_cod ) {};
  public void setAuto_cod( int auto_cod ) {};
  public void setClient_cod( int cliente_cod ) {};
  public void setLocacao_km( int locacao_km ) {};
  public void setdt_cadastro( int dt_cadastro ) {};

}
