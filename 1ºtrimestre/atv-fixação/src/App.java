import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
		double firstNumber, secondNumber;
		double soma, sub, div, mult;
		
		System.out.println("Insira o primeiro valor: ");
		firstNumber = sc.nextDouble();
		System.out.println("Insira o segundo valor: ");
		secondNumber = sc.nextDouble();
		
		soma=firstNumber+secondNumber;
		sub=firstNumber-secondNumber;
		div=firstNumber/secondNumber;
		mult=firstNumber*secondNumber;
		
		System.out.println("Adição dos valores: " +soma);
		System.out.println("Subtração dos valores: "+sub);
		System.out.println("Divisão dos valores: "+div);
		System.out.println("Multiplicação dos valores: "+mult);
    }
}
