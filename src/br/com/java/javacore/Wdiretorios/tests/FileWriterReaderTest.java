package br.com.java.javacore.Wdiretorios.tests;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterReaderTest {
    public static void main(String[] args) throws IOException {
        File file  = new File("Arquivo.txt");

        try(FileWriter fileWriter = new FileWriter(file);
            FileReader fileReader = new FileReader(file)){
            fileWriter.write("Testando escrita no arquivo 2 e \n pulando linha");
            fileWriter.flush();

            char[] in = new char[500];
            int size = fileReader.read(in);
            System.out.println("Tamanho" + size);
            for(char c : in){
                System.out.print(c);
            }
        }catch (IOException e){
            e.getMessage();
        }

//        try {
//            FileWriter fileWriter = new FileWriter(file);
//            fileWriter.write("Testando escrita no arquivo 2 e \n pulando linha");
//            fileWriter.flush();
//            fileWriter.close();
//
//            FileReader fileReader = new FileReader(file);
//            char[] in = new char[500];
//            int size = fileReader.read(in);
//            System.out.println("Tamanho" + size);
//            for(char c : in){
//                System.out.print(c);
//            }
//            fileReader.close();
//        }catch (IOException e){
//            e.getMessage();
//        }

    }
}
