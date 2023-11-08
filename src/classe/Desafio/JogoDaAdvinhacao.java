package classe.Desafio;

import java.util.Random;
import java.util.Scanner;

public class JogoDaAdvinhacao {
    //Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100.
    // Armazene um numero aleatório em uma variável.
    // O Jogador tem 10 tentativas para adivinhar o número gerado.
    // Ao final de cada tentativa, imprima a quantidade de tentativas restantes,
    // e imprima se o número inserido é maior ou menor do que o número armazenado.

    public static void main(String[] args) {
        System.out.println("Bem vindo ao jogo da adivinhação!");


        Scanner entrada = new Scanner(System.in);
        Random random = new Random();
        int numeroAleatorio = random.nextInt(101); // Número aleatório entre 0 e 100
        int tentativasRestantes = 10;

        while (tentativasRestantes > 0) {
            System.out.println("Tentativas restantes: " + tentativasRestantes);
            System.out.println("Digite um número entre 0 e 100: ");
            int palpite = entrada.nextInt();
            tentativasRestantes--;

            if(palpite == numeroAleatorio) {
                System.out.println("Parabéns, você acertou!");
            break;
            } else if (palpite < numeroAleatorio) {
                System.out.println("Você errou :( tente um número maior." + tentativasRestantes);
            } else {
                System.out.println("Você errou :( tente um número menor.");
            }
            if(palpite > numeroAleatorio) {
                System.out.println("O número digitado é maior que 100!");
            }
            if (tentativasRestantes == 0) {
                System.out.println("Acabaram suas tentativas D: O número secreto era: " + numeroAleatorio);
            }
        }

        entrada.close();
    }
}
