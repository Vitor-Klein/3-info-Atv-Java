import javax.swing.JOptionPane;

public class App {
	public static void main(String[] args) {
		int vet[]; 
		vet = new int[12];
		int soma=0;
		for(int i=0; i<12 ;i++) {
			vet[i]=Integer.parseInt(JOptionPane.showInputDialog("Informar um Numero"));
		}
		
		for(int a=0; a<12;a++) {
			System.out.println("Posicao " + a+
			" valor na posicao:" +vet[a]);
		}
		for(int c=0; c<vet.length; c++) {
			soma =  soma + vet[c];
		}

		int multi = 0;
		for(int m=0; m<vet.length; m++) {
			multi = multi * vet[m];
		}

		int med = 0;
		for(int i = 0; i < vet.length; i++){
            med = (med + vet[i])/12;
            
        }
        System.out.println("soma = " + soma);
        System.out.println("multiplicação = " +multi);
        System.out.println("media = " + med);		
		
	}
}