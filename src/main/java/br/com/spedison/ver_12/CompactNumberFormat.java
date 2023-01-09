package br.com.spedison.ver_12;

import java.text.NumberFormat;
import java.util.Locale;

public class CompactNumberFormat {
    public static void main(String[] args) {
        Locale localeBr = new Locale("pt","BR");
        NumberFormat comp = java.text.CompactNumberFormat.getCompactNumberInstance();
        System.out.println(comp.format(1400.00008888));

        comp = java.text.CompactNumberFormat.getCompactNumberInstance(localeBr, NumberFormat.Style.LONG);
        System.out.println(comp.format(14000.00008888));
    }
}
