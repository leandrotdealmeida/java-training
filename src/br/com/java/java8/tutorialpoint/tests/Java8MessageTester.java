package br.com.java.java8.tutorialpoint.tests;

public class Java8MessageTester {

    final static String salutation = "Hello! ";

    public static void main(String args[]) {
        GreetingService greetService1 = message ->
                System.out.println(salutation + message);
        greetService1.sayMessage("Dev Japa");
    }

    interface GreetingService {
        void sayMessage(String message);
    }
}