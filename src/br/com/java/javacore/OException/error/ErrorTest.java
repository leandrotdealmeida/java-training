package br.com.java.javacore.OException.error;

public class ErrorTest {
    public static void main(String[] args) {
        stackOverFlowError();
    }

    public static void stackOverFlowError(){
        stackOverFlowError();
    }
}