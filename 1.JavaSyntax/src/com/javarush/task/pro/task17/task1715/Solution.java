package com.javarush.task.pro.task17.task1715;

import java.util.ArrayList;
import java.util.List;

/* 
Вилларибо и Виллабаджо.
В деревне Вилларибо есть струнный оркестр, а в деревне Виллабаджо — клавишный.
Как-то раз повозки с музыкантами из двух деревень столкнулись на перекрестке, и все смешалось в кучу.
Помоги артистам разобрать свои инструменты. И естественно, после этого оба оркестра должны дать концерт.

Для этого:
в методе createKeyboardOrchestra() добавь в список orchestra один орган и три пианино;
в методе createStringedOrchestra() добавь в список orchestra две скрипки и одну гитару;
метод playOrchestra() должен вызывать метод play() у всех элементов списка orchestra.

Requirements:
1. Метод createKeyboardOrchestra() должен добавлять в список orchestra один объект класса Organ и три объекта Piano.
2. Метод createStringedOrchestra() должен добавлять в список orchestra два объекта класса Violin и один объект Guitar.
3. Метод playOrchestra() должен вызывать метод play() у всех элементов списка orchestra.
*/

public class Solution {
    static List<MusicalInstrument> orchestra = new ArrayList<>();

    public static void main(String[] args) {
        createKeyboardOrchestra();
        createStringedOrchestra();
        playOrchestra();
    }

    public static void createKeyboardOrchestra() {
        Organ organ = new Organ();
        orchestra.add(organ);
        Piano piano = new Piano();
        orchestra.add(piano);
        Piano piano1 = new Piano();
        orchestra.add(piano1);
        Piano piano2 = new Piano();
        orchestra.add(piano2);
    }

    public static void createStringedOrchestra() {
        Violin violin = new Violin();
        orchestra.add(violin);
        Violin violin1 = new Violin();
        orchestra.add(violin1);
        Guitar guitar = new Guitar();
        orchestra.add(guitar);
    }

    public static void playOrchestra() {
        for (Object play : orchestra) {
            MusicalInstrument music = (MusicalInstrument) play;
            music.play();
//            for (MusicalInstrument musicalInstrument : orchestra) {
//                musicalInstrument.play();
        }
    }
}
