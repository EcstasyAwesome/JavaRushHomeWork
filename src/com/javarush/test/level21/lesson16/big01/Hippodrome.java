package com.javarush.test.level21.lesson16.big01;

import java.util.ArrayList;

//Теперь вернемся к методам move и print. Начнем с move.
//        В методе move класса Hippodrome в цикле у каждой лошади мы вызываем метод move.
//
//        Да ты прав, его еще нет у класса Horse.
//        Поэтому в класс Horse надо добавить свой метод move :)
//        И метод print, кстати тоже.
//        Если я не говорю ничего насчет параметров метода, значит метод без параметров.
//        Делай все методы public, если явно не указано обратное.

public class Hippodrome
{
    public ArrayList<Horse> getHorses()
    {
        return horses;
    }

    private ArrayList<Horse> horses = new ArrayList<>();

    public static Hippodrome game;

    public void run() throws InterruptedException
    {
        for (int x = 0; x < 100; x++) {
            move();
            print();
            Thread.sleep(200);
        }
    }

    public void move(){
        for (Horse currentHorse : horses) {
            currentHorse.move();
        }
    }

    public void print(){
        for (Horse currentHorse : horses) {
            currentHorse.print();
            System.out.println();
            System.out.println();
        }
    }

    public Horse getWinner(){
        Horse tmp = horses.get(0);
        for (Horse horse : horses) {
            if (horse.distance > tmp.distance) {
                tmp = horse;
            }
        }
        return tmp;
    }

    public void printWinner(){
        System.out.println("Winner is " + getWinner().getName()+"!");
    }

    public static void main(String[] args) throws InterruptedException
    {
        game = new Hippodrome();
        Horse horse1 = new Horse("Sleven",3,0);
        Horse horse2 = new Horse("Lucky",3,0);
        Horse horse3 = new Horse("Gomer",3,0);
        game.getHorses().add(horse1);
        game.getHorses().add(horse2);
        game.getHorses().add(horse3);
        game.run();
        game.printWinner();
    }
}
