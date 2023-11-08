package arrays;

import java.util.Arrays;

public class Exercicio {

    public static void main(String[] args) {

        double [] notasAlunoA = new double [4];
        notasAlunoA [0] = 7.9;
        notasAlunoA [1] = 8;
        notasAlunoA [2] = 6.7;
        notasAlunoA [3] = 9.7;

        // Arrays.toString(notasAlunoA); Pode ser assim também
        System.out.println(Arrays.toString(notasAlunoA));
        System.out.println(notasAlunoA[0]);
        System.out.println(notasAlunoA.length-1);
        //System.out.println(notasAlunoA[4]); Erro!

        // Para percorrer o Array:

        double totalAlunoA = 0;
        for(int i = 0; i < notasAlunoA.length; i++) {
            totalAlunoA += notasAlunoA [i];
        }
        System.out.println(totalAlunoA / notasAlunoA.length);

        // Outra forma de inicializar os valores do Array:
        final double notaArmazenada = 5.9;
        double [] notasAlunoB = { 6.9, 8.9, notaArmazenada, 10 };
        double totalAlunoB = 0;
        for (int i = 0; i < notasAlunoB.length; i++) {
            totalAlunoB += notasAlunoB [i];
        }
        System.out.println(totalAlunoB / notasAlunoB.length);
    }
}
