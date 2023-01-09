package br.com.spedison.ver_13_14;

/***
 * Records
 * Simplificar o uso de POJOs
 * Não pode extender ou ser extendido
 * Não pode ser abstratos
 * Não pode haver variáveis de instância na estrutura
 * Todos os atributos são final
 * Pode implementar interfaces
 * pode conter métodos estáticos
 */


record Retangulo(double largura, double altura){
    public double getArea(){
        return altura() * largura();
    }
}

public class Records {

    public static void main(String[] args) {

        Retangulo r1 = new Retangulo(1.0, 2.0);
        System.out.println(r1.toString());
        System.out.println("r1.altura() = " + r1.altura());

    }

}
