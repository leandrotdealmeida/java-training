package br.com.java.javacore.OException.checkedexception.test;

import java.io.File;
import java.io.IOException;

public class CheckedExceptionTest {
    public static void main(String[] args) {
        try {
            criarArquivo();
            abrirArquivo();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void criarArquivo() throws IOException {

        File file = new File("test.txt");
        try {
            System.out.println("Arquivo criado?" + file.createNewFile());
            System.out.println("Arquivo Criado");
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static String abrirArquivo() {
        try {
            System.out.println("Abrindo Arquivo");
            System.out.println("Executando leitura do arquivo");
           // throw new  Exception();
            System.out.println("Escrevendo no arquivo");
            return "valor";

        }catch (Exception e){
            System.out.println("Dentro do catch");
            e.printStackTrace();
        }finally {
            System.out.println("Fechar o arquivo");
        }

        return null;
    }
}
