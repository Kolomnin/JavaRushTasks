package com.javarush.task.task14.task1420;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
НОД
Давай найдем наибольший общий делитель (НОД). Для этого:
Введи с клавиатуры 2 целых положительных числа.
Выведи в консоли наибольший общий делитель.

Requirements:
1. Программа должна считывать с клавиатуры 2 строки.
2. Программа должна выводить данные на экран.
3. Программа должна выводить на экран наибольший общий делитель (НОД) чисел, считанных с клавиатуры, и успешно завершаться.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

        System.out.println(gcd(a, b));

    }
    public static int gcd(int a, int b) {
        int result = 0;
        for (int i = 1; i < Math.max(a, b); i++) {
            if (a % i == 0 & b % i == 0) {
                result = i;
            }

        }
//        while (a != b) {
//            if (a > b) {
//                a = a - b;
//            } else {
//                b = b - a;
//            }
//        }
//        return a;
        return result;
    }

}

