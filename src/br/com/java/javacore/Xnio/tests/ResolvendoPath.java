package br.com.java.javacore.Xnio.tests;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolvendoPath {
    public static void main(String[] args) {
        Path dir = Paths.get("home\\leandro");
        Path arquivo = Paths.get("dev\\arquivo.txt");
        Path result = dir.resolve(arquivo);
        System.out.println(result);

        Path absoluto = Paths.get("/home/leandro");
        Path relativo = Paths.get("dev");
        Path file = Paths.get("file.txt");

        System.out.println("1:" + absoluto.resolve(relativo));
        System.out.println("1:" + absoluto.resolve(file));
        System.out.println("1:" + relativo.resolve(absoluto));
        System.out.println("1:" + relativo.resolve(file));
        System.out.println("1:" + file.resolve(relativo));
        System.out.println("1:" + file.resolve(absoluto));
    }
}
