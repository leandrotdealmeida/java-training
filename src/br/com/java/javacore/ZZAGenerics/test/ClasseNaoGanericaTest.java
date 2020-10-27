package br.com.java.javacore.ZZAGenerics.test;

import br.com.java.javacore.ZZAGenerics.classes.Carro;
import br.com.java.javacore.ZZAGenerics.classes.Computador;

import java.util.ArrayList;
import java.util.List;

public class ClasseNaoGanericaTest {
    public static void main(String[] args) {
        CarroAlugavel carroAlugavel = new CarroAlugavel();
        Carro carroAlugado = carroAlugavel.getCarroDisponivel();
        System.out.println("Usando o carro por uma mes");
        carroAlugavel.devolverCarro(carroAlugado);

        System.out.println("---------------");
        ComputadorAlugavel computadorAlugavel = new ComputadorAlugavel();
        Computador computador = computadorAlugavel.getComputadorDisponivel();
        System.out.println("Usando o pc");
        computadorAlugavel.devolverComputador(computador);




    }
}

class CarroAlugavel {
    private List<Carro> carrosDisponíveis = new ArrayList<>();

    {
        carrosDisponíveis.add(new Carro("Gol"));
        carrosDisponíveis.add(new Carro("BMW"));
    }

    //Alugar
    public Carro getCarroDisponivel() {
        Carro c = carrosDisponíveis.remove(0);
        System.out.println("Alugando carro: " + c);
        System.out.println("Carros Disponíveis: " + carrosDisponíveis);
        return c;
    }

    public void devolverCarro(Carro c) {
        System.out.println("Devolvendo carro: " + c);
        carrosDisponíveis.add(c);
        System.out.println("Carros disponíveis: " + carrosDisponíveis);
    }
}

class ComputadorAlugavel {
    private List<Computador> computadoresDisponíveis = new ArrayList<>();

    {
        computadoresDisponíveis.add(new Computador("AliemWare"));
        computadoresDisponíveis.add(new Computador("HP"));
    }

    //Alugar
    public Computador getComputadorDisponivel() {
        Computador c = computadoresDisponíveis.remove(0);
        System.out.println("Alugando pc: " + c);
        System.out.println("Computador Disponíveis: " + computadoresDisponíveis);
        return c;
    }

    public void devolverComputador(Computador c) {
        System.out.println("Devolvendo Computador: " + c);
        computadoresDisponíveis.add(c);
        System.out.println("Computador disponíveis: " + computadoresDisponíveis);
    }
}
