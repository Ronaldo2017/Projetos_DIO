package exceptions;

import javax.swing.*;

public class UncheckedException {
    public static void main(String[] args) {
        boolean continueLooping = true;

        do{
            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");

            try {
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("Resultado: " + resultado);
                continueLooping = false;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite somente números inteiros! " + e.getMessage());
                //e.printStackTrace();
            }catch (ArithmeticException e){
                JOptionPane.showMessageDialog(null, "Divisão por 0 inválida! ");
            }
            finally {
                System.out.println("Chegou no finally!");
            }
        }while (continueLooping);

        System.out.println("O código continua...");
    }

    public static int dividir(int a, int b) {
        return a / b;
    }
}
