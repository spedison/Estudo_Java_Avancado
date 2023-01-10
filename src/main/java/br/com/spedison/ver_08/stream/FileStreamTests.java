package br.com.spedison.ver_08.stream;

import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;

public class FileStreamTests {
    public static void main(String[] args) {
        try {

            var testeDeArrays = "Teste de Arrays com Bytes Stream";
            var bis = new ByteArrayInputStream(testeDeArrays.getBytes(Charset.defaultCharset()));
            var bos = new FileOutputStream("teste1.file");
            while (bis.available() > 0) {
                Character lido = (char) bis.read();
                bos.write((int)lido.charValue());
                System.out.println(lido);
            }
            bis.close();
            bos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
