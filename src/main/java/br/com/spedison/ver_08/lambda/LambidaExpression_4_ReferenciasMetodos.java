package br.com.spedison.ver_08.lambda;

import br.com.spedison.Produto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface Figura2D {
    void desenha(Double largura, Double altura);
}

class Retangulo {
    public Retangulo(double largura, double altura) {
        System.out.print("Desenhando com construtor ::: largura = " + largura);
        System.out.println("  -  altura = " + altura);
    }

    public Retangulo() {
    }

    public void desenhaRetangulo(double largura, double altura) {
        System.out.print("Desenhando Retangulo ::: largura = " + largura);
        System.out.println("  -  altura = " + altura);
    }
}

class Imprimessao {
    public static void imprime(Produto prod) {
        System.out.println("****************************************************************");
        System.out.println("** Nome  = " + prod.getNome());
        System.out.println("** Preco = " + prod.getPreco());
        System.out.println("****************************************************************");
    }
}

public class LambidaExpression_4_ReferenciasMetodos {

    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();

        Produto a = new Produto("TV", 200.0);
        produtos.add(a);
        produtos.add(new Produto("TV 42", 2000.0));
        produtos.add(new Produto("Geladeira 470L", 3200.));
        produtos.add(new Produto("Fogão 4 bocas", 900.));
        produtos.add(new Produto("Video Game", 1999.10));
        produtos.add(new Produto("Microondas", 550.45));

        var txt =
                """
                        TV2;101.
                        GELADEIRA 22;2501.
                        MICROONDAS 222;333.1
                        """;
        Arrays
                .stream(txt.split("[\n\r]"))
                .map(s -> s.split("[;]"))
                .map(Produto::new) // Usando o método :: Construtor
                .peek(produtos::add)
                .forEach(System.out::println);

        System.out.println("--------------------------");

        produtos.forEach(System.out::println);
        System.out.println("---------------------");

        produtos.sort((p1, p2) -> p1.getNome().compareTo(p2.getNome()));

        produtos.forEach(System.out::println);
        System.out.println("---------------------");

        produtos.sort((p1, p2) -> p1.getPreco().compareTo(p2.getPreco()));

        produtos.forEach(System.out::println);
        System.out.println("---------------------");


        //Figura2D f2d1 = (l, al) -> System.out.println("Desenhando figura 2D altura %f, largura %f".formatted(l, al));
        //f2d1.desenha(10.1, 10.2);

        Retangulo r = new Retangulo();
        Figura2D f2d2 = r::desenhaRetangulo; // Usando o método de objeto
        f2d2.desenha(12., 12.3);

        f2d2 = Retangulo::new;
        f2d2.desenha(15., 15.3);

        produtos.forEach(Imprimessao::imprime); // Usando métodos estáticos
        produtos
                .stream()
                .map(Produto::toString)// Usando o métodos de uma classe
                .forEach(System.out::println); // Usando métodos de objetos.

    }

}
