package com.javarush.task.pro.task16.task1601;

import java.util.Calendar;
import java.util.Date;

/* 
Лишь бы не в понедельник :)
Проинициализируй переменную birthDate объектом Date с датой своего рождения.
Реализуй метод getDayOfWeek(Date date), чтобы он возвращал русское название дня недели аргумента date.

Requirements:
1. Переменная birthDate должна быть проинициализирована при объявлении.
2. Метод getDayOfWeek(Date date) должен возвращать русское название дня недели.
*/

public class Solution {

    static Date birthDate = new Date(87, Calendar.AUGUST, 4);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Date date) {
        String result = "";
        int day = date.getDay();
        return switch (day) {
            case 0 -> "воскресенье";
            case 1 -> "понедельник";
            case 2 -> "вторник";
            case 3 -> "среда";
            case 4 -> "четверг";
            case 5 -> "пятница";
            case 6 -> "суббота";
            default -> result;
        };
    }
}
