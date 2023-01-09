package br.com.spedison.ver_09.try_catch_recursos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class AutoClosebleAtual {
    public AutoClosebleAtual() {


    }

    public void leArquivo() {

        String linha = "";
        try (BufferedReader br = new BufferedReader(new InputStreamReader(this.getClass().getClassLoader().getResourceAsStream("file.txt")))) {
            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println("Problemas ao abrir arquivo");
        } finally {
            System.out.println("Executando o final!");
        }
    }

    public void leArquivo2() {

        String linha = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(this.getClass().getClassLoader().getResourceAsStream("file.txt")));

        try (br) {
            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println("Problemas ao abrir arquivo");
        } finally {
            System.out.println("Executando o final!");
        }
    }

    public static void main(String[] args) {

        System.out.println("-------------------");
        (new AutoClosebleAtual()).leArquivo();
        System.out.println("-------------------");
        (new AutoClosebleAtual()).leArquivo2();
    }
}