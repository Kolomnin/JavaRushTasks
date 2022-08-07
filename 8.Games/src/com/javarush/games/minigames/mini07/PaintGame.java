package com.javarush.games.minigames.mini07;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;

/* 
Работа с мышью
Ознакомимся с методами, которые вызываются при нажатии кнопок мыши и с их помощью разукрасим поле.

В методе initialize() задай размеры поля 5х5 и закрась каждую клетку белым цветом.
Переопредели метод onMouseLeftClick(int, int) класса Game, чтобы он разукрашивал зеленым цветом (Color.GREEN)
клетку по полученным координатам.
Переопредели метод onMouseRightClick(int, int) класса Game, чтобы он разукрашивал оранжевым цветом (Color.ORANGE)
клетку по полученным координатам.

Requirements:
1. Метод initialize() должен задать размер поля 5x5 и зарисовать каждую клетку белым цветом.
2. В методе onMouseLeftClick(int, int) клетка по переданным координатам должна закрашиваться в зеленый цвет.
3. В методе onMouseRightClick(int, int) клетка по переданным координатам должна закрашиваться в оранжевый цвет.
*/

public class PaintGame extends Game {

    @Override
    public void initialize() {
        setScreenSize(5,5);
        showGrid(false);
        for (int x = 0; x < 5; x++) {
            for (int y = 0; y < 5; y++) {
                setCellColor(x,y, Color.WHITE);
            }
        }
    }
    @Override
    public void onMouseLeftClick(int x, int y) {
    setCellColor(x,y,Color.GREEN);
    }
    @Override
    public void onMouseRightClick(int x, int y) {
    setCellColor(x,y,Color.ORANGE);
    }
}
