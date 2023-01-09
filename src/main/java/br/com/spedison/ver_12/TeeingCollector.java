package br.com.spedison.ver_12;

import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TeeingCollector {
    public static void main(String[] args) {

        // Mescla 2 funçoões para gerar um terceiro resultado.
        // Um exemplo é a média artimética pois elea divide (mescla) a soma pela quantidade de elementos.

        double resultado =
                Stream.of(11, 10, 21, 15, 10, 11, 17, 21, 10).collect(
                        Collectors.teeing(
                                Collectors.summingDouble(i -> i),
                                Collectors.counting(),
                                (soma, quantidade) -> soma / quantidade
                        )
                );
        System.out.println("resultado = " + resultado);
        //Collectors.teeing(soma, quantidade, media);


    }
}
