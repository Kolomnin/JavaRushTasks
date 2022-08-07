package com.javarush.task.pro.task10.task1010;

import java.util.Objects;

/* 
Два айфона
В методе main создаются два айфона с одинаковыми параметрами.
В консоли выводится результат их сравнения. Разберись, почему сейчас результат отрицательный и сделай так,
чтобы он был положительным. Для этого тебе нужно переопределить метод equals(Iphone), который будет учитывать все параметры.
У двух равных объектов значения полей должны быть одинаковыми. Метод main не участвует в проверке.


Requirements:
1. В классе Iphone должен быть переопределен метод public boolean equals(Object).
2. Метод equals должен возвращать true для двух равных объектов типа Iphone и false — для разных.
3. Метод equals должен возвращать false, если в него передали null.
*/

public class Iphone {
    private final String model;
    private final String color;
    private final int price;

    public Iphone(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }
    // Рефлексивность. x.equals(x) всегда возвращает true
    // Симметричность. x.equals(y) обязан вернуть true, если y.equals(x) возвращает true
    // Транзитивность. Если x.equals(y) возвращает true, y.equals(z) возвращает true, тогда x.equals(z) должен вернуть true
    // Консистентность. x.equals(y) при множественном вызове метода всегда возвращает неизменно true или false, если объекты между вызовами не изменялись.
    //Условие NULL. Вызов x.equals(null) всегда должен возвращать false.

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Iphone phone = (Iphone) obj;
            return this.price == phone.price && this.color!=null && this.model!=null &&
                   this.color.equals(phone.color) && this.model.equals(phone.model);
        }

        public static void main (String[]args){
            Iphone iphone1 = new Iphone("X", "Black", 999);
            Iphone iphone2 = new Iphone("X", "Black", 999);

            System.out.println(iphone1.equals(iphone2));
        }

    }


