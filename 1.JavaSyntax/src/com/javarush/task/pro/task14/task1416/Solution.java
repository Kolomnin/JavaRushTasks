package com.javarush.task.pro.task14.task1416;

/* 
Логирование стектрейса
В методе main перехвати исключение и выведи его стектрейс.

Requirements:
1. Метод main должен вызывать метод dangerousMethod.
2. Метод dangerousMethod должен бросать Exception.
3. Метод main должен выводить на экран стектрейс перехваченного исключения.
*/

public class Solution {

    public static void main(String[] args) {
        try{
            dangerousMethod();
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }

    static void dangerousMethod() throws Exception {
        throw new Exception("Mu-ha-ha!");
    }
}
