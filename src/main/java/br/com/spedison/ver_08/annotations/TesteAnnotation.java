package br.com.spedison.ver_08.annotations;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface ParametroIgnorado {
    boolean ignora() default true;
    double tensao() default 110.0;
    String value() default "";
};

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(Voltagens.class)
@interface Voltagem {
    String tensao();
}

@Retention(RetentionPolicy.RUNTIME)
@interface Voltagens{
    Voltagem [] value();
}

@Voltagem(tensao = "110")
@Voltagem(tensao = "210")
class ProdutoAnotado{
    @ParametroIgnorado(tensao = 150, ignora = false)
    String nome;
    Double preco;

    public ProdutoAnotado(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public ProdutoAnotado() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}

public class TesteAnnotation {

    public static void main(String[] args) throws NoSuchFieldException {
        Voltagem [] volts = ProdutoAnotado.class.getAnnotationsByType(Voltagem.class);
        for (Voltagem volt : volts) {
            System.out.println("volt = " + volt);
        }

        ParametroIgnorado [] parametroIgnorados = ProdutoAnotado.class.getDeclaredField("nome").getAnnotationsByType(ParametroIgnorado.class);

        for (ParametroIgnorado parametro : parametroIgnorados) {
            System.out.println("parametro = " + parametro);
            System.out.println("parametro.ignora() = " + parametro.ignora());
        }

    }

}
