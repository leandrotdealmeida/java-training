package br.com.java.javacore.Wdiretorios;

import java.io.File;
import java.io.IOException;

public class FileDiretorioTest {
    public static void main(String[] args) throws IOException {
//        File diretorio  = new File("folder");
//        final boolean mkdir = diretorio.mkdir();
//        System.out.println("DIretorio criado" + mkdir);
//
//        File arquivo = new File(diretorio,"arquivo.txt");
//        boolean newFile = arquivo.createNewFile();
//        System.out.println("Arcuivo criado" + newFile);
//
//        File arquivoNovoNome = new File(diretorio,"arquivo renomado");
//        boolean renamed = arquivo.renameTo(arquivoNovoNome);
//        System.out.println("REnomeado+" + renamed);
//
//        File diretorioRenomeado = new File("folder2");
//        boolean diretorioRenamed = diretorio.renameTo(diretorioRenomeado);
//        System.out.println("Direitorio renomeado" + diretorioRenamed);
        buscarArquivod();
    }

    public static void buscarArquivod(){
        File file  = new File("folder2");
        String[] list = file.list();

        for(String arquivo : list){
            System.out.println(arquivo);
        }
    }
}
