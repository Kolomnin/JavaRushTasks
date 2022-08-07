package com.javarush.task.task13.task1326;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* 
Сортировка четных чисел из файла
В этой задаче тебе нужно:
Ввести имя файла с консоли.
Прочитать из него набор чисел.
Вывести в консоли только четные, отсортированные по возрастанию.
Пример ввода:
5
8
-2
11
3
-5
2
10

Пример вывода:
-2
2
8
10


Requirements:
1. Программа должна считывать данные с консоли.
2. Программа должна создавать FileInputStream для введенной с консоли строки.
3. Программа должна выводить данные на экран.
4. Программа должна вывести на экран все четные числа, считанные из файла, отсортированные по возрастанию.
5. Программа должна закрывать поток чтения из файла — FileInputStream.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String readConsole = console.readLine();
        Scanner readFromFile = new Scanner (new FileInputStream(readConsole));

        List <Integer> list = new ArrayList<>();
        while (readFromFile.hasNext()){
            int real = readFromFile.nextInt();
            if(real % 2 == 0)
                list.add(real);
        }
        Collections.sort(list);
        for (int i: list) {
            System.out.println(i);
        }
        readFromFile.close();
    }
}
