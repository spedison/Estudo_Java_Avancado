package br.com.spedison.ver_13_14;

public class TextBlocks {
    public static void main(String[] args) {
        var srtUnicaLinha = "Olá mundo\n" +
                "Essa linha está\n" +
                "no modo antigo\n";
        System.out.println("srtUnicaLinha = " + srtUnicaLinha);

        var strTextBlocks = """
                Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
                aliquip ex ea commodo consequat. Duis aute irure dolor
                in reprehenderit in voluptate velit esse cillum dolore eu f
                Aqui""";

        System.out.println("strTextBlocks = " + strTextBlocks);

        //var strErro = """Não pode ser de única linha""";
        //var strDuasLinhas = """Aqui é
        //                       de duas linhas
        //                       e também não pode!!!""";

        var s2 = """
                Olá   Mundo!\
                Este é\s\so módulo avançado 
                de Tópicos avançados.
                """;
        // No fim da linha \ ignora a quebra de linha
        // /s é gerado um espaço em branco.
        System.out.println("s2 = " + s2);

    }
}
