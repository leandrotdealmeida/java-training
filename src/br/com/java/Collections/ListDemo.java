package br.com.java.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        //list can only store String objects
        List<String> listString = new ArrayList<>();

        //list can store any type of object
        List listAllObjects = new ArrayList();

        Student student = new Student();
        student.setRoll(101);
        student.setName("Jahpa");

        //1. Add Data in List
        listString.add("John");
        listString.add("Jenni");
        listString.add("Juha");
        listString.add("Juna");
        listString.add("Jiva");
        //listString.add(1.0); //error

        listAllObjects.add("Johaah");
        listAllObjects.add(1.0);
        listAllObjects.add(student);

        //print reference to list -> shall prig  elements int the list the way we added in a sequence
        System.out.println("List 1:" + listString);
        System.out.println("List 2:" + listAllObjects);

        //2. Get the element  from the list
        String name = listString.get(2);
        System.out.println("Name is:"+ name);

        //3 . Update element in List
        listString.set(2, "Fiona");
        System.out.println("Lista 1 now is:" + listString);

        //4. Remove element in List
        listString.remove(2);
        System.out.println("List after remove is:" + listString);

        //listString.clear(); -> remove all

        if(listString.contains("John")){
            System.out.println("John is i the list");
        }

        //5. Interate in ArrayList
        for (String str: listString) {
            System.out.println(str);
        }

        System.out.println("====================");

        System.out.println("Interate with Iterator");
        Iterator<String> itr = listString.iterator();
        //System.out.println(itr.next());
        //System.out.println(itr.next());
        //System.out.println(itr.next());
        System.out.println("-------------------");
        while(itr.hasNext()) {
            String str = itr.next();
            System.out.println(str);
            if(str.equals("Juna")) {
                itr.remove();
            }
        }
        System.out.println("================");
        System.out.println("List1 after iteration is: "+ listString);

    }
}
