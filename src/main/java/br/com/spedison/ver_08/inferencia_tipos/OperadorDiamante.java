package br.com.spedison.ver_08.inferencia_tipos;

import br.com.spedison.Produto;

import java.util.ArrayList;
import java.util.List;

public class OperadorDiamante {

    static void imprimeProdutos(List<Produto> produtos) {
        if (produtos.isEmpty())
            System.out.println("Lista Vazia");
        else produtos
                .stream().map(p -> p.getNome() + " - " + p.getPreco())
                .forEach(System.out::println);
    }

    public static void main(String[] args) {

        List<Produto> produtos = new ArrayList<>(); // Aqui o <> é inferido como <Produto>

        Produto a = new Produto("TV", 200.0);
        produtos.add(a);
        produtos.add(new Produto("TV 42", 2000.0));
        produtos.add(new Produto("Geladeira 470L", 3200.));
        produtos.add(new Produto("Fogão 4 bocas", 900.));
        produtos.add(new Produto("Video Game", 1999.10));
        produtos.add(new Produto("Microondas", 550.45));

        imprimeProdutos(produtos);
        System.out.println("============");
        imprimeProdutos(new ArrayList<>()); // Aqui o <> é inferido como <Produto>


    }
}
