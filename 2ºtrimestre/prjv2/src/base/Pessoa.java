package base;
public class Pessoa {
protected int id;
protected String nome, nomefantasia, logradouro, numero, complemento, bairro, cep, cidade, uf;
public Pessoa(int id, String nome, String nomefantasia, String numero, String complemento, String bairro, String cep,
String cidade, String uf, String uf2) {
super();
this.id = id;
this.nome = nome;
this.nomefantasia = nomefantasia;
this.logradouro = logradouro;
this.numero = numero;
this.complemento = complemento;
this.bairro = bairro;
this.cep = cep;
this.cidade = cidade;
this.uf = uf;
}
public int getID() {
return id;
}

public void setId(int id) {
this.id = id;
}

public String getNome() {
return nome;
}

public void setNome(String nome) {
this.nome = nome;
}

public String getNomeFantasia() {
return nomefantasia;
}

public void setNomeFantasia(String nomefantasia) {
this.nomefantasia = nomefantasia;
}

public String getLogradouro() {
return logradouro;
}

public void setLogradouro(String logradouro) {
this.logradouro = logradouro;
}

public String getNumero() {
return numero;
}

public void setNumero(String numero) {
this.numero = numero;
}

public String getComplemento() {
return complemento;
}

public void setComplemendo(String complemento) {
this.complemento = complemento;
}

public String getBairro() {
return bairro;
}

public void setBairro(String bairro) {
this.bairro = bairro;
}

public String getCep() {
return cep;
}

public void setCep(String cep) {
this.cep = cep;
}

public String getCidade() {
return cidade;
}

public void setCidade(String cidade) {
this.cidade = cidade;
}

public String getUf() {
return uf;
}

public void setUf(String uf) {
this.uf = uf;
}

}
