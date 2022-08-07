package com.javarush.task.pro.task15.task1507;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/* 
Пропускаем не всех
Напиши программу, которая считывает из консоли имя текстового файла, далее читает строки из этого файла
(используй метод readAllLines(Path) класса Files) и выводит их на экран через одну, начиная с первой.

Requirements:
1. Программа должна считать из консоли путь к файлу.
2. Программа должна вывести в консоли содержимое файла согласно условию.
3. Для чтения строк из файла нужно использовать метод readAllLines(Path) класса Files.
4. Не используй следующие классы: File, FileInputStream, FileOutputStream, FileReader, FileWriter пакета java.io.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        List<String> lines = Files.readAllLines(Paths.get(scan.readLine()));
        int count = 1;
        for (String i : lines) {
            if (count % 2 != 0) {
                System.out.println(i);
            }
            count++;
        }
    }
}
//for (int i = 0; i < lines.size(); i += 2) { решение в 2 строки
//        System.out.println(lines.get(i));
//        }
//        }
//        }



