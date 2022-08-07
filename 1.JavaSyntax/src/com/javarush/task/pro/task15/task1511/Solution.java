package com.javarush.task.pro.task15.task1511;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/* 
Пишем символы в файл
Есть программа, которая считывает из консоли путь к файлу и записывает в этот файл последовательность символов,
полученную из аргумента метода main(String[]).
Твоя задача — исправить ошибку, чтобы массив символов можно было записать в файл.
Для записи символов в файл нужно использовать объект BufferedWriter, полученный в результате
вызова метода newBufferedWriter(Path) класса Files.


Requirements:
1. Программа должна считать из консоли путь к файлу.
2. Программа должна переписывать символы в файл.
3. Для записи символов должен быть использован BufferedWriter, который возвращается в результате вызова метода newBufferedWriter(Path) класса Files.
4. Поток для записи должен быть закрыт.
5. Не используй следующие классы: File, FileInputStream, FileOutputStream, FileReader, FileWriter пакета java.io.
*/

public class Solution {

    public static void main(String[] args) {
        char[] chars = args[0].toCharArray();
        try (InputStream stream = System.in;
             Scanner scanner = new Scanner(stream)) {
            BufferedWriter bufferedWriter = Files.newBufferedWriter(Path.of(scanner.nextLine()));
            bufferedWriter.write(chars);
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}


