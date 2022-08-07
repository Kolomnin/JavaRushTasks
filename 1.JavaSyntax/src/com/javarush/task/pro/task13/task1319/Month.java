package com.javarush.task.pro.task13.task1319;

/* 
Месяцы в сезоне
В enum Month добавь 4 метода: getWinterMonths(), getSpringMonths(), getSummerMonths(), getAutumnMonths() которые будут возвращать массив с тремя месяцами.


Requirements:
1. Публичный статический метод getWinterMonths() должен возвращать массив с зимними месяцами.
2. Публичный статический метод getSpringMonths() должен возвращать массив с весенними месяцами.
3. Публичный статический метод getSummerMonths() должен возвращать массив с летними месяцами.
4. Публичный статический метод getAutumnMonths() должен возвращать массив с осенними месяцами.
*/

public enum Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    public static Month[] getWinterMonths() {
        return new Month[] {DECEMBER, JANUARY, FEBRUARY};
    }
    public static Month[] getSpringMonths() {
        return  new Month[] {MARCH, APRIL, MAY};
    }
    public static Month[] getSummerMonths() {
        return new Month[] {JUNE, JULY, AUGUST};
    }
    public static Month[] getAutumnMonths() {
        return new Month[] {SEPTEMBER, OCTOBER, NOVEMBER};
    }

}
