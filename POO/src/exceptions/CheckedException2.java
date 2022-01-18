package exceptions;

import javax.swing.*;
import java.io.*;

public class CheckedException2 {
    public static void main(String[] args) {
        int[] numerador = {4,5,5,7};
        int[] denominador = {2,4,0,6,7};

        for(int i = 0; i < denominador.length; i++){
            try{
                if (numerador[i] % 2 != 0) throw new DivisaoNaoExataException("Divisão inválida!", numerador[i], denominador[i]);

                int resultado = numerador[i] / denominador[i];
                System.out.println(resultado);
            }catch (DivisaoNaoExataException e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, e.getMessage());
            }

        }
        System.out.println("O programa continua...");
    }
}
