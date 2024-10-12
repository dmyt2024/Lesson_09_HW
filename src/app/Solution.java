package app;

import java.util.Random;

public class Solution {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] array2d = new int[4][4];
        int sumEvenRow = 0;
        int sumOddRow = 0;
        long multEvenCollumn = 1L;
        long multOddCollumn = 1L;
        int sumDiag_1 = 0;
        int sumDiag_2 = 0;
        int sum1Row = 0;
        int sum2Row = 0;
        int sum3Row = 0;
        int sum4Row = 0;
        int sum1Collumn = 0;
        int sum2Collumn = 0;
        int sum3Collumn = 0;
        int sum4Collumn = 0;

        System.out.println("Матриця 4х4:");

        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[i].length; j++) {
                array2d[i][j] = random.nextInt(50) + 1;

                System.out.print(array2d[i][j] + ",  ");

                if (i % 2 == 0) {
                    sumEvenRow += array2d[i][j];
                } else {
                    sumOddRow += array2d[i][j];
                }
                if (j % 2 == 0) {
                    multEvenCollumn *= array2d[i][j];
                } else {
                    multOddCollumn *= array2d[i][j];
                }
                if (i == j) {
                    sumDiag_1 += array2d[i][j];
                } else if ((i + j) == array2d[i].length - 1) {
                    sumDiag_2 += array2d[i][j];
                }
                if (i == 0) {
                    sum1Row += array2d[i][j];
                } else if (i == 1) {
                    sum2Row += array2d[i][j];
                } else if (i == 2) {
                    sum3Row += array2d[i][j];
                } else {
                    sum4Row += array2d[i][j];
                }
                if (j == 0) {
                    sum1Collumn += array2d[i][j];
                } else if (j == 1) {
                    sum2Collumn += array2d[i][j];
                } else if (j == 2) {
                    sum3Collumn += array2d[i][j];
                } else {
                    sum4Collumn += array2d[i][j];
                }

            }

            System.out.println();

        }
        System.out.println();
        System.out.println("Сума елементів у парних рядках (рядок 0, 2): " + sumEvenRow);
        System.out.println("Сума елементів у непарних рядках (рядок 1, 3): " + sumOddRow);
        System.out.println("Добуток елементів у парних стовпцях (стовбець 0, 2): " + multEvenCollumn);
        System.out.println("Добуток елементів у непарних стовпцях (стовбець 1, 3): " + multOddCollumn);
        System.out.println();
        if (sum1Row == sum2Row && sum2Row == sum3Row && sum3Row == sum4Row &&
                sum1Collumn == sum2Collumn && sum2Collumn == sum3Collumn
                && sum3Collumn == sum4Collumn && sumDiag_1 == sumDiag_2) {
            System.out.println("Матриця є магічним квадратом.");

        } else {
            System.out.println("Матріця не є магічним квадратом.");
        }
    }
}
