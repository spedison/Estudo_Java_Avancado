package br.com.spedison.ver_08.stream;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.Charset;

public class ByteStreamTests {

    public static void main(String[] args) {

        var testeDeArrays = "Teste de Arrays com Bytes Stream";
        var bis = new ByteArrayInputStream(testeDeArrays.getBytes(Charset.defaultCharset()));
        while (bis.available() > 0) {
            Character lido = (char) bis.read();
            System.out.println(lido);
        }
        try {
            bis.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
