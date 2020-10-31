package br.com.java.javacore.ZCollections.teste;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        //Map<String, String> map = new HashMap<>(); //sem ordem
        Map<String, String> map = new LinkedHashMap<>(); //ordenado
        map.put("teclado", "teclado");
        map.put("mouse", "mouse");
        map.put("vc", "você");
        map.put("vc", "voce");
//        for (String key : map.values()) {
//            System.out.println(key);
//        }

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
