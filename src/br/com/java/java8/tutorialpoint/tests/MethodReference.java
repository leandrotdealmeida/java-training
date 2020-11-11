package br.com.java.java8.tutorialpoint.tests;

import java.util.List;
import java.util.ArrayList;

public class MethodReference {

    public static void main(String args[]) {
        List names = new ArrayList();

        names.add("Mahesh");
        names.add("Suresh");
        names.add("Ramesh");
        names.add("Naresh");
        names.add("Kalpesh");

        names.forEach(System.out::println);
    }
}
