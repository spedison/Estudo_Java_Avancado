package br.com.spedison.ver_08.arrays;

import java.util.stream.IntStream;

public class ArraysUtils {

    static public void imprimeArray(double[] array) {
        IntStream
                .range(0, array.length)
                .mapToObj(i -> "%12.7f - ".formatted(array[i]))
                .forEach(System.out::print);
        System.out.println();
    }

    static public void imprimeArray(int[] array) {
        IntStream
                .range(0, array.length)
                .mapToObj(i -> "%d - ".formatted(array[i]))
                .forEach(System.out::print);
        System.out.println();
    }


    static public double[] geraArray(final int tamanhoArray, final double inicio, final double fim) {
        return IntStream.rangeClosed(0, tamanhoArray)
                .mapToDouble(i -> (inicio + (double) i) * ((fim - inicio) / tamanhoArray))
                .toArray();
    }

}
