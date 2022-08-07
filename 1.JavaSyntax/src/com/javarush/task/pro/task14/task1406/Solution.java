package com.javarush.task.pro.task14.task1406;

import java.util.Scanner;

/* 
Купи слона
Разберись, что делает программа.
В блоке catch выведи на экран переменную answer и брось дальше пойманное исключение.

Requirements:
1. После ввода с клавиатуры "ок" программа должна завершаться исключением SecurityException.
2. В блоке catch в консоли должна выводиться переменная answer,
чтобы после ввода с клавиатуры "ок" все ранее введенные строки вывелись в консоли в обратном порядке.
3. В блоке catch должно выбрасываться пойманное исключение, а не создаваться новое.
*/

class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        buyElephant(null, scanner);
    }

    static void buyElephant(String answer, Scanner scanner) {
        if (answer == null) {
            System.out.println("Купи слона");
        } else if (answer.toLowerCase().equals("ок")) {
            System.out.println("Так-то лучше :) Список твоих отговорок:");
            throw new SecurityException();
        } else {
            System.out.println("Все говорят \"" + answer + "\", а ты купи слона");
        }

        answer = scanner.nextLine();

        try {
            buyElephant(answer, scanner);
        } catch (Exception e) {
            System.out.println(answer);
            throw e;
        }
    }
}