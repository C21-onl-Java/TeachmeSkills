package ru.teachmeskills.lesson3;

import java.util.Scanner;

public class Lesson3 {

    private static final String CONSTANT_NUMBER = "";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String text;
        // Тернарный оператор
        text = number > 5 ? "Число больше 5" :
                number == 2 ? "Меньше 5 равно 2" : "Меньше 5";
        // вложенный условный оператор if/els
        if (number > 5) {
            text = "Число больше 5";
        } else {
            if (number == 2) {
                text = "Меньше 5 и равно 2";
            } else {
                text = "Меньше 5";
            }
        }
        System.out.println(text);
        if (number >= 3 && number < 5) {
            if (number % 2 == 0) {
                System.out.println("Данное число лежит в диапазоне 3 до 5 и является четным");
            } else {
                System.out.println("Данное число лежит в диапазоне 3 до 5 и является нечетным");
            }
        } else if (number == 3) {
            System.out.println("Данное число меньше 3");
        } else {
            System.out.println("Данное число меньше 3");
        }

        int secondNumber = scanner.nextInt();
        switch (secondNumber) {
            case 1:
            case 2:
            case 3:
                System.out.println("Число от 1 до 3");
                break;
        }

        // цикл for
         String word = scanner.nextLine();
        for (int i = 0; i < 10; i++) {

        }

/*        while (true) {
            System.out.println("Word");
        }*/
        if (number < 5) {
            // nothing
        } else {
            System.out.println("");
        }

        /*        System.out.println("=======================");

        do {
            System.out.println("Word");
            number++;
        } while (true);*/

        // foreach
        int[] array = new int[5];

        for (int element : array) {
            System.out.println(element);
        }

        // label for outer loop
        outer:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 1)
                    break outer;
                System.out.println(" value of j = " + j);
            }
        }
    }



    public static int showAnswer(int number) {
        if (number < 10) {
            System.out.println("Данное число меньше 10");
        }
        return number;
    }
}