package com.javarush.task.pro.task16.task1604;

import java.util.Calendar;
import java.util.GregorianCalendar;

/* 
День недели рождения твоего
Проинициализируй переменную birthDate объектом GregorianCalendar с датой своего рождения.
Реализуй метод getDayOfWeek(Calendar calendar), чтобы он возвращал русское название дня недели аргумента calendar.
Помни, что в григорианском календаре неделя начинается с воскресенья.

Requirements:
1. Переменная birthDate должна быть проинициализирована при объявлении.
2. Метод getDayOfWeek(Calendar calendar) должен возвращать день недели аргумента calendar.
*/

public class Solution {

    static Calendar birthDate = new GregorianCalendar(1987,Calendar.AUGUST,4);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Calendar calendar) {

        String result = "";
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        switch (dayOfWeek) {
            case 1:
                return "воскресенье";
            case 2:
                return "понедельник";
            case 3:
                return "вторник";
            case 4:
                return "среда";
            case 5:
                return "четверг";
            case 6:
                return "пятница";
            case 7:
                return "суббота";
        }
        return result;
    }
}
