package br.com.spedison.ver_11;

import java.util.stream.Collectors;

public class Strings {
    public static void main(String[] args) {
        System.out.println(new String("Hello"));


        String a = "      ";
        if (a.isBlank())
            System.out.println("a is blank");

        if (a.isEmpty())
            System.out.println("a is empty");

        a = "   olá   ";
        if (a.isBlank())
            System.out.println("a is blank");

        if (a.isEmpty())
            System.out.println("a is empty");

        a = """
                   Estou testando os
                   novos métodos da String
                   Usando múltiplas linhas
                   com Lines 
                """;
        // Processa a string
        a
                .lines()
                .map(String::trim)
                .forEach(System.out::println);

        // Coletando dados da String usando o toList
        System.out.println(a
                .lines()
                .map(String::trim)
                .collect(Collectors.toList()));

        // Usando o Repeat com a quantidade de vezes. Com a string completa.
        System.out.println(a
                .repeat(3)
                .lines()
                .map(String::trim)
                .collect(Collectors.toList()));

        // Usando o Repeat com a quantidade de vezes. Com item a item.
        System.out.println(a
                .lines()
                .map(String::trim)
                .map(s -> s + "\t")
                .map(s -> s.repeat(3))
                .collect(Collectors.toList()));


    }
}
