package com.javarush.games.minigames.mini12;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;

import java.util.ArrayList;
import java.util.List;

/* 
Работаем со списком координат
Перед тобой — поле 10x10, которое заполняется белым цветом.
Тебе нужно реализовать метод onMouseLeftClick(int, int), который будет закрашивать нажатую клетку оранжевым цветом,
и если в списке cells нет таких координат, добавлять их.
Также тебе нужно реализовать метод onMouseRightClick(int, int), который должен закрашивать нажатую клетку белым цветом,
и если координаты этой клетки есть в списке cells — удалить эту клетку из списка.

ements:
1. Реализуй метод onMouseLeftClick(int, int) согласно условию.
2. Реализуй метод onMouseRightClick(int, int) согласно условию.
*/

public class FillGame extends Game {
    private final List<Cell> cells = new ArrayList<>();

    @Override
    public void initialize() {
        setScreenSize(10, 10);
        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                setCellColor(x, y, Color.WHITE);
            }
        }
    }

    @Override
    public void onMouseLeftClick(int x, int y) {
        setCellColor(x, y, Color.ORANGE);
        final Cell cell = new Cell(x, y);
        if(!cells.contains(cell)){
            cells.add(cell);
        }
    }

    @Override
    public void onMouseRightClick(int x, int y) {
        setCellColor(x, y, Color.WHITE);
        Cell cell = new Cell(x,y);
        cells.remove(cell);
    }
}
