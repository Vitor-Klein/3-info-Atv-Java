package base;
public class Colaborador extends Fisica {
private String ctps, pis, tituloEleitor, estadoCivil, setor, cargo, telefone1, telefone2, emailPessoal,
emailCorporativo;
private boolean reservista, ativo;
private int numDependentes;
private float salario;
public Colaborador(int id, String nome, String nomeFatasia, String logradouro, String numero, String complemento,
 String bairro, String cep, String cidade, String uf) {
 super(id, nome, nomeFatasia, logradouro, numero, complemento, bairro, cep, cidade, uf);
 this.ctps = ctps;
 this.pis = pis;
 this.tituloEleitor = tituloEleitor;
 this.tituloEleitor = tituloEleitor;
 this.reservista = reservista;
 this.estadoCivil = estadoCivil;
 this.estadoCivil = estadoCivil;
 this.numDependentes = numDependentes;
 this.ativo = ativo;
 this.setor = setor;
 this.cargo = cargo;
 this.salario = salario;
 this.telefone1 = telefone1;
 this.telefone2 = telefone2;
 this.emailPessoal = emailPessoal;
 this.emailCorporativo = emailCorporativo;

}

public String getCtps() {
 return ctps;
}

public void setCtps(String ctps) {
 this.ctps = ctps;
}

public String getPis() {
 return pis;
}

public void setPis(String pis) {
 this.pis = pis;
}

public String getTituloEleitor() {
 return tituloEleitor;
}

public void setTituloEleitor(String tituloEleitor) {
 this.tituloEleitor = tituloEleitor;
}

public String getEstadoCivil() {
 return estadoCivil;
}

public void setEstadoCivil(String estadoCivil) {
 this.estadoCivil = estadoCivil;
}

public String getSetor() {
 return setor;
}

public void setSetor(String setor) {
 this.setor = setor;
}

public String getCargo() {
 return cargo;
}

public void setCargo(String cargo) {
 this.cargo = cargo;
}

public String getTelefone1() {
 return telefone1;
}

public void setTelefone1(String telefone1) {
 this.telefone1 = telefone1;
}

public String getTelefone2() {
 return telefone2;
}

public void setTelefone2(String telefone2) {
 this.telefone2 = telefone2;
}

public String getEmailPessoal() {
 return emailPessoal;
}

public void setEmailPessoal(String emailPessoal) {
 this.emailPessoal = emailPessoal;
}

public String getEmailCorporativo() {
 return emailCorporativo;
}

public void setEmailCorporativo(String emailCorporativo) {
 this.emailCorporativo = emailCorporativo;
}

public boolean isReservista() {
 return reservista;
}

public void setReservista(boolean reservista) {
 this.reservista = reservista;
}

public boolean isAtivo() {
 return ativo;
}

public void setAtivo(boolean ativo) {
 this.ativo = ativo;
}

public int getNumDependentes() {
 return numDependentes;
}

public void setNumDependentes(int numDependentes) {
 this.numDependentes = numDependentes;
}

public float getSalario() {
 return salario;
}

public void setSalario(float salario) {
 this.salario = salario;
}

}
