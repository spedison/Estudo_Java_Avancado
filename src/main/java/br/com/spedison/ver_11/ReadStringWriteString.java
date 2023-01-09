package br.com.spedison.ver_11;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

public class ReadStringWriteString {
    public static void main(String[] args) {
        var str = """
                Esse arquivo. Com acentos ? áé ! #ãü ç 
                deve conter
                um texto motivador
                para que todos aprendam 
                a lidar com esse recurso computacional ;-)
                """;

        Charset s = StandardCharsets.UTF_8;
        // Escreve tudo o que comtem em str
        try {
            Files.writeString(new File("teste3.file").toPath(), str,s);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Lê o arquivo inteiro
        try{
            var str2 = Files.readString(new File("teste3.file").toPath(), s);
            System.out.println("str2 = [" + str2 + "]");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
