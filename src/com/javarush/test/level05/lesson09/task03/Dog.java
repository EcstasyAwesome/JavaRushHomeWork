package com.javarush.test.level05.lesson09.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя конструкторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    String name;
    int rost;
    String color;
    Dog(String name){
        this.name = name;
    }
    Dog(String name,int rost){
        this.name = name;
        this.rost = rost;
    }
    Dog(String name,int rost,String color){
        this.name = name;
        this.rost = rost;
        this.color = color;
    }
}
