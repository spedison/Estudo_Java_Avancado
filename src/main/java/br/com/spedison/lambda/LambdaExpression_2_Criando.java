package br.com.spedison.lambda;

interface Figura{
    void desenha();
}
interface Figura2{
    void desenha(String str);
}

public class LambdaExpression_2_Criando {

    public static void main(String[] args) {

        Figura f = () -> System.out.println("Desenhando a figura");

        f.desenha();

        Figura2 f2 = System.out::println;

        f2.desenha("Figura 2 desenha o teste");


    }

}
