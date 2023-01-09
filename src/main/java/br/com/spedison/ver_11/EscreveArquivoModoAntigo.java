package br.com.spedison.ver_11;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class EscreveArquivoModoAntigo {

    public static void main(String[] args) {

        try (FileWriter arquivo = new FileWriter("teste.file", StandardCharsets.UTF_8)) {
            arquivo.write("Olá Mundo\n");
            arquivo.write("Escreve Arquivo\n");
            arquivo.write("Teste Arquivo\n");
            arquivo.write("Agora vai ....\n");
            arquivo.write("E foi\n");
            arquivo.write("Completo ;-)");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        try (BufferedWriter arquivo = new BufferedWriter(new FileWriter("teste2.file", StandardCharsets.UTF_8))) {
            arquivo.write("Olá Mundo\n");
            arquivo.write("Escreve Arquivo\n");
            arquivo.write("Teste Arquivo\n");
            arquivo.write("Agora vai ....\n");
            arquivo.write("E foi\n");
            arquivo.write("Completo ;-)");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }


    }
}
