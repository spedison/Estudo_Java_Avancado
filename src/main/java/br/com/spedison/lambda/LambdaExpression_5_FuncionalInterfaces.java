package br.com.spedison.lambda;


import br.com.spedison.Produto;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/***
 * Single Abstract Method Interface SAM Interface.
 * Runnable, Calleble, Comparable....
 * Function, Supplier, Consumer, Predicate
 */

public class LambdaExpression_5_FuncionalInterfaces {

    public static void main(String[] args) {
        Runnable r = () -> {
            System.out.println("run");
        };

        Function<Long, Double> func1_1 = (a) -> a * 2.1;

        final Random rand = new Random();
        Callable<Double> callable = () -> rand.nextDouble();

        Comparable<Produto> comp = (p1) -> p1.getNome().compareTo("pai tá on");

        Supplier<Double> supp = () -> rand.nextDouble();
        System.out.println(supp.get());

        Consumer<Double> consumer = (d) -> System.out.println(d);
        Consumer<Double> consumer2 = consumer.andThen((d) -> System.out.println("d = " + d));
        consumer2.accept(10.);

        Predicate<Integer> test_more_than_10 = (a) -> a > 10;

    }

}
