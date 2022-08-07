package com.javarush.task.pro.task13.task1307;

import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

/* 
Изучаем методы класса Collections, часть 2
В классе Solution объявлены методы: reverse(ArrayList<Integer>), sort(ArrayList<Integer>),
rotate(ArrayList<Integer>, int), shuffle(ArrayList<Integer>). Тебе нужно разобраться, что делают методы,
переписать их реализацию, используя при этом только соответствующие методы класса Collections.


Requirements:
1. В классе Solution должен быть публичный статический метод reverse(ArrayList<Integer>) с типом возвращаемого значения void.
2. В классе Solution должен быть публичный статический метод sort(ArrayList<Integer>) с типом возвращаемого значения void.
3. В классе Solution должен быть публичный статический метод rotate(ArrayList<Integer>, int) с типом возвращаемого значения void.
4. В классе Solution должен быть публичный статический метод shuffle(ArrayList<Integer>) с типом возвращаемого значения void.
5. Метод reverse(ArrayList<Integer>) нужно переписать, используя метод reverse класса Collections.
6. Метод sort(ArrayList<Integer>) нужно переписать, используя метод sort класса Collections.
7. Метод rotate(ArrayList<Integer>, int) нужно переписать, используя метод rotate класса Collections.
8. Метод shuffle(ArrayList<Integer>) нужно переписать, используя метод shuffle класса Collections.
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static void reverse(ArrayList<Integer> list) {
        Collections.reverse(list);
    }

    public static void sort(ArrayList<Integer> list) {
        Collections.sort(list);
    }

    public static void rotate(ArrayList<Integer> list, int distance) {
        Collections.rotate(list, distance);
    }

    public static void shuffle(ArrayList<Integer> list) {
        Collections.shuffle(list);
    }
}
