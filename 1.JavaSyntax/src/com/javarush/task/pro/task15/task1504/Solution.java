package com.javarush.task.pro.task15.task1504;

import java.io.*;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Enumeration;
import java.util.Scanner;
import java.util.Objects;

/* 
Перепутанные байты
Напиши программу, которая считывает с консоли путь к файлу1 и путь к файлу2. Далее все байты из файла1 записывает в
файл2, но при этом меняет их местами по такому принципу: первый со вторым, третий с четвертым, и т.д.
Если последний байт в файле1 нечетный, то пишем его в файл2 как есть. Для чтения и записи файлов используй методы
newInputStream и newOutputStream класса Files.

Requirements:
1. Программа должна считать с консоли пути к файлам.
2. Программа должна переписывать байты из одного файла в другой согласно условию.
3. Для чтения и записи файлов должны быть использованы методы newInputStream и newOutputStream класса Files.
4. Потоки для чтения и записи должны быть закрыты.
5. Не используй следующие классы File, FileInputStream, FileOutputStream, FileReader, FileWriter пакета java.io.
*/

public class Solution {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);
             InputStream in = Files.newInputStream(Path.of(scanner.nextLine()));
             OutputStream out = Files.newOutputStream(Path.of(scanner.nextLine()))) {

            byte[] buffer = in.readAllBytes();
            byte[] buffet1 = new byte[buffer.length];
            for (byte i = 0; i < buffer.length; i+=2) {
                if (i < buffer.length - 1) {
                    buffet1[i] = buffer[i + 1];
                    buffet1[i + 1] = buffer[i];
                }
                else {
                    buffet1[i] = buffer[i];
                }
            }
            out.write(buffet1);
        }
        catch(IOException e){
                System.out.println("Что-то пошло не так: " + e);

            }

        }
    }



