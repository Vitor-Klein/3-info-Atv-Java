package Supermercado;

public class Caixa {

	private int numeroCaixa;
	private double abreCaixa, valorTotal; 
	
	public void abreCaixa(double valor) {
		//valor de abertura que vcs vao passar
	}
	public void registraMovimento (double valor) {
		this.valorTotal += valor;
	}
	
	public double FechaCaixa() {
		//codigo para verificar o valor total recebido do caixa
		return 0.0;
	}
	
}
