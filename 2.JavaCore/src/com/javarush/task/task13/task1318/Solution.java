package com.javarush.task.task13.task1318;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Чтение файла
В этой задаче тебе нужно:
Считать с консоли путь к файлу.
Вывести в консоли (на экран) содержимое файла.
Освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.

Requirements:
1. Программа должна считывать c консоли путь к файлу.
2. Программа должна выводить на экран содержимое файла.
3. Поток чтения из файла (FileInputStream) должен быть закрыт.
4. BufferedReader также должен быть закрыт.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream stream = new FileInputStream(console.readLine());
        Scanner scan = new Scanner(stream);
        while (scan.hasNextLine())
        {
            Object x = scan.nextLine();
            System.out.println(x);
        }

        console.close();
        stream.close();
    }
}
// решение от разрабов
//    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//    String sourceFileName = reader.readLine();
//    FileInputStream fileInputStream = new FileInputStream(sourceFileName);
//
//    Scanner scanner = new Scanner(fileInputStream);
//    StringBuilder builder = new StringBuilder();
//
//        while (scanner.hasNextLine()) {
//                builder.append(scanner.nextLine()).append("\n");
//                }
//
//                System.out.print(builder.toString());
//
//                scanner.close();
//                reader.close();
//                }
//                }