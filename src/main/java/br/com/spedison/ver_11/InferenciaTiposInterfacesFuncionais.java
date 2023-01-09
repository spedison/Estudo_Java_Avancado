package br.com.spedison.ver_11;

import java.util.function.Function;

public class InferenciaTiposInterfacesFuncionais {

    public static void main(String[] args) {


        Function<String, String> concatena = (var a) -> a.trim() + " concatenado"; // Aceito no +11
        Function<String, String> concatena2 = (a) -> a.trim() + " concatenado"; // Aceito no +8
        Function<String, String> concatena3 = (String a) -> a.trim() + " concatenado"; // Aceito no <= 10
        var teste = "Olá mundo ....     ";
        var s = concatena.apply(teste);
        System.out.println("s = " + s);





    }


}
