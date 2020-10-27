package br.com.java.javacore.ZZEConcorrencia.test;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;

final class Pessoa {
    private final String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

public class CopyOnWriteTest implements Runnable {
    private Set<Integer> set = new CopyOnWriteArraySet<>();
    //private List<Integer> list = Collections.synchronizedList(new ArrayList<>());
    private List<Integer> list = new CopyOnWriteArrayList<>();

    public CopyOnWriteTest() {
        for (int i = 0; i < 9000 ; i++) {
            list.add(i);
        }
    }

    @Override
    public void run() {
        Iterator<Integer> iterator = list.iterator();
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        while(iterator.hasNext()) {
            System.out.println(Thread.currentThread().getName() + " "+ iterator.next());
        }
    }

    public List<Integer> getList() {
        return list;
    }

    public static void main(String[] args) {
        CopyOnWriteTest ct = new CopyOnWriteTest();
        Thread t1 = new Thread(ct);
        Thread t2 = new Thread(ct);
        Thread removedor = new Thread(new RemoveMembros(ct.getList()));
        t1.start();
        t2.start();
        removedor.start();
    }

    private static class RemoveMembros implements Runnable {
        private List<Integer> list;

        public RemoveMembros(List<Integer> list) {
            this.list = list;
        }

        @Override
        public void run() {
            for (int i = 0; i < 500; i++) {
                System.out.println(Thread.currentThread().getName() + " removeu: "+ list.remove(i));
            }
        }
    }
}
