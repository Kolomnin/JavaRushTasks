package com.javarush.task.task15.task1525;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.javarush.task.task15.task1525.Statics.FILE_NAME;

/* 
Файл в статическом блоке
Для решения этой задачи:
Инициализируй переменную Statics.FILE_NAME полным путем к файлу с данными, который содержит несколько строк.
В статическом блоке считай из файла с именем Statics.FILE_NAME все строки и добавь их по отдельности в List lines.

Requirements:
1. Константа FILE_NAME не должна быть пустой.
2. В статическом блоке все строки из файла с именем FILE_NAME должны быть добавлены по отдельности в список lines.
3. Поле FILE_NAME НЕ должно быть final.
4. Класс Solution должен содержать список lines.
*/

public class Solution {

    public static List<String> lines = new ArrayList<String>();
    static {
        String x;
        try {
            FileReader fr = new FileReader(FILE_NAME);
            BufferedReader br = new BufferedReader(fr);
                
            while ((x= br.readLine()) != null) {
                
                lines.add(x);
            }
            br.close();
        } catch (FileNotFoundException z) {
            z.printStackTrace();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        System.out.println(lines);
    }
}
