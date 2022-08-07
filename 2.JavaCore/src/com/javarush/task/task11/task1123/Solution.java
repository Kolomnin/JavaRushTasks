package com.javarush.task.task11.task1123;

//Минимакс
//        Реализуй метод, который возвращает объект класса Pair. В поле x этого объекта должно содержаться
//        минимальное число, а в поле y - максимальное число из массива inputArray.
//
//        Requirements:
//        1. Программа не должна считывать данные с клавиатуры.
//        2. Класс Pair не изменяй.
//        3. Метод main не изменяй.
//        4. Допиши реализацию метода getMinimumMaximumPair: он должен возвращать пару из минимума и максимума.
//        5. Программа должна вывести правильный результат.
//        6. Метод getMinimumMaximumPair не должен изменять массив inputArray.

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair result = getMinimumMaximumPair(data);

        System.out.println("The minimum is " + result.x);
        System.out.println("The maximum is " + result.y);
    }

    public static Pair getMinimumMaximumPair(int[] inputArray) {
        if (inputArray == null || inputArray.length == 0) {
            return new Pair(null, null);
        }
        int x = Arrays.stream(inputArray).min().getAsInt();
        int y = Arrays.stream(inputArray).max().getAsInt();
//        int x = inputArray[0];
//        for (int i = 0; i < inputArray.length; i++) {
//            if (inputArray[i] < x)
//                x = inputArray[i];
//        }
//        int y = inputArray[0];
//        for (int i = 0; i < inputArray.length; i++) {
//            if (inputArray[i] >= y)
//                y = inputArray[i];
//        }

        return new Pair(x, y);
    }

    public static class Pair {
        public Integer x;
        public Integer y;

        public Pair(Integer x, Integer y) {
            this.x = x;
            this.y = y;
        }
    }
}
