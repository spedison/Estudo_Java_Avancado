package br.com.spedison.ver_09.stream;

import br.com.spedison.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.IntStream;

public class Stream_1_ListaProdutos {

    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("Geladeira  470L", 3200.));
        produtos.add(new Produto("Geladeira 270L", 2900.));
        Produto a = new Produto("TV", 200.0);
        produtos.add(a);
        produtos.add(new Produto("TV 42", 2000.0));
        produtos.add(new Produto("Fogão 4 bocas", 900.));
        produtos.add(new Produto("Video Game", 1999.10));
        produtos.add(new Produto("Microondas", 550.45));
        produtos.add(new Produto("  Geladeira  - 570L", 3400.));

        Function<String,String> upper = String::toUpperCase; // Passa para Caixa Alta.
        Function<String,String> trim = upper.andThen(String::trim); // Faz um trim
        Function<String, String> limpaStr1 = trim.andThen((s) -> s.replaceAll("[-,.]", "")); // Remove caracteres Separadores.
        Function<String, String> limpaStr2 = limpaStr1.andThen(s -> s.replaceAll("\\s+", " ")); // Remove duplos espaços
        Function<String, String> limpaStr3 = limpaStr2.andThen(s -> "   Produto : " + s); // Adiciona a palavra Produto

        produtos
                .stream()
                .takeWhile(p -> p.getNome().toLowerCase().trim().startsWith("geladeira")) // Para o fluxo quando não atender a condição.
                .sorted((p1, p2) -> p1.getNome().compareTo(p2.getNome()))
                .map(Produto::getNome)
                .map(limpaStr3)
                /*.map(String::toUpperCase)
                .map(String::trim)
                .map(s -> s.replaceAll("[-,.]", ""))
                .map(s -> s.replaceAll("\\s+", " "))
                .map(s -> "   Produto : " + s)*/
                .sorted()
                .forEach(System.out::println);

        System.out.println("---------------------");
        produtos
                .stream()
                .skip(2)
                .dropWhile(p -> p.getNome().toLowerCase().trim().startsWith("tv")) // Para o fluxo quando não atender a condição.
                .sorted((p1, p2) -> p1.getNome().compareTo(p2.getNome()))
                .map(Produto::getNome)
                .map(limpaStr3)
                /*.map(String::toUpperCase)
                .map(String::trim)
                .map(s -> s.replaceAll("[-,.]", ""))
                .map(s -> s.replaceAll("\\s+", " "))
                .map(s -> "   Produto : " + s)*/
                .sorted()
                .forEach(System.out::println);




    }


}
