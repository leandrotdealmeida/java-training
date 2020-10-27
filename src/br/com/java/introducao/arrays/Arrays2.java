package br.com.java.introducao.arrays;

/**
 * Created by Meus Documentos on 16/09/2019.
 */
public class Arrays2 {
    public static void main(String[] args) {
        //byte, short, int , long, float, double = 0
        //chat '\u0000' ' '
        //boolean false
        //reference null
        String[] nomes = new String[4];
        nomes[0] = "Golean";
        nomes[1] = "Alanka";
        nomes[2] = "Juninca";
        nomes[3] = "Vidina";
        for (int i = 0; i < nomes.length; i++) System.out.println(i + 1 + " Nome: " + nomes[i]);

        nomes = new String[3];
        nomes[0] = "Jaca";
        nomes[1] = "Indio";
        nomes[2] = "TAquea";
        for (int i = 0; i < nomes.length; i++) System.out.println(nomes[i]);

    }
}
