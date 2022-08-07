package com.javarush.task.pro.task16.task1614;

import java.time.Instant;

/* 
Конец времен
В классе Solution реализуй три метода:
в методе getMaxFromMilliseconds верни максимальный Instant, который можно получить с помощью метода ofEpochMilli(long milliseconds);
в методе getMaxFromSeconds верни максимальный Instant, который можно получить с помощью метода ofEpochSecond(long seconds);
в методе getMaxFromSecondsAndNanos верни максимальный Instant, который можно получить с помощью метода ofEpochSecond(long seconds, long nanos).

Requirements:
1. Метод getMaxFromMilliseconds нужно реализовать согласно условию.
2. Метод getMaxFromSeconds нужно реализовать согласно условию.
3. Метод getMaxFromSecondsAndNanos нужно реализовать согласно условию.
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getMaxFromMilliseconds());
        System.out.println(getMaxFromSeconds());
        System.out.println(getMaxFromSecondsAndNanos());
    }

    static Instant getMaxFromMilliseconds() {
        return Instant.ofEpochMilli(Long.MAX_VALUE);
    }
    static Instant getMaxFromSeconds() {
        return Instant.ofEpochSecond(Instant.MAX.getEpochSecond());
    }

    static Instant getMaxFromSecondsAndNanos() {
        return Instant.ofEpochSecond(Instant.MAX.getEpochSecond(), 999999999);
    }
}
