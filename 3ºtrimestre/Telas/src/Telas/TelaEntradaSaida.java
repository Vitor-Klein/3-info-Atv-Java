package Telas;

import javax.swing.JOptionPane;

public class TelaEntradaSaida {
  public static void main(String[] args) {
    String numero = JOptionPane.showInputDialog("Fala um numero seu gay");

    JOptionPane.showMessageDialog(null, "voce digitou: " + numero + "seu gay");
    JOptionPane.showMessageDialog(null, "Escolha um","valor",JOptionPane.YES_NO_CANCEL_OPTION);
  }
}
