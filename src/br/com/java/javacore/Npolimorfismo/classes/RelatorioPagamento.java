package br.com.java.javacore.Npolimorfismo.classes;

public class RelatorioPagamento {

//    public void relatorioPagamentoGerente(Gerente gerente){
//        System.out.println("Gerando relatorio de pagamento para a gerencia");
//        gerente.calcularPagamento();
//        System.out.println("Nome: " + gerente.getNome());
//        System.out.println("Salario desse mês: " + gerente.getSalario());
//    }
//
//    public void relatorioPagamentoVendedor(Vendedor vendedor){
//        System.out.println("Gerando relatorio de pagamento para vendedor");
//        vendedor.calcularPagamento();
//        System.out.println("Nome: " + vendedor.getNome());
//        System.out.println("Salario desse mês: " + vendedor.getSalario());
//    }

    public void relatorioPagamentoGenerico(Funcionario funcionario) {
        System.out.println("Gerando relatorio de pagamento para funcionarios");
        funcionario.calcularPagamento();
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Salario desse mês: " + funcionario.getSalario());
        if (funcionario instanceof Gerente) {
            Gerente g = (Gerente) funcionario;
            System.out.println("Participacao nos Lucros: " + g.getPnl());
        }

        if (funcionario instanceof Vendedor) {

            System.out.println("Total de Vendas " + ((Vendedor) funcionario).getTotalVendas());
        }

    }
}
