package com.javarush.task.pro.task15.task1506;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/* 
Фейсконтроль
Напиши программу, которая считывает из консоли имя текстового файла, далее читает символы из этого файла
(используй метод readAllLines(Path) класса Files) и выводит на экран все, за исключением точки, запятой и пробела.

Requirements:
1. Программа должна считать с консоли путь к файлу.
2. Программа должна вывести в консоль содержимое файла согласно условию.
3. Для чтения строк из файла должен быть использован метод readAllLines(Path) класса Files.
4. Не используй следующие классы: File, FileInputStream, FileOutputStream, FileReader, FileWriter пакета java.io.
*/

public class Solution {
    public static void main(String[] args) {

        try (BufferedReader scan = new BufferedReader(new InputStreamReader(System.in))) {
            List<String> lines = Files.readAllLines(Paths.get(scan.readLine()));
            for (String buf : lines) {
                char[] buffer = buf.toCharArray();
                for (int i = 0; i < buffer.length; i++) {
                    if (buffer[i] == '.' || buffer[i] == ' ' || buffer[i] == ',') {
                        continue;
                    } else {
                        System.out.print(buffer[i]);
                    }
                }
            }
        }
        catch(IOException e){
                System.out.println("Что-то пошло не так: " + e);
            }
        }
    }



