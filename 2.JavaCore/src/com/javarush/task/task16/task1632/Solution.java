package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Клубок
1. Создай 5 различных своих нитей (наследников класса Thread):
1.1. Нить 1 должна бесконечно выполняться;
1.2. Нить 2 должна выводить "InterruptedException" при возникновении исключения InterruptedException;
1.3. Нить 3 должна каждые полсекунды выводить "Ура";
1.4. Нить 4 должна реализовать интерфейс Message, при вызове метода showWarning нить должна останавливаться;
1.5. Нить 5 должна читать с консоли числа пока не введено слово "N", а потом вывести в консоль сумму введенных чисел.
2. В статическом блоке добавь свои нити в List<Thread> threads в перечисленном порядке.
3. Нити не должны стартовать автоматически.

Подсказка:
Нить 4 можно проверить методом isAlive()

Requirements:
1. Статический блок класса Solution должен создавать и добавлять 5 нитей в список threads.
2. Нити из списка threads не должны стартовать автоматически.
3. Нить 1 из списка threads должна бесконечно выполняться.
4. Нить 2 из списка threads должна выводить "InterruptedException" при возникновении исключения InterruptedException.
5. Нить 3 из списка threads должна каждые полсекунды выводить "Ура".
6. Нить 4 из списка threads должна реализовать интерфейс Message, при вызове метода showWarning нить должна останавливаться.
7. Нить 5 из списка threads должна читать с консоли числа пока не введено слово "N", а потом вывести в консоль сумму введенных чисел.
*/

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new Thread0());
        threads.add(new Thread1());
        threads.add(new Thread2());
        threads.add(new Thread3());
        threads.add(new Thread4());
    }

    public static void main(String[] args) {
    }

    public static class Thread0 extends Thread {
        public void run() {
            while (true) {
            }
        }
    }

    public static class Thread1 extends Thread {
        public void run() {
            while (true) {
                try {
                    throw new InterruptedException();
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }
    }

    public static class Thread2 extends Thread {
        public void run() {
            while (true) {
                System.out.println("Ура");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();

                }
            }
        }
    }

        public static class Thread3 extends Thread implements Message {
            public void run() {
                while (!isInterrupted()) {
                }
            }

            public void showWarning() {
                this.interrupt();
            }
        }

        public static class Thread4 extends Thread {
            public void run() {
                BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
                int sum = 0;
                while (true) {
                    try {
                        String number = read.readLine();
                        if (number.equals("N"))
                            break;
                        sum += Integer.parseInt(number);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(sum);
            }
        }
    }


