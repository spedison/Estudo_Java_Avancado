package br.com.spedison.ver_08.stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringBufferInputStream;
import java.io.StringReader;

public class StringStreamTeste {
    public static void main(String[] args) throws IOException {

        StringReader readerStr = new StringReader("""
                Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
                aliquip ex ea commodo consequat. Duis aute irure dolor
                in reprehenderit in voluptate velit esse cillum dolore eu
                fugiat nulla pariatur. Excepteur sint occaecat c
                cupidatat non proident, sunt in culpa qui officia
                deserunt mollit anim id est laborum.
                """);
        BufferedReader reader = new BufferedReader(readerStr);
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        // reader.close();
        System.out.println("----------------------------------------------------------------");
        readerStr.reset();
        while (readerStr.ready()) {
            int v = readerStr.read();
            if (v == -1) break;
            char chr = (char) v;
            System.out.print(chr);
        }
        readerStr.close();


    }

}
