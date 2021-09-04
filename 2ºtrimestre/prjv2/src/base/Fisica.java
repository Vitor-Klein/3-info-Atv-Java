package base;
public class Fisica extends Pessoa {
private String cpf, rg, genero, nasc;
public Fisica(int id, String nome, String nomefantasia, String logradouro, String numero, String complemento, String bairro, String cep, String cidade, String uf) {
super(id, nome, nomefantasia, logradouro, numero, complemento, bairro,cep,cidade,uf);
this.cpf = cpf;
this.rg=rg;
this.genero=genero;
this.nasc=nasc;
}

public String getCpf() {
return cpf;
}

public void setCpf(String cpf) {
this.cpf = cpf;
}

public String getRg() {
return rg;
}

public void setRg(String rg) {
this.rg = rg;
}

public String getGenero() {
return genero;
}

public void setGenero(String genero) {
this.genero = genero;
}

public String getNasc() {
return nasc;
}

public void setNasc(String nasc) {
this.nasc = nasc;
}

}
