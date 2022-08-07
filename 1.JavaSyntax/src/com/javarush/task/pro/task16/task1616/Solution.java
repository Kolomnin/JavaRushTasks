package com.javarush.task.pro.task16.task1616;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.TreeSet;

/* 
Тренировка временных зон
Что общего у всех временных зон и Пекина?
Правильно! Они позволят нам потренироваться в использовании классов ZoneId и ZonedDateTime :)

Реализуй два метода:

в методе getSortedZones верни множество TreeSet всех временных зон;
в методе getBeijingTime верни текущую дату и время в Пекине (временная зона для него — "Asia/Shanghai").

Requirements:
1. Метод getSortedZones должен вернуть множество всех временных зон.
2. Метод getBeijingDateTime должен вернуть текущую дату и время в Пекине.
*/

public class Solution {

    public static void main(String[] args) {
        TreeSet<String> sortedZones = getSortedZones();
        System.out.println(sortedZones.size());
        System.out.println(sortedZones.first());
        System.out.println(sortedZones.last());

        System.out.println(getBeijingDateTime());
    }

    static TreeSet<String> getSortedZones() {
        return new TreeSet<>(ZoneId.getAvailableZoneIds()); //создаем экземпляр TreeSet и getAvailableZoneIds(), который возвращает множество всех известных на текущий момент временных зон.
    }

    static ZonedDateTime getBeijingDateTime() {
        return ZonedDateTime.now(ZoneId.of("Asia/Shanghai")); //При создании объекта ZonedDateTime нужно вызвать у него статический метод now() и передать в него объект ZoneId.
    }
}
