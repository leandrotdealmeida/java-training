package br.com.java.estruturadados;

public class ContinueTest {

    public static void main(String[] args) {

        int[] a = {1,2,3,4} ;

        countInteger( a , 4) ;

    }

    public static int countInteger(int[] a, int x) {
        int count = 0;
        for (int i=0; i<a.length ; i++) {
            if(a[i] != x) continue;
            count++;
        }
        return count;
    }
}
