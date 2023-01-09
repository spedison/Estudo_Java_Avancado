package br.com.spedison.ver_12;

import java.util.stream.Collectors;

public class StringFunctions {
    public static void main(String[] args) {
        String linha = """
                \s\sEstou na 1o linha
                \s\sEstou na 2o linha
                \s\sEstou na 3o linha
                """;
        System.out.println("Sem espaços");
        System.out.println("linha = \n[\n" + linha.indent(0)+"]");
        System.out.println("Com 10 espaços");
        System.out.println("linha = \n[\n" + linha.indent(10)+"]");
        System.out.println("Com 1 espaço");
        System.out.println("linha = \n[\n" + linha.indent(1)+"]");
        System.out.println("Remove 1 espaço");
        System.out.println("linha = \n[\n" + linha.indent(-1)+"]");


        String linhasInvertidas =
                linha
                        .lines()
                        .map(s-> s.transform(s1 -> new StringBuilder(s1).reverse().toString()))
                        .collect(Collectors.joining("\n"))
                        .toString();

        System.out.println("linhasInvertidas = \n" + linhasInvertidas);
    }
}
