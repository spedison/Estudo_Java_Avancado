package br.com.spedison.ver_13_14;

import java.util.Scanner;

public class SwitchExpression {
    public static void main(String[] args) {
        System.out.println("Informe o dia da semana:");
        Scanner scanner = new Scanner(System.in);
        var dia = scanner.nextLine();
        String resultado =
                switch (dia.trim().toLowerCase()) {
                    case "segunda":
                    case "terça":
                    case "terca":
                    case "quarta":
                    case "quinta":
                    case "sexta":
                        yield "dia útil";
                    case "sábado":
                    case "sabado":
                    case "domingo":
                        yield "dia de folga";
                    default:
                        yield "Não é dia válido";
                };
        System.out.println("resultado = " + resultado);
    }
}
