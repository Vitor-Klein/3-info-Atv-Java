package appagenda;

import java.util.GregorianCalendar;

public class Main {
  static void mostraDados(ContatoBasicoobj)
    {  System.out.println(obj.getDados());
        if(objinstanceofContato)
          System.out.println(((Contato)obj).getIdade());
    }

  public static void main(String[] args) {
    Agenda a;
    a = new Agenda();

    Contato cb;
    cb = new Contato("Teste", newGregorianCalendar(1980, 10, 28));
    cb.setTelefone(new Telefone("32343333-234234", "Telefone residencial"));
    cb.setTelefone(new Telefone("99123411-12432", "Telefone celular"));
    a.inserir(cb);

    ContatoComercial cc;
    cc = new ContatoComercial("Lanchonete", "Lanches", "Lanchão");
    cc.setTelefone(new Telefone("23432-23423", "Telefone residencial"));
    a.inserir(cc);

    a.inserir(new EContato("Exemplo", newGregorianCalendar(1975, 2, 22), "exemplo12@gmail.com", "www.exemplo12.com.br"));

    ContatoBasicoobj = a.buscar("Teste");

    if (obj != null)
      mostraDados(obj);
    else System.out.println("Contato nao encontrado!");
  }
}
