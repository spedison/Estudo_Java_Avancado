package br.com.spedison.ver_08.arrays;

import java.util.Arrays;

public class ParallelSetValues {

    public static void main(String[] args) {

        // Gera um array de double sequencial com valor máximo e mínimo e a quantidade de partes que itemos operar + 1
        double[] arrayX = ArraysUtils.geraArray(4, 0., 2 * Math.PI);
        // Copia ainda sequencialmente um array origem para outro.
        double[] arrayY = Arrays.copyOf(arrayX, arrayX.length);

        ArraysUtils.imprimeArray(arrayX);
        // Aplica o Seno no valor já existente no Array. (Poderia ser calculado dado a posição)
        Arrays.parallelSetAll(arrayY, (i) -> Math.sin(arrayY[i]));
        ArraysUtils.imprimeArray(arrayY);

    }
}
