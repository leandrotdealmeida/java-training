package br.com.java.javacore.Xnio.tests;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizacaoTest {
    public static void main(String[] args) {
        String diretorio = "ExerciciosDevDojo\\home\\leandro\\dev";
        String arquivotxt = "..\\..\\arquivo.txt";
        Path path1 = Paths.get(diretorio, arquivotxt);
        System.out.println(path1.normalize());
        Path path2 = Paths.get("home/./leandro/./dev");
        System.out.println(path2);
        System.out.println(path2.normalize());
    }
}
