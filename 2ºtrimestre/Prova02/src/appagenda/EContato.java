package appagenda;

import java.util.Calendar;

public class EContato extends Contato {
  protected String email, homepage;

  public EContato(String nome, Calendar dataNacimento, String email, String HomePage) {
    super(nome, dataNacimento);
    this.email = email;
    homepage = HomePage;
  }

  @Override
  public String getDados() {
    return super.getDados() + "email: " + email + "homepage:" + homepage + "Idade: ";
  }
  public String getEmail() {
    return email;
  }
  public String getHomepage() {
    return homepage;
  }
}