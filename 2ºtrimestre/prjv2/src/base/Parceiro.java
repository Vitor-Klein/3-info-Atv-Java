package base;
public class Parceiro extends Pessoa {
private String tipoPessoa, desempenho;
public Parceiro(int id, String nome, String nomefantasia, String logradouro, String numero, String complemento, String bairro, String cep, String cidade, String uf) {
super(id, nome, nomefantasia, logradouro, numero, complemento, bairro,cep,cidade,uf);
this.tipoPessoa = tipoPessoa;
this.desempenho=desempenho;
}

public String getTipoPessoa() {
return tipoPessoa;
}

public void setTipoPessoa(String tipoPessoa) {
this.tipoPessoa = tipoPessoa;
}

public String getDesempenho() {
return desempenho;
}

public void setDesempenho(String desempenho) {
this.desempenho = desempenho;
}
}
