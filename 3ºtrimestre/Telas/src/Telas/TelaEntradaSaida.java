package Telas;

import javax.swing.JOptionPane;


public class TelaEntradaSaida {
  public static void main(String[] args) {
    // String numero = JOptionPane.showInputDialog("Fala um numero seu gay");

    // JOptionPane.showMessageDialog(null, "voce digitou: " + numero + "seu gay");
    // JOptionPane.showConfirmDialog(null, "Escolha um","valor",JOptionPane.YES_NO_CANCEL_OPTION);
    // JOptionPane.showMessageDialog(null, "Aula de java", "JAvA", JOptionPane.WARNING_MESSAGE);
    
    Object[] opcao = {"ok", "Cancelar", "Confirma"};
    JOptionPane.showOptionDialog(null, 
    "Clique em ok", 
    "Avisos", 
    JOptionPane.DEFAULT_OPTION, 
    JOptionPane.WARNING_MESSAGE, 
    null, 
    args, 
    opcao[0]);
  }
}
