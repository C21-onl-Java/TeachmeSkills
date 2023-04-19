package ru.teachmeskills.lesson5;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Lesson5 {

    public static void main(String[] args) {
//        int[][] array = new int[5][6];

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int rowCount = scanner.nextInt();
        int columnCount = scanner.nextInt();
        int[][] array = new int[rowCount][columnCount];
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < columnCount; j++) {
                array[i][j] = random.nextInt(10);
            }
            System.out.println(Arrays.toString(array[i]));
        }

        for (int i = 0; i < rowCount; i++) {
            System.out.print(array[i][i] + " ");
        }

        System.out.println();

        for (int i = rowCount - 1, x = 0; i >= 0 && x < rowCount; i--, x++) {
            System.out.print(array[x][i] + " ");
        }

        for (int i = 0; i < array.length; i++) {
            Arrays.sort(array[i]);
        }

        System.out.println(Arrays.deepToString(array));




/*//        Object[][] objectArray = new Object[5][6];

        Random random = new Random();
//        for (var i = 0; i < array.length; i++) {
//            for (var j = 0; j < array[i].length; j++) {
//                array[i][j] = random.nextInt(100);
//            }
//            Arrays.sort(array[i]);
//            System.out.println(Arrays.toString(array[i]));
//        }
//
//        for (var i = 0; i < array.length; i++) {
//            for (var j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + " ");
//            }
//            System.out.println();
//        }

        int [][] multipleDimArray = new int[3][];
        multipleDimArray[0] = new int[5];
        multipleDimArray[1] = new int[3];
        multipleDimArray[2] = new int[1];
        for (int i = 0; i < multipleDimArray.length; i++) {
            for (int j = 0; j < multipleDimArray[i].length; j++) {
                multipleDimArray[i][j] = random.nextInt(20);
            }
            System.out.println(Arrays.toString(multipleDimArray[i]));
        }

        int[][][] arrayThreeDim = new int[3][3][3];
        for (int i = 0; i < arrayThreeDim.length; i++) {
            for (int j = 0; j < arrayThreeDim[i].length; j++) {
                for (int x = 0; x < arrayThreeDim[i][j].length; x++) {
                    arrayThreeDim[i][j][x] = random.nextInt(100);
                }
            }
        }

        // 0 0 0 0 0 1
        // 0 0 0 0 0 2
        // 0 0 0 0 0 3
        // 0 0 0 0 0 4
        // 0 1 2 3 4*/

    }

    private void showResult(int number) {
        System.out.println("Hello");
        if (number % 2 == 0) {
            return;
        }
        System.out.println("");
    }

    private int getNumber(int number) {
        System.out.println();
        return number * 2;
    }
}
