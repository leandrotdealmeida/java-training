package br.com.java.javacore.UExpressoesRegulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegularesTest {
    public static void main(String[] args){
        // \d - todos os digitos
        // \D - tudo o que não for digito
        // \s espaços em branco \t \n \f \r
        // \S caractere que não é branco
        // \w caracteres de palavras a-z A-Z, digitos e _
        // \W Tudo que não for caractere de palavra
        // [] tudo entre os colchetes
        // ? zero ou uma
        // * zero ou mais
        // + uma ou mais
        //[n,m] de n ate m
        // ( ) agrupar uma expressão
        // | OU
        // $ fim de linha
        // o(v|c)o  = ovo, oco
        //maca(rr|c)ão = macarrão ou macacão
        // ^ [^abc]
        int hex = 0x1;
    //    String regex  = "0[xX]([0-9a-fA-F])+(\\s|$)";
    //    String texto = "12 0x 0X 0XFFABC 0x10G 0x1";
    //    String regex  = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+"; // "([\\w\\.])+@([a-zA-Z])+(\\.([a-zA-Z])+)+"
     //   String texto = "fulano@gmail.com, 102Abc@gmail.com, +@!abrao@mail.br, teste@gmail.com.br, teste@mail";
     //   String regex = "\\d{2}/\\d{2}/\\d{2,4}";
     //   String texto = "05/10/2010 05/05/2015 1/01/01 01/05/95";
        String regex = "proj1([^,])*";
        String texto = "proj1.java, proj1.bck, proj1.class, proj1.py";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("Texto: "+ texto);
        System.out.println("Indice: 0123456789" );
        System.out.println("expressao: "+ matcher.pattern());
        System.out.println("posicoes encontradas");
        while (matcher.find()){
            System.out.println(matcher.start()+ " "+ matcher.group());
        }

    }
}
