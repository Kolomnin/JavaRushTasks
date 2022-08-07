package com.javarush.games.minigames.mini08;

import com.javarush.engine.cell.*;

/* 
Работа с клавиатурой
Пришло время реализовать методы, которые вызываются при нажатии клавиш. Это onKeyPress(Key) и onKeyReleased(Key).
При запуске игры поле состоит из 3x3 клеток.

Тебе нужно сделать так, чтобы:
при нажатии клавиши Key.LEFT закрашивались три левые клетки;
при нажатии Key.RIGHT закрашивались три правые клетки;
при нажатии Key.UP — три верхние;
при нажатии Key.DOWN — три нижние.
Клетки должны закрашиваться в зеленый цвет.
При отпускании любой из этих четырех клавиш все клетки должны закрашиваться в белый.

Requirements:
1. В классе KeyboardGame должен быть переопределен метод onKeyPress(Key) родительского класса Game.
2. В классе KeyboardGame должен быть переопределен метод onKeyReleased(Key) родительского класса Game.
3. При нажатии клавиши Key.LEFT должны быть закрашены три левые клетки в зеленый цвет.
4. При нажатии клавиши Key.RIGHT должны быть закрашены три правые клетки в зеленый цвет.
5. При нажатии клавиши Key.UP должны быть закрашены три верхние клетки в зеленый цвет.
6. При нажатии клавиши Key.DOWN должны быть закрашены три нижние клетки в зеленый цвет.
7. При отпускании клавиш Key.LEFT, Key.RIGHT, Key.UP или Key.DOWN все клетки должны быть закрашены в белый.
*/

public class KeyboardGame extends Game {

    @Override
    public void initialize() {
        setScreenSize(3, 3);

        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                setCellColor(x, y, Color.WHITE);
            }
        }
    }

    @Override
    public void onKeyPress(Key key) {
        int x = 0;
        int y = 0;
        switch (key){
            case LEFT:
                for (y = 0; y < 3; y++) {
                  setCellColor(0, y, Color.GREEN);
                }
                break;
            case RIGHT:
                for (y = 0; y < 3; y++) {
                    setCellColor(2, y, Color.GREEN);
                }
                break;
            case UP:
                for (x = 0; x < 3; x++) {
                    setCellColor(x, 0, Color.GREEN);
                }
                break;
            case DOWN:
                for (x = 0; x < 3; x++) {
                    setCellColor(x, 2, Color.GREEN);
                }
                break;
            }

//        int x = 0;
//        int y = 0;
//        if (key == keys[0]) {
//            for (x = 0; x < 1; x++) {
//                for (y = 0; y < 3; y++) {
//                    setCellColor(x, y, Color.GREEN);
//                }
//            }
//        } else if (key == keys[1]){
//            for (x = 2; x < 3; x++) {
//                for (y = 0; y < 3; y++) {
//                    setCellColor(x, y, Color.GREEN);
//                }
//            }
//        }else if(key == keys[2]){
//            for (x = 0; x < 3; x++) {
//                setCellColor(x, y, Color.GREEN);
//            }
//        }else if(key == keys[3]){
//            for (x = 0; x < 3; x++) {
//                for (y = 2; y < 3; y++) {
//                setCellColor(x, y, Color.GREEN);
//                }
//            }
//        }
    }
    @Override
    public void onKeyReleased(Key key){
        if (key == Key.LEFT||key == Key.RIGHT||key == Key.UP||key == Key.DOWN) {
            for (int x = 0; x < 3; x++) {
                for (int y = 0; y < 3; y++) {
                    setCellColor(x, y, Color.WHITE);
                }
            }
        }
    }
}
//ПРАВИЛЬНОЕ РЕШЕНИЕ
//    @Override
//    public void initialize() {
//        setScreenSize(3, 3);
//
//        for (int x = 0; x < 3; x++) {
//            for (int y = 0; y < 3; y++) {
//                setCellColor(x, y, Color.WHITE);
//            }
//        }
//    }
//
//    @Override
//    public void onKeyPress(Key key) {
//        if (key == Key.LEFT) {
//            setCellColor(0, 0, Color.GREEN);
//            setCellColor(0, 1, Color.GREEN);
//            setCellColor(0, 2, Color.GREEN);
//        } else if (key == Key.RIGHT) {
//            setCellColor(2, 0, Color.GREEN);
//            setCellColor(2, 1, Color.GREEN);
//            setCellColor(2, 2, Color.GREEN);
//        } else if (key == Key.UP) {
//            setCellColor(0, 0, Color.GREEN);
//            setCellColor(1, 0, Color.GREEN);
//            setCellColor(2, 0, Color.GREEN);
//        } else if (key == Key.DOWN) {
//            setCellColor(0, 2, Color.GREEN);
//            setCellColor(1, 2, Color.GREEN);
//            setCellColor(2, 2, Color.GREEN);
//        }
//    }
//
//    @Override
//    public void onKeyReleased(Key key) {
//        if(key == Key.LEFT || key == Key.RIGHT || key == Key.UP || key == Key.DOWN) {
//            for (int x = 0; x < 3; x++) {
//                for (int y = 0; y < 3; y++) {
//                    setCellColor(x, y, Color.WHITE);
//                }
//            }
//        }
//    }
//}