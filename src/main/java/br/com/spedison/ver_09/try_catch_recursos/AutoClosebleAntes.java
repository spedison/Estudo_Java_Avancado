package br.com.spedison.ver_09.try_catch_recursos;

import java.io.*;

public class AutoClosebleAntes {
    public AutoClosebleAntes() {


    }

    public void leArquivo(){
        // InputStream is  = this.getClass().getClassLoader().getResourceAsStream("br/com/spedison/ver_09/try_catch_recursos/file.txt");
        InputStream is  = this.getClass().getClassLoader().getResourceAsStream("file.txt");

        String linha = "";

        try {
            assert is != null;
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Problema ao ler arquivo !!");
        } finally {
            System.out.println("Executando o final!");
        }
    }

    public static void main(String[] args) {
        (new AutoClosebleAntes()).leArquivo();
    }
}