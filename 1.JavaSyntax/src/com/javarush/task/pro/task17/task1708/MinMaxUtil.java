package com.javarush.task.pro.task17.task1708;

/* 
Минимальное и максимальное
В этой задаче тебе предстоит создать универсальный инструмент для поиска минимальных и максимальных чисел.
В классе MinMaxUtil создай публичные статические методы min() и max(), которые в качестве аргументов принимают
целочисленные (тип int) значения и возвращают минимальное и максимальное из них соответственно.

Каждый из методов должен быть перегружен так, чтобы была возможность вызвать метод с двумя, тремя, четырьмя и пятью параметрами.
В общем, необходимо создать 8 методов, — 4 для min() и 4 для max().
Все аргументы методов должны быть типа int.

Requirements:
1. В классе MinMaxUtil должно быть создано 4 перегруженных метода min() в соответствии с условием задания.
2. В классе MinMaxUtil должно быть создано 4 перегруженных метода max() в соответствии с условием задания.
3. Методы min() должны возвращать минимальное из переданных чисел.
4. Методы max() должны возвращать максимальное из переданных чисел.
*/

import java.util.ArrayList;
import java.util.List;


public class MinMaxUtil {
    public static int max(int a, int b) {
        return Math.max(a, b);
    }

    public static int min(int a, int b) {
        return Math.min(a, b);
    }

    public static int max(int a, int b, int c) {
        List<Integer> arraysList = new ArrayList<>();
        arraysList.add(a);
        arraysList.add(b);
        arraysList.add(c);
        int min = arraysList.get(0);
        int max = arraysList.get(0);

        for (Integer i : arraysList) {
            if (i < min)
                min = i;
            if (i > max)
                max = i;
        }
        return max;
    }

    public static int min(int a, int b, int c) {
        List<Integer> arraysList = new ArrayList<>();
        arraysList.add(a);
        arraysList.add(b);
        arraysList.add(c);
        int min = arraysList.get(0);
        int max = arraysList.get(0);

        for (Integer i : arraysList) {
            if (i < min)
                min = i;
            if (i > max)
                max = i;
        }
        return min;
    }

    public static int max(int a, int b, int c, int d) {
        List<Integer> arraysList = new ArrayList<>();
        arraysList.add(a);
        arraysList.add(b);
        arraysList.add(c);
        arraysList.add(d);
        int min = arraysList.get(0);
        int max = arraysList.get(0);

        for (Integer i : arraysList) {
            if (i < min)
                min = i;
            if (i > max)
                max = i;
        }
        return max;
    }

    public static int min(int a, int b, int c, int d) {
        List<Integer> arraysList = new ArrayList<>();
        arraysList.add(a);
        arraysList.add(b);
        arraysList.add(c);
        arraysList.add(d);
        int min = arraysList.get(0);
        int max = arraysList.get(0);

        for (Integer i : arraysList) {
            if (i < min)
                min = i;
            if (i > max)
                max = i;
        }
        return min;
    }

    public static int max(int a, int b, int c, int d, int f) {
        List<Integer> arraysList = new ArrayList<>();
        arraysList.add(a);
        arraysList.add(b);
        arraysList.add(c);
        arraysList.add(d);
        arraysList.add(f);
        int min = arraysList.get(0);
        int max = arraysList.get(0);

        for (Integer i : arraysList) {
            if (i < min)
                min = i;
            if (i > max)
                max = i;
        }
        return max;
    }

    public static int min(int a, int b, int c, int d, int f) {
        List<Integer> arraysList = new ArrayList<>();
        arraysList.add(a);
        arraysList.add(b);
        arraysList.add(c);
        arraysList.add(d);
        arraysList.add(f);
        int min = arraysList.get(0);
        int max = arraysList.get(0);

        for (Integer i : arraysList) {
            if (i < min)
                min = i;
            if (i > max)
                max = i;
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println(min(5,4));
    }
}


