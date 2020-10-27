package br.com.java.javacore.Bintroducaometodos.test;

import br.com.java.javacore.Bintroducaometodos.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor prof = new Professor();
        prof.nome = "Leandro";
        prof.cpf = "090294242";
        prof.matricula = "312321312";
        prof.rg = "11489277";

        Professor prof2 = new Professor();
        prof2.nome = "Juao";
        prof2.cpf = "09023142";
        prof2.matricula = "31232212";
        prof2.rg = "11432277";

        prof.imprimeConteudo(prof);
        prof2.imprimeConteudo(prof2);
    }
}
