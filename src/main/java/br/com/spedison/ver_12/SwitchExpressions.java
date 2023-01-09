package br.com.spedison.ver_12;

import java.util.Scanner;

public class SwitchExpressions {
    public static void main(String[] args) {
        System.out.println("Informe o dia da semana:");
        Scanner scanner = new Scanner(System.in);
        var dia = scanner.nextLine();
        scanner.close();
        String resultado =
                switch (dia.trim().toLowerCase()) {
                    case "segunda",
                            "terça",
                            "terca",
                            "quarta",
                            "quinta",
                            "sexta" -> "dia útil";
                    case "sábado",
                            "sabado",
                            "domingo" -> "dia de folga";
                    default -> "Não é dia válido";
                };
        System.out.println("resultado = " + resultado);
    }
}
