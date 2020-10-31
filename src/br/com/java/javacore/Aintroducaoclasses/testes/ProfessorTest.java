package br.com.java.javacore.Aintroducaoclasses.testes;

import br.com.java.javacore.Aintroducaoclasses.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.cpf = "07115707600";
        professor.matricula = "310";
        professor.nome = "Leandro";
        professor.rg = "11447489";

        Professor professor1 = new Professor();
        professor1.cpf = "132131321";
        professor1.matricula = "231321";
        professor1.nome = "Jandimir";
        professor1.rg = "23456789";

        professor1 = professor;
        System.out.println(professor.cpf);
        System.out.println(professor.matricula);
        System.out.println(professor.nome);
        System.out.println(professor.rg);
        System.out.println("__________________________");
        System.out.println(professor1.cpf);
        System.out.println(professor1.matricula);
        System.out.println(professor1.nome);
        System.out.println(professor1.rg);

    }
}
