package com.javarush.task.pro.task15.task1510;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Пишем байты в файл
У Амиго появилась задача: записать байты в файл. Он написал программу, которая считывает из
консоли путь к файлу и записывает в этот файл последовательность байтов, полученную из аргумента
метода main(String[]). Но в процессе написания программы он допустил ошибку.
Как ты уже знаешь, BufferedWriter "не работает" с байтами: для записи байтов в файл нужно
использовать метод write(Path, byte[]) класса Files.
Path можно получить используя статический метод Path.of(), в который передать путь к файлу,
считанный из консоли. Выглядит это так - Path.of(scanner.nextLine()). Помоги Амиго исправить программу.


Requirements:
1. Программа должна считать из консоли путь к файлу.
2. Программа должна записывать байты в файл.
3. Для записи байтов должен быть использован метод write(Path, byte[]) класса Files.
4. Не используй следующие классы File, FileInputStream, FileOutputStream, FileReader, FileWriter пакета java.io.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        byte[] bytes = args[0].getBytes();
        InputStream stream = System.in;
        Scanner scanner = new Scanner(stream);
        Files.write(Path.of(scanner.nextLine()), bytes);
    }
}

