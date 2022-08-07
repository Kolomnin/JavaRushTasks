package com.javarush.task.pro.task13.task1322;

public class Solution {

    /*Типы многоугольников
    В классе Solution есть метод getShapeNameByCountOfCorners(int), который возвращает название многоугольника в
    зависимости от количества углов. Твоя задача — переписать метод, используя только оператор switch.

    Requirements:
            1. Результат работы метода getShapeNameByCountOfCorners(int) не должен измениться.
            2. В методе getShapeNameByCountOfCorners(int) должен использоваться только оператор switch.*/

    public static void main(String[] args) {
        System.out.println(getShapeNameByCountOfCorners(3));
        System.out.println(getShapeNameByCountOfCorners(5));
        System.out.println(getShapeNameByCountOfCorners(1));
    }

    public static String getShapeNameByCountOfCorners(int countOfCorner) {
        String shape;

        switch (countOfCorner) {
            case 3:
                shape = "Треугольник";
                break;
            case 4:
                shape = "Четырехугольник";
                break;
            case 5:
                shape = "Пятиугольник";
                break;
            case 6:
                shape = "Шестиугольник";
                break;
            case 7:
                shape = "Семиугольник";
                break;
            case 8:
                shape = "Восьмиугольник";
                break;
            default:
                shape = "Другая фигура";
        }
        return shape;
    }
}








//        if (countOfCorner == 3) {
//            shape = "Треугольник";
//        } else if (countOfCorner == 4) {
//            shape = "Четырехугольник";
//        } else if (countOfCorner == 5) {
//            shape = "Пятиугольник";
//        } else if (countOfCorner == 6) {
//            shape = "Шестиугольник";
//        } else if (countOfCorner == 7) {
//            shape = "Семиугольник";
//        } else if (countOfCorner == 8) {
//            shape = "Восьмиугольник";
//        } else {
//            shape = "Другая фигура";
//        }
//        return shape;

