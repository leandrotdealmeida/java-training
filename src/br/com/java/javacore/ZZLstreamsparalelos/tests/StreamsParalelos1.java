package br.com.java.javacore.ZZLstreamsparalelos.tests;

import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamsParalelos1 {

    public static void main(String[] args) {
        long num = 10_000_000_000L;
        somaFor(num);
//        somaStreamIterate(num);
//        somaParallelStreamIterate(num);
        somaRangeClosedStream(num);
        somaRangeClosedParallelStream(num);
        System.out.println(Runtime.getRuntime().availableProcessors());
       // System.setProperty("java.util.concurrent.ForkJoinPool.commom.parallelism", "12");
    }

    private static void somaFor(long num) {
        System.out.println("For");
        long result = 0;
        long init = System.currentTimeMillis();
        for (long i = 1L; i <= num; i++) {
            result += i;
        }
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    private static void somaStreamIterate(long num) {
        System.out.println("Stream Sequencial");
        long result = 0;
        long init = System.currentTimeMillis();
        result = Stream.iterate(1L, i -> i + 1).limit(num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    private static void somaParallelStreamIterate(long num) {
        System.out.println("Stream Paralelo");
        long result = 0;
        long init = System.currentTimeMillis();
        result = Stream.iterate(1L, i -> i + 1).parallel().limit(num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    private static void somaRangeClosedStream(long num) {
        System.out.println("RangeClosedStream");
        long result = 0;
        long init = System.currentTimeMillis();
        result = LongStream.rangeClosed(1L, num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    private static void somaRangeClosedParallelStream(long num) {
        System.out.println("RangeClosedPArallelStream");
        long result = 0;
        long init = System.currentTimeMillis();
        result = LongStream.rangeClosed(1L, num).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }
}
