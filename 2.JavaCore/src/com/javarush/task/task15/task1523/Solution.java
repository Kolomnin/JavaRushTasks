package com.javarush.task.task15.task1523;

/* 
Перегрузка конструкторов
Чтобы решить эту задачу:
Создай 4 конструктора с разными модификаторами доступа в классе Solution.
В отдельном файле создай класс SubSolution и сделай его потомком класса Solution.
Внутри класса SubSolution создай конструкторы командой Alt+Insert -> Constructors.
Исправь модификаторы доступа конструкторов в SubSolution так, чтобы получилось 3 разных (все, кроме private).

Requirements:
1. В классе SubSolution должно содержаться 3 различных конструктора.
2. В классе Solution должно содержаться 4 различных конструктора.
3. В классе Solution должны быть объявлены конструкторы со всеми возможными модификаторами доступа.
4. В классе SubSolution должны быть объявлены конструкторы со всеми возможными модификаторами доступа, кроме private.
5. Класс Solution должен быть родителем класса SubSolution.
*/

public class Solution {
    public static void main(String[] args) {

    }
    public Solution() {

    }
    private Solution(int x) {

    }
    protected Solution(int x, int y) {

    }
    Solution(int x, int y, int z) {

    }
}


