package br.com.java.javacore.Csobrecargametodos.testes;

import br.com.java.javacore.Csobrecargametodos.classes.Funcionario;

public class FuncionarioTeste {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Liano", "07115707600",  5500, "11447489");
       // funcionario.setNome("Lino Gonzalvel");
       // funcionario.setCpf("012-021-321-00");
       // funcionario.setSalario(5554);
      //  funcionario.init("Lino Gonzalvel","012-021-321-00",5554);
      //  funcionario.init("Lino junior","423-32-423-43",4322, "11447489");
        Funcionario funcionario2 = new Funcionario();
        funcionario.imprime();
        funcionario2.imprime();

    }


}
