package base;
public class Usuario extends Colaborador{
private String login, senha, permissao;
public Usuario(int id, String nome, String nomefantasia, String logradouro, String numero, String complemento, String bairro, String cep, String cidade, String uf) {
super(id, nome, nomefantasia, logradouro, numero, complemento, bairro,cep,cidade,uf);
this.login = login;
this.senha=senha;
this.permissao=permissao;
}

public String getLogin() {
return login;
}
public void setLogin(String login) {
this.login = login;
}
public String getSenha() {
return senha;
}
public void setSenha(String senha) {
this.senha = senha;
}
public String getPermissao() {
return permissao;
}
public void setPermissao(String permissao) {
this.permissao = permissao;
}

}
