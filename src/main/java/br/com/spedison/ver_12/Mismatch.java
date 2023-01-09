package br.com.spedison.ver_12;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

public class Mismatch {


    private static File[] criaArquivos() {
        var str1 = """
                Olá Mundo! Arquivo 1
                """;
        var str2 = """
                Olá Mundo! Arquivo 2
                """;
        File[] files = new File[2];
        files[0] = new File("teste1.file");
        files[1] = new File("teste2.file");
        try {
            Files.writeString(files[0].toPath(), str1, StandardCharsets.UTF_8);
            Files.writeString(files[1].toPath(), str2, StandardCharsets.UTF_8);
            return files;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {

        File[] arquivos = criaArquivos();

        try {
            long ret = Files.mismatch(arquivos[0].toPath(), arquivos[1].toPath());
            System.out.println("retorno mismatch = " + ret);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
