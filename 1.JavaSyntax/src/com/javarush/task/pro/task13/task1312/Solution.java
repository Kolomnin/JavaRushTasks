package com.javarush.task.pro.task13.task1312;

import java.util.ArrayList;
import java.util.HashMap;

/* 
ArrayList vs HashMap
В классе Solution есть метод getProgrammingLanguages, который возвращает список языков программирования.
Тебе нужно переписать этот метод, чтобы он возвращал HashMap<Integer, String>.
Ключом в этой коллекции будет индекс элемента в ArrayList.


Requirements:
1. В классе Solution должен быть публичный статический метод getProgrammingLanguages с
типом возвращаемого значения HashMap<Integer, String>.
2. Метод getProgrammingLanguages() должен возвращать HashMap заполненным в соответствии с списком.
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getProgrammingLanguages());
    }

    public static HashMap<Integer,String> getProgrammingLanguages() {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(0, "Java");
        map.put(1, "Kotlin");
        map.put(2, "Go");
        map.put(3, "Javascript");
        map.put(4, "Typescript");
        map.put(5, "Python");
        map.put(6, "PHP");
        map.put(7, "C++");
        return map;
    }

}
