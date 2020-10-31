package br.com.java.javacore.Xnio.tests;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;


public class DosFileAtributesTest {
    public static void main(String[] args) {
            Path path = Paths.get("folder2\\teste.txt");
            try{
              //  Files.createFile(path);
               // Files.setAttribute(path, "dos:ridden", false);
                Files.setAttribute(path, "dos:readonly", true);
                DosFileAttributes dos = Files.readAttributes(path, DosFileAttributes.class);
              //  System.out.println(dos.isHidden());
                System.out.println(dos.isReadOnly());
              DosFileAttributeView dosView = Files.getFileAttributeView(path, DosFileAttributeView.class);
              //dowView.setHidden(false);
                dosView.setReadOnly(false);
                dos = Files.readAttributes(path, DosFileAttributes.class);
                System.out.println(dos.isReadOnly());
            }catch (IOException e){
                e.printStackTrace();
            }
    }
}
