package ru.teachmeskills.lesson3;

import java.util.Scanner;

public class Condition {

    protected static final int WARM_TEMPERATURE = -5;
    protected static final int NORMAL_TEMPERATURE = -20;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 1 для решения задачи с порой года (оператор switch case)");
        System.out.println("Введите 2 для решения задачи с порой года (оператор if/else if)");
        System.out.println("Введите 3 для решения задачи с температурой");
        int choice = scanner.nextInt();
        int monthNumber;
        switch (choice) {
            case 1:
                monthNumber = scanner.nextInt();
                switch (monthNumber) {
                    case 12:
                    case 1:
                    case 2:
                        System.out.println("Зима");
                        break;
                    case 3:
                    case 4:
                    case 5:
                        System.out.println("Весна");
                        break;
                    case 6:
                    case 7:
                    case 8:
                        System.out.println("Лето");
                        break;
                    case 9:
                    case 10:
                    case 11:
                        System.out.println("Осень");
                        break;
                    default:
                        System.out.println("Некорректно задан номер месяца");
                }
                break;
            case 2:
                monthNumber = scanner.nextInt();
                if (monthNumber == 12 || monthNumber == 1 || monthNumber == 2) {
                    System.out.println("Зима");
                } else if (monthNumber >= 3 && monthNumber <= 5) {
                    System.out.println("Весна");
                } else if (monthNumber >= 6 && monthNumber <= 8) {
                    System.out.println("Лето");
                } else if (monthNumber >= 9 && monthNumber <= 11) {
                    System.out.println("Осень");
                } else {
                    System.out.println("Введено некорректное значение месяца");
                }
                break;
            case 3:
                int temperature = scanner.nextInt();
                if (temperature > WARM_TEMPERATURE) {
                    System.out.println("Тепло");
                } else if (temperature > NORMAL_TEMPERATURE && temperature <= WARM_TEMPERATURE) {
                    System.out.println("Нормально");
                } else if (temperature < NORMAL_TEMPERATURE) {
                    System.out.println("Холодно");
                } else {
                    System.out.println("Некорректные данные");
                }
                break;
            case 4:
                for (int number = 10; number <= 20; number++) {
                    int squareNumber = number * number;
                    System.out.println("Квадрат числа " + number + ": " + squareNumber);
                }
            case 5:
                for (int i = 0; i <= 10; i++) {
                    for (int j = 0; j <= 10; j++) {
                        System.out.println(i + "*" + j + "=" + i * j);
                    }
                    System.out.println();
                }
            case 6:
                for (char letter = 'A'; letter < 'Z'; letter++) {
                    System.out.println(letter);
                }
                //7 14 21 28 35 42 49 56 63 70 77 84 91 98
            case 7:
                for (int i = 7; i < 100; i+=7) {
                    System.out.print(i + " ");
                }
                System.out.println();
        }
    }
}
