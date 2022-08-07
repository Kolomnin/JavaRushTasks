package com.javarush.task.pro.task15.task1515;

import java.nio.file.Path;
import java.util.Scanner;

/*
Абсолютный путь
Напиши код, который будет считывать с клавиатуры путь и выводить его в консоли, при этом если путь не абсолютный,
то перед выводом его нужно преобразовать к таковому.

Requirements:
1. Программа должна считать из консоли путь к файлу/папке.
2. Программа должна выводить в консоли этот путь, при необходимости преобразовывая в абсолютный.
3. Для проверки и преобразования в абсолютный должны быть использованы методы isAbsolute() и toAbsolutePath() класса Path.
4. Не используй следующие классы: File, FileInputStream, FileOutputStream, FileReader, FileWriter пакета java.io.
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Path path = Path.of(str);
        boolean abs = path.isAbsolute();
        if(!abs){
        path = Path.of(str).toAbsolutePath();
        }
        System.out.println(path);
    }
}
//        if (Path.of(str).isAbsolute()) {
//        System.out.println(str);
//        } else {
//        System.out.println(Path.of(str).toAbsolutePath());
//        }

