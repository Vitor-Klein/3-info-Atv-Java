package appagenda;

import java.util.ArrayList;

public class Agenda {
  private ArrayList<ContatoBasico> contatos;

  Agenda() {
    contatos = new ArrayList();
  }

  public void inserir(ContatoBasico w) {
    contatos.add(w);
  }

  public ContatoBasicobuscar(String nome) {
    for (int i = 0; i < contatos.size(); i++) {
      ContatoBasico w = contatos.get(i);
      if (w.getNome().equalsIgnoreCase(nome))
        return contatos.get(i);
    }
    return null;
  }

  public ContatoBasicobuscar(int pos)
    {   if(pos>=0 &&pos<contatos.size())
        {   returncontatos.get(pos);
        }
        return null;
    }

  public EContatobuscarEmail(String email)
    {   for(int i=0;i<contatos.size();i++)
        {   if(contatos.get(i) instanceofEContato)
            {
              EContato w=(EContato)contatos.get(i);
              if(w.getEmail().equalsIgnoreCase(email))
              return (EContato)contatos.get(i);
            }
        }
        return null;
    }

  public Contato[]

  buscarGeral(String palavraChave)
    {   ArrayList<ContatoBasico>todos=new ArrayList();
         for(int i=0;i<contatos.size();i++)
          {   ContatoBasico w=contatos.get(i);
               if(w.getDados().contains(palavraChave))
                 todos.add(w);
           }
           Contato[] vet=new Contato[todos.size()];

            return (todos.toArray(vet));
     }

  public Contato[]

  buscarTodos()
    {   Contato[] vet=new Contato[contatos.size()];

         return (contatos.toArray(vet));
    }

  public intgetQuantidade() {
    returncontatos.size();
  }
}
