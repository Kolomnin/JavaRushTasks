package com.javarush.task.pro.task15.task1519;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Поверхностное копирование
Напиши программу, которая будет считывать с клавиатуры пути к двум директориям и копировать файлы
из одной директории в другую (только файлы, директории игнорируй).
Используй соответствующие методы класса Files: newDirectoryStream(), isRegularFile() или isDirectory(), copy().

Requirements:
1. Программа должна считать из консоли путь к директории.
2. В программе должны быть использованы соответствующие методы класса Files: newDirectoryStream(), isRegularFile() или isDirectory(), copy().
3. Программа должна копировать файлы из одной директории в другую согласно условию.
4. Не используй следующие классы: File, FileInputStream, FileOutputStream, FileReader, FileWriter пакета java.io.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path sourceDirectory = Path.of(scanner.nextLine());
        Path targetDirectory = Path.of(scanner.nextLine());

            DirectoryStream<Path> files = Files.newDirectoryStream(sourceDirectory);
        for (Path i: files) {
            if (Files.isRegularFile(i)) {
                Path resolve = targetDirectory.resolve(i.getFileName());
                Files.copy(i, resolve);
            }
        }
    }
}

