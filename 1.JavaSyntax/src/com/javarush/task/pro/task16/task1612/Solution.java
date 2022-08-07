package com.javarush.task.pro.task16.task1612;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

/* 
Синтезируем LocalDateTime
В методе convert нужно преобразовать Map в Set.
Принцип преобразования:

если в sourceMap было два таких элемента:
2018-05-31=[12:43:00.615424667, 08:35:29.212766273]
1998-01-31=[07:56:59.931458499]

то в результате в множестве должно получиться три элемента:
2018-05-31T12:43:00.615424667
2018-05-31T08:35:29.212766273
1998-01-31T07:56:59.931458499

Requirements:
1. Метод convert должен преобразовать Map в Set согласно условию.
*/

public class Solution {

    public static void main(String[] args) {
        Map<LocalDate, List<LocalTime>> dateMap = DateTimeGenerator.generateDateMap();
        printCollection(dateMap.entrySet());

        Set<LocalDateTime> dateSet = convert(dateMap);
        printCollection(dateSet);
    }

    static Set<LocalDateTime> convert(Map<LocalDate, List<LocalTime>> sourceMap) {
        Set<LocalDateTime> result = new HashSet<>(); //нам надо вернуть Set<LocalDateTime>, поэтому объявляем Set

        for (Map.Entry<LocalDate, List<LocalTime>> entry : sourceMap.entrySet()) { //Здесь используем цикл for-each(). Map.Entry позволяет получить доступ
                                                                                   // к записям в карте и методом entrySet() возвращаем набор элементов коллекции.
            for (LocalTime time : entry.getValue()) {                               //Проходимся циклом for-each() по значениям  ключа методом getValue().
                result.add(LocalDateTime.of(entry.getKey(), time));                 //методом of записываем в переменную типа LocalTime полученные
            }                                                                       // методом getKey() - ключи (ключи у нас здесь даты) и значения времени
        }                                                                           //(их хранит переменная time)  и добавляем методом add элементы в Set (ссылку
                                                                                    // на которые содержит как раз result)



        return result;
    }

    static void printCollection(Collection<?> collection) {
        System.out.println("-----------------------------------------------------");
        collection.forEach(System.out::println);
    }
}