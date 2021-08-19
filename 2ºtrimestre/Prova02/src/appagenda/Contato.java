package appagenda;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Contato extends ContatoBasico {
  protected Calendar dataNacimento;

  publicContato(String nome, Calendar dataNacimento)
    {   super(nome);
         this.dataNacimento = dataNacimento;
    }

  @Override
     public String getDados()
     { return super.getDados()+"Nascido em "+
        dataNacimento.get(Calendar.DATE)+"/"+
        dataNacimento.get(Calendar.MONTH) + "/"+
        dataNacimento.get(Calendar.YEAR) + "Idade: ";
    }

  public intgetIdade()
    {   Calendar hoje=new GregorianCalendar();
          intidade = hoje.get(Calendar.YEAR)-dataNacimento.get(Calendar.YEAR);
          hoje.set(Calendar.YEAR, dataNacimento.get(Calendar.YEAR));
          if(hoje.before(dataNacimento))
            idade--;
            return idade;

    }
}
