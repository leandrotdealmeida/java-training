package br.com.java.javacore.Wdiretorios.tests;

import java.io.*;

public class BufferedTest {
    public static void main(String[] args) {
        File file = new File("Arquivo.txt");
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            BufferedReader br = new BufferedReader(new FileReader(file))){

            bw.write("Escrevendo um teste legal");
            bw.newLine();
            bw.write("Pulando uma linha");
            bw.flush();

            String s = null;
            while((s=br.readLine()) != null){
                System.out.println(s);
            }

        }catch(IOException e){
            e.printStackTrace();
        }




//        try {
//            FileWriter fw = new FileWriter(file);
//            BufferedWriter bw = new BufferedWriter(fw);
//
//            bw.write("Escrevendo um teste legal");
//            bw.newLine();
//            bw.write("Pulando uma linha");
//            bw.flush();
//            bw.close();
//
//            FileReader fr = new FileReader(file);
//            BufferedReader br = new BufferedReader(fr);
//            String s = null;
//            while((s=br.readLine()) != null){
//                System.out.println(s);
//            }
//            br.close();
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
