package br.com.java.javacore.ZZGcomportamentoporparametro.predicate;

import br.com.java.javacore.ZZGcomportamentoporparametro.classes.Carro;
import br.com.java.javacore.ZZGcomportamentoporparametro.interfaces.CarroPredicate;

public class CarrosCorVerdePredicate implements CarroPredicate {

    @Override
    public boolean test(Carro carro) {
        return carro.getCor().equals("verde");
    }
}
