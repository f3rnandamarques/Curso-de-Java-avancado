package arrays;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos alunos ?");
        int quantidadeAlunos = scanner.nextInt();

        System.out.println("Quanta notas por aluno? ");
        int quantidadeNotas = scanner.nextInt();

        double [] [] notasDaTurma = new double[quantidadeAlunos][quantidadeNotas];

        double total = 0;
        for (int a = 0; a < notasDaTurma.length; a++) {
            for(int n = 0; n < notasDaTurma[a].length; n++) {

                System.out.printf("Informe a nota %d do aluno %d: " + n + 1, a + 1);
                notasDaTurma [a] [n] = scanner.nextDouble();
                total += notasDaTurma [a] [n];
            }
        }
        double media = total / (quantidadeAlunos * quantidadeNotas);
        System.out.println("Média da turma é " + media);

        scanner.close();
    }
}
