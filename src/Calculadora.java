import javax.swing.*;

public class Calculadora {
    public static void main(String[] args) {
        String calculadora;

        calculadora = JOptionPane.showInputDialog("Qual operação você quer fazer?\n 1-adição\n 2-subtração\n 3-multiplicação\n 4-divisão");
        if (calculadora.equals("1") || calculadora.equals("adição")){
            String x;
            String y;
            Double soma;
            x = JOptionPane.showInputDialog("Digite o primeiro numero para a soma.");
            y = JOptionPane.showInputDialog("Digite o segundo numero para a soma");
            soma = Double.parseDouble(x) + Double.parseDouble(y);
            JOptionPane.showMessageDialog(null,"Resultado = " + soma);
        } else if (calculadora.equals("2") || calculadora.equals("subtração")) {
            String x;
            String y;
            Double soma;
            x = JOptionPane.showInputDialog("Digite o primeiro numero para a subtração.");
            y = JOptionPane.showInputDialog("Digite o segundo numero para a subtração");
            soma = Double.parseDouble(x) - Double.parseDouble(y);
            JOptionPane.showMessageDialog(null,"Resultado = " + soma);
        } else if (calculadora.equals("3") || calculadora.equals("multiplicação")) {
            String x;
            String y;
            Double soma;
            x = JOptionPane.showInputDialog("Digite o primeiro número para ser multiplicado.");
            y = JOptionPane.showInputDialog("Digite o segundo número para ser multiplicado");
            soma = Double.parseDouble(x) * Double.parseDouble(y);
            JOptionPane.showMessageDialog(null,"Resultado = " + soma);
        }
        else if (calculadora.equals("4") || calculadora.equals("divisão")) {
            String x;
            String y;
            Double soma;
            x = JOptionPane.showInputDialog("Digite o valor para ser dividido.");
            y = JOptionPane.showInputDialog("Digite o valor que irá dividir");
            soma = Double.parseDouble(x) / Double.parseDouble(y);
            JOptionPane.showMessageDialog(null,"Resultado = " + soma);
        } else
            JOptionPane.showMessageDialog(null,"Opção inválida, por favor escolha um número de 1 a 4");
        JOptionPane.showMessageDialog(null,"Programa finalizado!");

    }
}