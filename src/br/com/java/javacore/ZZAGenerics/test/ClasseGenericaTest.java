package br.com.java.javacore.ZZAGenerics.test;

import br.com.java.javacore.ZZAGenerics.classes.Carro;
import br.com.java.javacore.ZZAGenerics.classes.Computador;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>();
        carrosDisponiveis.add(new Carro("Gol"));
        carrosDisponiveis.add(new Carro("BMW"));
        ObjetosAlugaveis<Carro> carroAlugavel = new ObjetosAlugaveis<>(carrosDisponiveis);
        Carro carro = carroAlugavel.getObjetoDisponivel();
        System.out.println("Usando o carroor um mes");
        carroAlugavel.devolverObjeto(carro);
        System.out.println("-----------------");
        List<Computador> computadoresDisponiveis = new ArrayList<>();
        computadoresDisponiveis.add(new Computador("Intel"));
        computadoresDisponiveis.add(new Computador("AMD"));
        ObjetosAlugaveis<Computador> computadorAlugavel = new ObjetosAlugaveis<>(computadoresDisponiveis);
        Computador computador = computadorAlugavel.getObjetoDisponivel();
        System.out.println("Usando o computador um mes");
        computadorAlugavel.devolverObjeto(computador);

    }
}

//type
class ObjetosAlugaveis<T> {
    private List<T> objetosDisponíveis;
    public ObjetosAlugaveis(List<T> objetosDisponíveis){
        this.objetosDisponíveis = objetosDisponíveis;
    }


    //Alugar
    public T getObjetoDisponivel() {
        T t = objetosDisponíveis.remove(0);
        System.out.println("Alugando objeto: " + t);
        System.out.println("Objetos Disponíveis: " + objetosDisponíveis);
        return t;
    }

    public void devolverObjeto(T t) {
        System.out.println("Devolvendo objeto: " + t);
        objetosDisponíveis.add(t);
        System.out.println("Objetos disponíveis: " + objetosDisponíveis);
    }
}