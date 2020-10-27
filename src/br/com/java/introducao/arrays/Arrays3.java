package br.com.java.introducao.arrays;

/**
 * Created by Meus Documentos on 17/09/2019.
 */
public class Arrays3 {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        int[] numeros2 = {1,2,3};
        int[] numeros3 = new int[]{1,2,3};
       //  int i =0 ;
        for(int i = 0; i < numeros2.length; i++){
            System.out.println(numeros2[i]);
        }

        for(int num : numeros3){
            System.out.println(num);
        }

    }
}
