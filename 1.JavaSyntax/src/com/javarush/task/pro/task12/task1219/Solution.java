package com.javarush.task.pro.task12.task1219;

import java.util.ArrayList;
import java.lang.String;

/* 
Двойные фигурные скобки
В методе main создается список ArrayList<String>, присваивается переменной var strings и заполняется пятью элементами.
Нужно переписать код, не изменяя логику, используя двойные фигурные скобки.


Requirements:
1. Список strings должен заполняться пятью элементами в двойных фигурных скобках.
*/

public class Solution {

    public static void main(String[] args) {
        var strings = new ArrayList<String>()
        {{
                add("Так");
                add("тоже");
                add("можно");
                add("делать");
                add("!");
        }};
    }
}
