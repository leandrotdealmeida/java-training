package br.com.java.javacore.ZZHlambdas.test;

import br.com.java.javacore.ZZHlambdas.classes.Carro;


import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.*;

import static java.util.Arrays.asList;

public class LambdaTest3 {
    public static void main(String[] args) {

        List<Carro> carros = asList(new Carro("Preto", 2001), new Carro("Preto", 2001), new Carro("Preto", 2001));
        List<String> listCores = map(carros, (Carro c) -> c.getCor() );
        System.out.println(listCores);

        Predicate<Integer> pares = (Integer i) -> i % 2 == 0;
        System.out.println(pares.test(1000));

        String cor = "VERMELHO";

        IntPredicate impar = (int i) -> i % 2 == 1;
        System.out.println(impar.test(1000));

        //Callable<Integer> c = () -> 100;
        //PrivilegedAction<Integer> p = () -> 100;

        Predicate<String> p = (String s) -> listCores.add(s);
        Consumer<String> b = (s) -> listCores.add(s);
        b.accept("AMARELO");

        Supplier<String> sup1 = () -> "oi";
        Supplier<Carro> sup2 = () -> new Carro("Preto", 2011);
        System.out.println(sup2.get().getCor());




    }

    public static <T> void forEach(List<T> list, Consumer<T> c) {
        for (T e : list) {
            c.accept(e);
        }
    }

    public static <T, R> List<R> map(List<T> list, Function<T, R> f) {
        List<R> result = new ArrayList<>();
        for(T e: list) {
            result.add(f.apply(e));
        }

        return result;
    }





}
