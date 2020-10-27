package br.com.java.introducao.arrays;

public class ExercicioDiagonalPrincipal {
    public static void main(String[] args) {
        int[][] arrayMulti = new int[3][3];
        arrayMulti[0][0] = 2;
        arrayMulti[0][1] = 4;
        arrayMulti[0][2] = 6;
        arrayMulti[1][0] = 6;
        arrayMulti[1][1] = 8;
        arrayMulti[1][2] = 10;
        arrayMulti[2][0] = 12;
        arrayMulti[2][1] = 14;
        arrayMulti[2][2] = 16;
        int multiplicacao = 1;
        for (int i = 0; i < arrayMulti.length; i++) {
            for (int j = 0; j < arrayMulti[i].length; j++) {
                if (i == j) {
                    multiplicacao = multiplicacao * arrayMulti[i][j];
                }


            }
        }
        System.out.println(multiplicacao);
    }
}
