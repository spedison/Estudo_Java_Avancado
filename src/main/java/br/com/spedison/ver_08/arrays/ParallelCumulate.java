package br.com.spedison.ver_08.arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

/***
 * Cuidado !! Esses métodos que rodam em paralelo normalmente tem uma performance melhor quando se opera com 10K, 100K ou mais elementos
 * Como eles tem um "overread" maior para criar as Threads, isso deveria ser compensado somente se temos vários itens para processar.
 * Caso contrário, no lugar de ser "mais rápido" ficará mais lento que se executado sequencialmente.
 */
public class ParallelCumulate {


    static private int[] geraArray(int tamanhoArray, int valorMaximo) {
        Random r = new Random();
        return IntStream
                .generate(() -> r.nextInt())
                .limit(tamanhoArray)
                .map(i -> Math.abs(i) % valorMaximo) // Número de 0 a 99 positivos.
                .toArray();
    }

    public static void main(String[] args) {

        int[] array = geraArray(4, 100);

        System.out.println("Array gerado:");
        ArraysUtils.imprimeArray(array);

        System.out.println("Array Acumulado:");
        Arrays.parallelPrefix(array, (a, b) -> a + b);
        ArraysUtils.imprimeArray(array);
        System.out.println("====================");


        array = geraArray(5, 10);
        System.out.println("Array gerado:");
        ArraysUtils.imprimeArray(array);
        System.out.println("Array da Produtória:");
        Arrays.parallelPrefix(array, (a, b) -> a * b);
        ArraysUtils.imprimeArray(array);

        System.out.println("----Trabalhando com Strings----");
        String[] nomes = new String[]{"Maria", "José", "Pedro", "João"};
        Arrays.stream(nomes).forEach(System.out::print);
        Arrays.parallelPrefix(nomes, (a, b) -> a +";"+b);
        Arrays.stream(nomes).forEach(System.out::println);
    }
}
