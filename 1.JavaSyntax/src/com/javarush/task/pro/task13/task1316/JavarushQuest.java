package com.javarush.task.pro.task13.task1316;

/* 
Перечислим квесты Javarush
В enum JavarushQuest хранится список квестов. Твоя задача — получить массив всех элементов в методе main
(используй метод values()) и вывести порядковый номер каждого из них (используй метод ordinal()) с новой строки.

Requirements:
1. В методе main получи список всех констант из enum JavarushQuest с помощью метода values().
2. В методе main выведи порядковый номер каждого элемента с новой строки, используя метод ordinal().
*/

public enum JavarushQuest {
    JAVA_SYNTAX,
    JAVA_CORE,
    JAVA_MULTITHREADING,
    JAVA_COLLECTIONS,
    CS_50,
    ANDROID,
    GAMES
}
