package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {

        System.out.println("Olá!");
        System.out.println("Quantas notas você deseja calcular?");

        Scanner scanner = new Scanner(System.in);
        int quantidadeDeNotas = scanner.nextInt();
        double [] notas = new double[quantidadeDeNotas]; //Criando o array com o tamanho especificado
        double total = 0;

        System.out.println(Arrays.toString(notas));
        for(int i = 0; i < quantidadeDeNotas; i++) {
            System.out.println("Informe a nota nº" + i+": ");
            double notaInserida = scanner.nextDouble();
            notas[i] = notaInserida;
        };
        System.out.println(Arrays.toString(notas));

        for(int i = 0; i < notas.length; i++) {
        total = total + notas[i]; // Mesma coisa que total += notas[i];
        }

        System.out.println("A media do aluno é de: " + total / quantidadeDeNotas);

        scanner.close();
    }
}
