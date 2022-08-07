package com.javarush.task.pro.task15.task1523;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

/* 
Получение информации по API
Твоя задача — обратиться к публичному API в интернете: отправить и получить данные.
Напиши программу, которая будет обращаться по ссылке к публичному API в интернете, отправляя туда данные, получать ответные данные и выводить их на экран.

Подсказки:

Используй метод openConnection() класса URL.
Используй методы setDoOutput(true) и getOutputStream() класса URLConnection.
Если не знаешь, какой API использовать, бери http://httpbin.org/post.

Requirements:
1. Программа должна выводить полученную информацию на экран.
2. В программе должен вызываться метод openConnection() класса URL.
3. В программе должны вызываться методы setDoOutput(true), getOutputStream() и getInputStream() класса URLConnection.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
       try {
          URL url = new URL("https://www.uecrus.com/");
          URLConnection connection = url.openConnection();
          connection.setDoOutput(true);
          OutputStream output = connection.getOutputStream();
          output.write(1);
          InputStream input = connection.getInputStream();
          BufferedReader reader = new BufferedReader(new InputStreamReader(input));
          while (reader.ready()) {
              System.out.println(reader.readLine());
          }
      } catch (IOException ignored) {
//           URLConnection connection = url.openConnection();
//           connection.setDoOutput(true);
//
//           try (OutputStream output = connection.getOutputStream();
//                PrintStream sender = new PrintStream(output)) {
//               sender.println("Привет");
//           }
//
//           try (InputStream input = connection.getInputStream();
//                BufferedReader reader = new BufferedReader(new InputStreamReader(input))) {
//               while (reader.ready()) {
//                   System.out.println(reader.readLine());

       }
    }
}

