package br.com.java.javacore.Gassociacao.test;

import br.com.java.javacore.Gassociacao.seminario.Aluno;
import br.com.java.javacore.Gassociacao.seminario.Local;
import br.com.java.javacore.Gassociacao.seminario.Professor;
import br.com.java.javacore.Gassociacao.seminario.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Leandro Almeida", 34);
        Aluno aluno2 = new Aluno("Janir alves", 43);

        Seminario sem = new Seminario("Como ser um baita programador e ficar em paz");
        Professor prof = new Professor("Yoda", "Usar a força para programar");
        Local local  = new Local("Rua das araras", "Mato");

        aluno.setSeminario(sem);
        aluno2.setSeminario(sem);

        sem.setProfessor(prof);
        sem.setLocal(local);
        sem.setAlunos(new Aluno[]{aluno, aluno2});

        Seminario[] semArray = new Seminario[1];
        semArray[0] = sem;
        prof.setSeminarios(semArray);

        sem.print();
        prof.print();
        aluno.print();
        aluno2.print();
        local.print();
    }
}
