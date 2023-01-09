package br.com.spedison.ver_08.arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class ParallelSorting {


    public static void main(String[] args) {
        Random r = new Random();
        int[] array = IntStream
                .generate(() -> r.nextInt())
                .limit(20)
                .map(i -> Math.abs(i) % 100) // Número de 0 a 99 positivos.
                .toArray();

        System.out.println("Array Original:");
        ArraysUtils.imprimeArray(array);

        System.out.println("Array Ordenado:");
        Arrays.parallelSort(array);

        ArraysUtils.imprimeArray(array);
    }
}
