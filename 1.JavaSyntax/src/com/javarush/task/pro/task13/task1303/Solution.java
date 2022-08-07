package com.javarush.task.pro.task13.task1303;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* 
Выводим в консоли элементы множества
В классе Solution есть метод print(HashSet<String>), который должен выводить в
консоли все элементы множества, используя iterator().
Метод main не участвует в проверке.


Requirements:
1. В классе Solution должен быть публичный статический метод print(HashSet<String>)
с типом возвращаемого значения void.
2. Метод print(HashSet<String>) должен работать согласно условию.
*/

public class Solution {

    public static void print(HashSet<String> words) {
        Iterator<String> it = words.iterator();
         while (it.hasNext()){
            String str = it.next();
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        HashSet<String> words = new HashSet<>(Arrays.asList("Программированию обычно учат на примерах.".split(" ")));
        print(words);
    }
}
