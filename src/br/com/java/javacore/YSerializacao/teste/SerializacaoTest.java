package br.com.java.javacore.YSerializacao.teste;

import br.com.java.javacore.YSerializacao.classes.Aluno;
import br.com.java.javacore.YSerializacao.classes.Turma;

import java.io.*;

public class SerializacaoTest {
    public static void main(String[] args) {
        gravadorObjeto();
        leitorObjeto();

    }

    private static void gravadorObjeto() {
        Turma turma = new Turma("Maratona Java, só para os campeões...");
        Aluno aluno = new Aluno(1l, "Leandro Almeida", "123456");
        aluno.setTurma(turma);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("aluno.ser"))) {
            oos.writeObject(aluno);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void leitorObjeto() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("aluno.ser"))) {
            Aluno aluno = (Aluno) ois.readObject();
            System.out.println(aluno);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
