package br.com.spedison.ver_08.base64;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

/****
 * Caracteres do Base64 "A-Za-z0-9+/"
 * URL
 * Mine (RFC-2045)
 * Codificação RFC-4648 e RFC-2045
 * A classe Base64 só tem acesso a métodos estáticos para pegar os encoders/decoders
 *
 */
public class Base64_1_Iniciando {

    public static void main(String[] args) {

        String texto = "Esse é um teste para Java 8/18 com Base64";
        byte[] textoCodificado = Base64.getEncoder().encode(texto.getBytes(StandardCharsets.UTF_8));

        System.out.print("textoCodificado = ");
        for (byte b : textoCodificado)
            System.out.printf("%02x::", b);

        System.out.println();
        System.out.println(new String(Base64.getDecoder().decode(textoCodificado), StandardCharsets.UTF_8));

    }

}
