package br.com.spedison.ver_08.lambda;

import br.com.spedison.Produto;

import java.util.ArrayList;
import java.util.List;

public class LambidaExpression_3_ListaProdutos {

    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();

        Produto a = new Produto("TV", 200.0);
        produtos.add(a);
        produtos.add(new Produto("TV 42", 2000.0));
        produtos.add(new Produto("Geladeira 470L", 3200.));
        produtos.add(new Produto("Fogão 4 bocas", 900.));
        produtos.add(new Produto("Video Game", 1999.10));
        produtos.add(new Produto("Microondas", 550.45));

        produtos.forEach(System.out::println);
        System.out.println("---------------------");

        produtos.sort((p1, p2) -> p1.getNome().compareTo(p2.getNome()));

        produtos.forEach(System.out::println);
        System.out.println("---------------------");

        produtos.sort((p1, p2) -> p1.getPreco().compareTo(p2.getPreco()));

        produtos.forEach(System.out::println);
        System.out.println("---------------------");
    }

}
