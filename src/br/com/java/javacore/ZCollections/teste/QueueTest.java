package br.com.java.javacore.ZCollections.teste;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        queue.add("C");
        queue.add("A");
        queue.add("D");
        queue.add("E");
        System.out.println(queue);
        System.out.println(queue.remove("D"));
        System.out.println(queue.size());
        System.out.println(queue);

    }
}
