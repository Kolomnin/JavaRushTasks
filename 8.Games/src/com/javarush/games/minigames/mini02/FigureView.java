package com.javarush.games.minigames.mini02;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;

/* 
Отображаем корабль
Попробуем отрисовать простую фигуру на игровом поле. Тебе нужно переопределить метод initialize() класса Game,
и в этом методе задать размер игрового поля (5х7) с помощью метода setScreenSize(int, int).
Также нужно вызвать метод showShip(), который отрисовывает корабль.

Requirements:
1. В классе FigureView должен быть переопределен метод initialize().
2. В методе initialize() должен быть вызван метод setScreenSize(int, int) с аргументами 5 и 7.
3. В методе initialize() должен быть вызван метод showShip().
4. Метод showShip() должен вызываться после setScreenSize(int, int).
5. Работу метода showShip() не изменять.
6. Поле SHIP класса FigureView не изменять.
*/

public class FigureView extends Game {

    public static final int[][] SHIP = new int[][]{
            {0, 0, 7, 0, 0},
            {0, 7, 7, 7, 0},
            {0, 7, 0, 7, 0},
            {0, 7, 7, 7, 0},
            {0, 7, 0, 7, 0},
            {7, 7, 7, 7, 7},
            {7, 0, 7, 0, 7},
    };

    @Override
    public void initialize() {
        setScreenSize(5,7);
        showShip();
    }


    public void showShip() {
        for (int i = 0; i < SHIP.length; i++) {
            for (int j = 0; j < SHIP[0].length; j++) {
                setCellColor(j, i, Color.values()[SHIP[i][j]]);
            }
        }
    }
}
