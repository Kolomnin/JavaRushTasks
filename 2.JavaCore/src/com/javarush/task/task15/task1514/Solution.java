package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
В статическом блоке инициализируй labels пятью различными парами ключ-значение.

Requirements:
1. В классе Solution должен быть только один метод — main().
2. В классе Solution должно быть объявлено статическое поле labels типа Map.
3. Поле labels должно быть заполнено 5 различными парами ключ-значение в статическом блоке.
4. Метод main должен выводить содержимое labels на экран.
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    public static void main(String[] args) {
        System.out.println(labels);
    }

    static {
        labels.put(1.1, "low");
        labels.put(1.2, "saw");
        labels.put(1.3, "hash");
        labels.put(1.4, "doc");
        labels.put(1.5, "code");

    }
}
