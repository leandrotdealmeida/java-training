package br.com.java.javacore.YSerializacao.classes;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Aluno implements Serializable {


    private Long id;
    private String name;
    private transient String password;
    private static String nomeEscola = "Dev Dojo";
    private transient Turma turma;

    public Aluno(Long id, String name, String password) {
        System.out.println("Dentro do construtor");
        this.id = id;
        this.name = name;
        this.password = password;
    }


    @Override
    public String toString() {
      return "Aluno{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", nomeEscola='" + nomeEscola + '\'' +
                ", turma='" + turma + '\'' +
                '}';


    }

    private void writeObject(ObjectOutputStream oos){
        try {
            oos.defaultWriteObject();
            oos.writeObject(turma.getNome());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void readObject(ObjectInputStream ois){
        try {
            ois.defaultReadObject();
           turma = new Turma(ois.readUTF());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static String getNomeEscola() {
        return nomeEscola;
    }

    public static void setNomeEscola(String nomeEscola) {
        Aluno.nomeEscola = nomeEscola;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

}
