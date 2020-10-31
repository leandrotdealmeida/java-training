package br.com.java.javacore.ZZEConcorrencia.test;

import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TransferQueue;

public class LinkedTransferTest {
    public static void main(String[] args) throws InterruptedException {
        TransferQueue<String> tq = new LinkedTransferQueue<>();
        System.out.println(tq.add("Japa"));
        tq.put("DevDojo");
        System.out.println(tq.offer("DevJapa"));
        System.out.println(tq.offer("DevJapa", 10, TimeUnit.MILLISECONDS));
       // tq.transfer("DevJapa");
        System.out.println(tq.tryTransfer("DevDojo"));
        System.out.println(tq.tryTransfer("DevDojo", 1, TimeUnit.SECONDS));
        System.out.println(tq.remainingCapacity());

        System.out.println(tq.element());
        System.out.println(tq.peek());
        System.out.println(tq.poll());
        System.out.println(tq.poll(10, TimeUnit.MILLISECONDS));
        System.out.println(tq.remove());
        System.out.println(tq.take());

    }
}
