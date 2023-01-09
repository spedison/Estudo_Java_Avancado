package br.com.spedison.ver_08.lambda;

public class LambdaExpression_1_Usando {

    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
            final int [] i = {10_000};
            for (;i[0]>=0;i[0]--)
                System.out.println("Hello 1 " + Thread.currentThread().getId());
        });

        Thread t2 = new Thread(()->{
            final int [] i = {10_000};
            for (;i[0]>=0;i[0]--)
                System.out.println("Hello 2 " + Thread.currentThread().getId());
        });

        t1.start();
        t2.start();
    }

}
