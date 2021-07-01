package Supermercado;


public class Supermercado extends Caixa {
	
	int contador;
  int caixa[] = new int[10];
	
	//criar o construtor com vetor de caixa e 
	//contador que recebe 0.

	public void adicionaCaixa(Caixa  c) {
    contador = 0;

    for(int i=0; i< 10; i++) {
      caixa[i] = caixa[i] +1;
      System.out.println(i+"º valor é: "+caixa[i]);
    }
	}
}
