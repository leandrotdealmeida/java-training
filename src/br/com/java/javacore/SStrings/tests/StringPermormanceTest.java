package br.com.java.javacore.SStrings.tests;

public class StringPermormanceTest {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(30000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto String "+ (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuilder(300000);
         fim = System.currentTimeMillis();
        System.out.println("Tempo gasto String Builder "+ (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuffer(300000);
         fim = System.currentTimeMillis();
        System.out.println("Tempo gasto Buffer "+ (fim - inicio) + "ms");

    }

    private static void concatString(int tam){
        String string = "";
        for(int i = 0; i < tam;i++){
            string +=i;
        }
    }

    private static void concatStringBuilder(int tam){
        StringBuilder stringBuilder = new StringBuilder(tam);
        for(int i = 0; i < tam;i++){
           stringBuilder.append(i);
        }
    }

    private static void concatStringBuffer(int tam){
        StringBuffer stringBuffer = new StringBuffer(tam);
        for(int i = 0; i < tam;i++){
            stringBuffer.append(i);
        }
    }
}
