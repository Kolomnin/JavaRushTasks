package com.javarush.task.task16.task1617;

/* 
Отсчет на гонках
1. Разберись, что делает программа.
2. Реализуй логику метода run так, чтобы каждую секунду через пробел
выдавался отсчет начиная с numSeconds до 1, а потом слово [Марш!] (см примеры).
3. Если нить работает 3.5 секунды или более, прерви ее методом interrupt и внутри нити выведи в консоль слово [Прервано!].

Пример для numSeconds=4 :
"4 3 2 1 Прервано!"

4. Если нить работает менее 3.5 секунд, она должна завершиться сама.
Пример для numSeconds=3 :
"3 2 1 Марш!"

PS: метод sleep выбрасывает InterruptedException.

Requirements:
1. Метод run класса RacingClock должен содержать цикл.
2. Объект класса RacingClock должен каждую секунду уменьшать значение переменной numSeconds на единицу.
3. Метод main должен вызывать Thread.sleep(3500).
4. Метод main должен вызывать метод interrupt у объекта clock.
5. Если numSeconds равно 3, то программа должна вывести "3 2 1 Марш!".
6. Если numSeconds равно 4, то программа должна вывести "4 3 2 1 Прервано!".
*/

public class Solution {
    public static volatile int numSeconds = 4;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        Thread.sleep(3500);
        clock.interrupt();
        //add your code here - добавь код тут
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            while (numSeconds >=0) {
                System.out.print(numSeconds + " ");
                if (numSeconds == 1) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println("Прервано!");
                        break;
                    }
                    System.out.println("Марш!");
                    break;
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                   e.printStackTrace();
                }
                numSeconds--;
            }
            //add your code here - добавь код тут
        }
    }
}
// Правильное решение
//public class Solution {
//    public static volatile int numSeconds = 3;
//
//    public static void main(String[] args) throws InterruptedException {
//        RacingClock clock = new RacingClock();
//        Thread.sleep(3500);
//        clock.interrupt();
//    }
//
//    public static class RacingClock extends Thread {
//        public RacingClock() {
//            start();
//        }
//
//        public void run() {
//            try {
//                while (!isInterrupted() && numSeconds >= 0) {
//                    if (numSeconds == 0) {
//                        System.out.println("Марш!");
//                    } else {
//                        System.out.print(numSeconds + " ");
//                        Thread.sleep(1000);
//                    }
//                    numSeconds--;
//                }
//            } catch (InterruptedException e) {
//                if (numSeconds != -1) {
//                    System.out.println("Прервано!");
//                }
//            }
//        }
//    }
//}