package br.com.java.javacore.TDatas;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest {
    public static void main(String[] args) {
        //Iso 639 pt-portugues BR- Brasil US - Estados Unidos
        Locale localeItaly = new Locale("it","IT");
        Locale localeSuica = new Locale("it", "CH");
        Calendar c = Calendar.getInstance();
        c.set(2015, Calendar.DECEMBER, 23);
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeSuica);

        System.out.println(df.format(c.getTime()));
        System.out.println(df2.format(c.getTime()));

    }
}
