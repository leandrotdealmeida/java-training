package br.com.java.javacore.Xnio.tests;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class AtributosBasicosTest {
    public static void main(String[] args) throws IOException {
        Date dia = new GregorianCalendar(2020, Calendar.APRIL,13).getTime();
        File file = new File("folder2\\arquivo.txt");
        file.createNewFile();
        file.setLastModified(dia.getTime());
        System.out.println(file.lastModified());
        file.delete();
        Path path = Paths.get("folder2\\arquivo_path.txt");
        Files.createFile(path);
        FileTime fileTime = FileTime.fromMillis(dia.getTime());
        Files.setLastModifiedTime(path, fileTime);
        System.out.println(Files.getLastModifiedTime(path));
        Files.deleteIfExists(path);

        path = Paths.get("src\\br\\com\\abc\\javacore\\HHeranca\\classes\\Pessoa.java");
        System.out.println(Files.isReadable(path));
        System.out.println(Files.isWritable(path));
        System.out.println(Files.isExecutable(path));
        //BasicFileAttributes, PosixFileAttributes, DosFileAttributes
        BasicFileAttributes atributos = Files.readAttributes(path, BasicFileAttributes.class);
        System.out.println("Create "+ atributos.creationTime());
        System.out.println("Last Acess "+ atributos.lastAccessTime());
        System.out.println("Last Modified "+ atributos.lastModifiedTime());
//        System.out.println( atributos.isDirectory());
//        System.out.println(atributos.isSymbolicLink());
//        System.out.println(atributos.isRegularFile());

        //BasicFileAttibuteView ...
        FileTime lastModified = atributos.lastModifiedTime();
        FileTime created = atributos.creationTime();
        FileTime lastAcesses = FileTime.fromMillis(System.currentTimeMillis());
        BasicFileAttributeView basicView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
        basicView.setTimes(lastModified, lastAcesses, created);
        atributos = Files.readAttributes(path, BasicFileAttributes.class);
        System.out.println("Create "+ atributos.creationTime());
        System.out.println("Last Acess "+ atributos.lastAccessTime());
        System.out.println("Last Modified "+ atributos.lastModifiedTime());
    }
}
