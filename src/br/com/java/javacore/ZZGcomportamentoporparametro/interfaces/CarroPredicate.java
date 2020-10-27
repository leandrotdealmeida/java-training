package br.com.java.javacore.ZZGcomportamentoporparametro.interfaces;

import br.com.java.javacore.ZZGcomportamentoporparametro.classes.Carro;
@FunctionalInterface
public interface CarroPredicate {
    boolean test(Carro carro);
}
