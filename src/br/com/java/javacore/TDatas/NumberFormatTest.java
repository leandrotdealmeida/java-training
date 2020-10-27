package br.com.java.javacore.TDatas;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;


public class NumberFormatTest {
    public static void main(String[] args) {
        float valor = 212.4567F;
        Locale locJP = new Locale("JP");
        NumberFormat[] nf = new NumberFormat[4];
        nf[0] = NumberFormat.getInstance();
        nf[1] = NumberFormat.getInstance(locJP);
        nf[2] = NumberFormat.getCurrencyInstance();
        nf[3] = NumberFormat.getCurrencyInstance(locJP);

        for (NumberFormat nfa : nf){
            System.out.println(nfa.format(valor));
        }
        NumberFormat nf2 = NumberFormat.getInstance();
        System.out.println(nf2.getMaximumFractionDigits());
        nf2.setMaximumFractionDigits(1);
        System.out.println(nf2.format(valor));
        String valorString  = "212.4567A";
        try {
            System.out.println(nf2.parse(valorString));
            nf2.setParseIntegerOnly(true);
            System.out.println(nf2.parse(valorString));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
