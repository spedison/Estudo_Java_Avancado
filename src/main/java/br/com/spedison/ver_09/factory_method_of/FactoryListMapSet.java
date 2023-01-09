package br.com.spedison.ver_09.factory_method_of;

import java.util.List;
import java.util.Set;

public class FactoryListMapSet {

    public static void main(String[] args) {

        List<String> lista = List.of("Edison", "Ribeiro", "Araújo");
        lista.forEach(
                System.out::println
        );

        // A ordem não é necessariamente seguido.
        Set<String> set = Set.of("Edison", "Ribeiro", "Araújo");//, "Edison"); // Não aceita elementos repetidos.
        set.forEach(
                System.out::println
        );

        // lista.add("Meu teste"); // As listas são imutáveis.


    }

}
