package com.company;

import java.util.Scanner;

//счиаить с клавы число,возводить в квадрат и выводить на экран  до тех пор пока не введено слово йес
public class Main {

    public static void main(String[] args)
        throws java.io.IOException {
        int number;
        int sqrtValue;
        String wordBreaker = "Yes";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        number = scanner.nextInt();
        sqrtValue = number;
        do {
            sqrtValue *= number;
            System.out.println("Возведение в квадрат:" + sqrtValue);

            String input = scanner.nextLine();
            System.out.println("DEBUG input value: " + input);
            if ((input).equalsIgnoreCase(wordBreaker)) {
                break;
            }
        } while (true);
    }
}
