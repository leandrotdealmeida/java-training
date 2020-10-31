package br.com.java.javacore.Xnio.tests;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizarPath {
    public static void main(String[] args) {
        Path dir = Paths.get("/home/japa");
        Path classe = Paths.get("/home/japa/java/Pessoa.java");
        Path pathToClasse = dir.relativize(classe);
        System.out.println(pathToClasse);

        Path absoluto1 = Paths.get("/home/japa");
        Path absoluto2 = Paths.get("/usr/local");
        Path absoluto3 = Paths.get("/home/japa/java/Pessoa.java");
        Path relativo1 = Paths.get("temp");
        Path relativo2 = Paths.get("temp/Funcionario.java");

        System.out.println("1: "+absoluto1.relativize(absoluto3));
        System.out.println("2: "+absoluto3.relativize(absoluto1));
        System.out.println("1: "+absoluto1.relativize(absoluto2));
        System.out.println("1: "+relativo1.relativize(relativo2));
        //System.out.println("1: "+absoluto1.relativize(relativo1));
    }
}
