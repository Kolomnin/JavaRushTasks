package com.javarush.task.pro.task16.task1607;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;

/* 
Освоение нового API
В классе Solution реализуй 4 метода:

метод nowExample должен вернуть текущую дату;
остальные методы должны вернуть дату 12 сентября 2020 года, но разными способами.

Requirements:
1. Метод nowExample должен вернуть текущую дату.
2. Метод ofExample должен вернуть дату 12 сентября 2020 года с помощью метода LocalDate.of.
3. Метод ofYearDayExample должен вернуть дату 12 сентября 2020 года с помощью метода LocalDate.ofYearDay.
4. Метод ofEpochDayExample должен вернуть дату 12 сентября 2020 года с помощью метода LocalDate.ofEpochDay.
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(nowExample());
        System.out.println(ofExample());
        System.out.println(ofYearDayExample());
        System.out.println(ofEpochDayExample());
    }

    static LocalDate nowExample() {
        LocalDate today = LocalDate.now();

        return today;
    }

    static LocalDate ofExample() {
        LocalDate date = LocalDate.of(2020, Month.SEPTEMBER, 12);

        return date;
    }

    static LocalDate ofYearDayExample() {
        LocalDate date = LocalDate.ofYearDay(2020, 256);

        return date;
    }

    static LocalDate ofEpochDayExample() {
        LocalDate date = LocalDate.ofEpochDay(18517);

        return date;
    }
}
