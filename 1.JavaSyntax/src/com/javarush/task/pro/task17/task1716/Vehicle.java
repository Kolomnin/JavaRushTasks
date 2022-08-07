package com.javarush.task.pro.task17.task1716;

/* 
Дорожное движение
Классы Car и Bus имплементируют интерфейс Vehicle. При этом имплементации некоторых его методов у них сходятся.
Реализуй эти методы как default в самом интерфейсе Vehicle, а из классов Car и Bus их убери.

Requirements:
1. Интерфейс Vehicle должен реализовывать метод default void start().
2. Интерфейс Vehicle должен реализовывать метод default void stop().
3. Класс Car не должен имплементировать методы void start() и void stop().
4. Класс Bus не должен имплементировать методы void start() и void stop().
*/

public interface Vehicle {
    default void start() {
        System.out.println("Начинаю движение.");
    }
    void move();
    default void stop(){
        System.out.println("Останавливаюсь.");
    }
}
