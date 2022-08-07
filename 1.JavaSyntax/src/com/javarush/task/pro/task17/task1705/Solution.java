package com.javarush.task.pro.task17.task1705;

import java.util.ArrayList;

/* 
Космическая одиссея ч.3
Сделаем наш предыдущий пример более правильным и универсальным.
Порядок, в котором добавляются астронавты в список astronauts, не всегда будет известен.
Чтобы правильно распределить задачи членам экипажа, необходимо определить, кем является астронавт.
Для этого в методе runWorkingProcess() перебери всех астронавтов в цикле, используя оператор instanceof определи,
кем является астронавт и передай его в качестве аргумента соответствующему методу:
Human — в метод pilot(Human human);
Dog — в метод createDirection(Dog dog);
Cat — в метод research(Cat cat).

Метод runWorkingProcess() должен работать корректно независимо от количества астронавтов и порядка их добавления в astronauts.

Requirements:
1. Метод runWorkingProcess() должен вызывать pilot(Human human) для каждого объекта Human из списка astronauts.
2. Метод runWorkingProcess() должен вызывать createDirection(Dog dog) для каждого объекта Dog из списка astronauts.
3. Метод runWorkingProcess() должен вызывать research(Cat cat) для каждого объекта Cat из списка astronauts.
*/

public class Solution {
    public static ArrayList<Astronaut> astronauts = new ArrayList<>();

    public static void main(String[] args) {
        createCrew();
        printCrewInfo();
        runWorkingProcess();
    }

    public static void runWorkingProcess() {
        for (int i = 0; i < astronauts.size(); i++) {
            if (astronauts.get(i) instanceof Human) {
                pilot((Human) astronauts.get(i));
            }
            if (astronauts.get(i) instanceof Dog) {
                createDirection((Dog) astronauts.get(i));
            }
            if (astronauts.get(i) instanceof Cat) {
                research((Cat) astronauts.get(i));
            }
        }
    }
//    {
//        for (Astronaut astronaut : astronauts) {
//            if (astronaut instanceof Human) {
//                pilot((Human) astronaut);
//            } else if (astronaut instanceof Dog) {
//                createDirection((Dog) astronaut);
//            } else {
//                research((Cat) astronaut);
//            }
//        }
//    }

    public static void pilot(Human human) {
        System.out.println("Член экипажа " + human.getInfo() + " пилотирует корабль.");
    }

    public static void createDirection(Dog dog) {
        System.out.println("Член экипажа " + dog.getInfo() + " занимается созданием навигационного маршрута.");
    }

    public static void research(Cat cat) {
        System.out.println("Член экипажа " + cat.getInfo() + " исследует ближайшие планеты.");
    }

    public static void createCrew() {
        astronauts.add(new Human());
        astronauts.add(new Human());
        astronauts.add(new Dog());
        astronauts.add(new Cat());
    }

    public static void printCrewInfo() {
        System.out.println("На борт погружены члены экипажа: ");
        for (Astronaut astronaut : astronauts) {
            System.out.println(astronaut.getInfo());
        }
    }
}
