package br.com.spedison.ver_08.stringjoiner;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class StringJoiner_1_Exemplo {


    public static void main(String[] args) {
        String nomes = "João, Maria, Ana, Paulo, Edison, Neci, Pedro, Fatima, Catarina";
        System.out.println("nomes = " + nomes);
        StringTokenizer st = new StringTokenizer(nomes, ",");

        List<String> listNomes = new ArrayList<>();

        while(st.hasMoreTokens()) {
            String s = st.nextToken();
            s = s.trim();
            System.out.println("Token : " + s.trim());
            listNomes.add(s);
        }

        StringJoiner sj = new StringJoiner(" ; ");
        listNomes.forEach(sj::add);
        System.out.println(sj.toString());
    }

}
