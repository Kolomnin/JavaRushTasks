package com.javarush.task.pro.task15.task1501;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Программа считывает с консоли строку и выводит ее на экран в нижнем регистре. Не меняя функциональности программы,
перепиши код с использованием try-with-resources. Вынеси в круглые скобки создание объектов с внешними ресурсами.
Не забудь удалить ненужные вызовы метода close().

Requirements:
1. Программа должна считать с консоли строку и вывести ее на экран в нижнем регистре.
2. В программе должен использоваться оператор try-with-resources согласно условию.
3. У объектов с внешними ресурсами не должен быть явно вызван метод close().
*/

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            String line = reader.readLine();
            System.out.println(line.toLowerCase());

        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}
