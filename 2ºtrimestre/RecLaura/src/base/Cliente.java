package base;

public class Cliente {
  private String Endereço, Telefone, Nome, Ramo, Razão_Social, CNPJ, NomeFantasia, ID;
public Cliente(int id, String nome, String nomeFatasia, String logradouro, String numero, String complemento,
 String bairro, String cep, String cidade, String uf) {
   super();
 this.Endereço = Endereço;
 this.Telefone = Telefone;
 this.Razão_Social = Razão_Social;
 this.Nome = Nome;
 this.Nome = Nome;
 this.Ramo = Ramo;
 this.Ramo = Ramo;
 this.CNPJ = CNPJ;
 this.NomeFantasia = NomeFantasia;
 this.ID = ID;

}

public String getEndereço() {
 return Endereço;
}

public void setEndereço(String Endereço) {
 this.Endereço = Endereço;
}

public String getTelefone() {
 return Telefone;
}

public void setTelefone(String Telefone) {
 this.Telefone = Telefone;
}

public String getNome() {
 return Nome;
}

public void setNome(String Nome) {
 this.Nome = Nome;
}

public String getRamo() {
 return Ramo;
}

public void setRamo(String Ramo) {
 this.Ramo = Ramo;
}

public String getRazão_Social() {
 return Razão_Social;
}

public void setRazão_Social(String Razão_Social) {
 this.Razão_Social = Razão_Social;
}

public String getCNPJ() {
 return CNPJ;
}

public void setCNPJ(String CNPJ) {
 this.CNPJ = CNPJ;
}

public String getNomeFantasia() {
 return NomeFantasia;
}

public void setNomeFantasia(String NomeFantasia) {
 this.NomeFantasia = NomeFantasia;
}

public String getID() {
 return ID;
}

public void setID(String ID) {
 this.ID = ID;
}
}
