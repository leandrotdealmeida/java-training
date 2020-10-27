package br.com.java.javacore.ZZEConcorrencia.test;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ConcorrenciaColecoesTest {
    public static void main(String[] args) {
        // ConcurrentHashMap
        // ConcurrentLinkedDeque
        // ConcurrentLinkedQueue
        // ConcurrentSkipMap
        // ConcurrentSkipListSet

        Map<String, String> map = new HashMap<>();
        map.put("1","1");
        map.put("1","2");
        System.out.println(map.get("1"));

        ConcurrentMap<String, String> mapc = new ConcurrentHashMap<>();
        mapc.put("1","1");
        mapc.putIfAbsent("1","2");
        System.out.println(mapc.get("1"));
    }
}
