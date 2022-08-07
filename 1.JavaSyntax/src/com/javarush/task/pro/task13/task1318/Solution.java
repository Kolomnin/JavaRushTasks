package com.javarush.task.pro.task13.task1318;

/* 
Следующий месяц, пожалуйста
В классе Solution реализуй метод getNextMonth, который должен возвращать следующий месяц,
а если передан последний месяц, возвращать первый. Используй методы values и ordinal.
Метод main не участвует в проверке.

Requirements:
1. Реализуй метод public static Month getNextMonth(Month): он должен работать согласно условию.
2. В методе getNextMonth должны использоваться методы ordinal() и values().
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getNextMonth(Month.DECEMBER));
        System.out.println(getNextMonth(Month.JULY));
    }

    public static Month getNextMonth(Month month) {
        int index = month.ordinal();
        Month[] nameMonth = Month.values();
        if (month.ordinal() == 11)
        return Month.JANUARY;
        return nameMonth[index+1];
    }
}
