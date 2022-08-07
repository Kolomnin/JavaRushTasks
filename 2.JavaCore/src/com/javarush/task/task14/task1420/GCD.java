package com.javarush.task.task14.task1420;

public class GCD {
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
