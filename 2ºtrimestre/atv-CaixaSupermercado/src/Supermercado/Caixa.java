package Supermercado;

public class Caixa {

	private double numeroCaixa;
	private double abreCaixa, valorTotal, FechaCaixa; 
	
	public Caixa(double numeroCaixa, double abreCaixa,  double valorTotal) {
		super();
		this.numeroCaixa = numeroCaixa;
		this.abreCaixa = abreCaixa;
		
		this.valorTotal = valorTotal;
	}
	public double getNumeroCaixa() {
		return numeroCaixa;
	}
	public void setNumeroCaixa(double numeroCaixa) {
		this.numeroCaixa = numeroCaixa;
	}
	public double getAbreCaixa() {
		return abreCaixa;
	}
	public void setAbreCaixa(double abreCaixa) {
		this.abreCaixa = abreCaixa;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

  public double getFechaCaixa() {
		return FechaCaixa;
	}
	public void setFechaCaixa(double FechaCaixa) {
		this.FechaCaixa = FechaCaixa;
	}
	
}
