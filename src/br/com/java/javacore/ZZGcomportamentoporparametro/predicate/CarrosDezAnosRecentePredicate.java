package br.com.java.javacore.ZZGcomportamentoporparametro.predicate;

import br.com.java.javacore.ZZGcomportamentoporparametro.classes.Carro;
import br.com.java.javacore.ZZGcomportamentoporparametro.interfaces.CarroPredicate;

import java.util.Calendar;

public class CarrosDezAnosRecentePredicate implements CarroPredicate {

    @Override
    public boolean test(Carro carro) {
        return carro.getAno() > (Calendar.getInstance().get(Calendar.YEAR) -10);
    }
}
