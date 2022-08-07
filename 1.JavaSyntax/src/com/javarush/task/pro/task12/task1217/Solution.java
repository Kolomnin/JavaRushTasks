package com.javarush.task.pro.task12.task1217;

/* 
Назад в прошлое
В классе Solution есть поле intArray, геттер и сеттер для него, и метод main с объявленными в нем переменными.
Тебе нужно заменить типы переменных с var на конкретный тип объекта (изменять названия и инициализацию объектов нельзя),
а также починить геттер и сеттер поля intArray.

Пример:
var console = new Scanner(System.in);
Заменить на:
Scanner console = new Scanner(System.in);


Requirements:
1. Замени типы переменных c var на конкретный тип объекта.
2. Почини геттер и сеттер для поля intArray.
*/

public class Solution {
    private int[] intArray = new int[4];

    public int[] getIntArray() {
        return intArray;
    }

    public void setIntArray(int[] intArray) {
        this.intArray = intArray;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String string = new String("Hello");
        StringBuilder stringBuilder = new StringBuilder();
    }
}
