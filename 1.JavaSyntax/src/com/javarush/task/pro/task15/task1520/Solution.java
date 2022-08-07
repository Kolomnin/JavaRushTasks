package com.javarush.task.pro.task15.task1520;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Перемещение файлов
Напиши программу, которая будет считывать с клавиатуры пути к двум директориям и перемещать файлы из одной
директории в другую (только файлы, директории игнорируй). Используй соответствующие методы класса Files:
newDirectoryStream(), isRegularFile() или isDirectory(), move().

Requirements:
1. Программа должна считать из консоли пути к директориям.
2. В программе должны быть использованы соответствующие методы класса Files согласно условию.
3. Программа должна перемещать файлы из одной директории в другую согласно условию.
4. Не используй следующие классы: File, FileInputStream, FileOutputStream, FileReader, FileWriter пакета java.io.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path sourceDirectory = Path.of(scanner.nextLine());
        Path targetDirectory = Path.of(scanner.nextLine());
        DirectoryStream <Path> files = Files.newDirectoryStream(sourceDirectory);
        for (Path i : files) {
            if(Files.isRegularFile(i)){
                Path resolve = targetDirectory.resolve(i.getFileName());
                Files.move(i, resolve);

            }
        }
    }
}

