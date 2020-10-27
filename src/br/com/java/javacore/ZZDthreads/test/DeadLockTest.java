package br.com.java.javacore.ZZDthreads.test;

public class DeadLockTest {
    private static Object lock1 = new Object();
    private static Object lock2 = new Object();

    public static class ThreadExemplo1 extends Thread {
        public void run() {
            synchronized (lock1) {
                System.out.println("Thread1: Segurando lock 1");

                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread1: Esperando lock 2");
            }
            synchronized (lock2) {
                System.out.println("Thread 1: segurando lock 1 e lock 2");
            }
        }
    }

    public static class ThreadExemplo2 extends Thread {
        public void run() {
            synchronized (lock1) {
                System.out.println("Thread2: Segurando lock 2");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread2: Esperando lock 1");
            }
            synchronized (lock2) {
                System.out.println("Thread 2: segurando lock 2 e lock 1");
            }
        }
    }



    public static void main(String[] args) {
       new ThreadExemplo1().start();
       new ThreadExemplo2().start();


    }
}
