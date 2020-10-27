package br.com.java.javacore.TDatas;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SimpleDataFormatTest {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        String mascara = "'Sao Paulo', dd 'de' MMMM 'de' yyyy";
        SimpleDateFormat formatador = new SimpleDateFormat(mascara);
        System.out.println(formatador.format(c.getTime()));
    }
}
