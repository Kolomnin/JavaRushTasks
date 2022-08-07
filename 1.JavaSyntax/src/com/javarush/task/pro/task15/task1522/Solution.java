package com.javarush.task.pro.task15.task1522;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/* 
Получение информации по API
Твоя задача — обратиться к публичному API в интернете и получить данные. Напиши программу,
которая будет обращаться по ссылке к публичному API в интернете, получать данные и выводить их на экран.

Подсказки:

Используй метод openStream() класса URL.
Если не знаешь, какой API использовать, можешь запросить у нас на сервере список проектов-игр:
https://javarush.ru/api/1.0/rest/projects

Requirements:
1. Программа должна выводить полученную информацию на экран.
2. В программе должен вызываться метод openStream() класса URL.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
       try {
           URL url_line_api = new URL("http://jservice.io");
           InputStream input = url_line_api.openStream();
           byte[] buffer = input.readAllBytes();
           String str = new String(buffer);
           System.out.println(str);

       }catch (Exception e){
           System.out.println("Something went wrong: " + e);
       }
    }
}