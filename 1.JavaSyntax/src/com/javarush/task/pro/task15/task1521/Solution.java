package com.javarush.task.pro.task15.task1521;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Временное сохранение файла
Напиши код, который будет считывать с клавиатуры ссылку на файл в интернете, скачивать его и сохранять во временный файл.
Используй методы createTempFile(null, null) и write(Path, byte[]) класса Files, а также метод openStream() класса URL.

Requirements:
1. Программа должна считать из консоли ссылку на файл в интернете (строку).
2. Программа должна скачать файл по ссылке и сохранить его во временный файл.
3. В программе должны быть использованы методы классов Files и URL согласно условию.
4. Не используй следующие классы: File, FileInputStream, FileOutputStream, FileReader, FileWriter пакета java.io.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
      try {
          URL url = new URL(scanner.nextLine());
          InputStream input = url.openStream();
          byte[] buffer = input.readAllBytes();
          Path tempFile = Files.createTempFile(null, null);
          Files.write(tempFile, buffer);
          System.out.println(tempFile);
      } catch (Exception e) {
          System.out.println("попробуй еще раз " + e);
      }
    }
}