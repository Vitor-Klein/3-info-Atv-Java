package base;
public class Juridica extends Pessoa {
private String cnpj, inscricaoEstadual, fundacao;
public Juridica(int id, String nome, String nomefantasia, String logradouro, String numero, String complemento, String bairro, String cep, String cidade, String uf) {
super(id, nome, nomefantasia, logradouro, numero, complemento, bairro,cep,cidade,uf);
this.cnpj = cnpj;
this.inscricaoEstadual=inscricaoEstadual;
this.fundacao=fundacao;
}
public String getCnpj() {
return cnpj;
}

public void setCnpj(String cnpj) {
this.cnpj = cnpj;
}

public String get() {
return inscricaoEstadual;
}

public void setInscricaoEstadual(String inscricaoEstadual) {
this.inscricaoEstadual = inscricaoEstadual;
}

public String getFundacao() {
return fundacao;
}

public void set(String fundacao) {
this.fundacao = fundacao;
}

}