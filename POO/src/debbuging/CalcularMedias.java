package debbuging;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class CalcularMedias {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] alunos = {"Camila", "Ronaldo", "João", "lara"};

        double media =  calcularMediaTurma(alunos, scan);

        System.out.println("Média da turma: " + media);
    }

    public static double calcularMediaTurma(String[] alunos, Scanner scanner){
        int soma = 0;
        for (String aluno : alunos) {
            System.out.println("Nota do aluno: " + aluno);
            double nota = scanner.nextDouble();
            soma += nota;

        }
        return soma / alunos.length;
    }
}
