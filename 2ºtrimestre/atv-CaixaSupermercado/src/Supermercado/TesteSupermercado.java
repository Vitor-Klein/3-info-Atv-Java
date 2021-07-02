package Supermercado;

public class TesteSupermercado {
	public static void main(String[] args) {
		Caixa e1 = new Caixa(4247764, 8, 0);
		Supermercado c1 = new Supermercado();
		Supermercado c2 = new Supermercado();

		c1.adicionaCaixa(e1);
		e1.movimentaCaixa(20.10);
		e1.movimentaCaixa(2.60);
		e1.movimentaCaixa(5);
		e1.movimentaCaixa(5.70);
		System.out.println(e1.getValorTotal());

		Caixa e2 = new Caixa(456456456, 8, 0);
		c2.adicionaCaixa(e2);
		e2.movimentaCaixa(30.4);
		e2.movimentaCaixa(15.2);
		e2.movimentaCaixa(4.20);
		e2.movimentaCaixa(5.10);
		System.out.println(e2.getValorTotal());

	}
}