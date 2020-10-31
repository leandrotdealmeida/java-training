package br.com.java.java8.schoolofnet.lambdas;

public class Lambda {

    public static void main(String[] args) {

        Runnable run  = new Runnable() {
            @Override
            public void run() {
                System.out.println("Java 8 Training!!");

            }
        };

        new Thread(run).start();

        Runnable run1 = () -> System.out.println("Hello Java 8");
        new Thread(run1).start();
    }
}
