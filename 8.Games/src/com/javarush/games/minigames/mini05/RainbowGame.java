package com.javarush.games.minigames.mini05;

import com.javarush.engine.cell.Game;
import com.javarush.engine.cell.Color;

/* 
Цвета радуги
Поработаем с методом setCellColor(int, int, Color), который будет разукрашивать клетку по переданным координатам.
Приступим к отрисовке радуги. Необходимо создать игровое поле размером 10x7 в методе initialize() и разукрасить
каждую строку разными цветами, используя метод setCellColor(int, int, Color). Порядок сверху вниз должен быть следующим:
Color.RED
Color.ORANGE
Color.YELLOW
Color.GREEN
Color.BLUE
Color.INDIGO
Color.VIOLET

Requirements:
1. В классе RainbowGame должен быть переопределен метод initialize() родительского класса Game.
2. В методе initialize() должен быть вызван метод setScreenSize(int, int) с аргументами 10 и 7.
3. В методе initialize() с помощью метода setCellColor(int, int, Color) разукрась игровое поле в радужные цвета.
*/

public class RainbowGame extends Game {

    public void initialize() {
        setScreenSize(10, 7); // задаем размеры поля
        showGrid(false);          // убираю сетку поля
        Color[] values = {
                Color.RED,
                Color.ORANGE,
                Color.YELLOW,
                Color.GREEN,
                Color.BLUE,
                Color.INDIGO,
                Color.VIOLET};
        for (int i = 0; i < getScreenWidth(); i++) {
            for (int j = 0; j < getScreenHeight(); j++) {
                setCellColor(i,j, values[j]);
                }
            }
        }
    }


