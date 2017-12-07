package com.javarush.test.level06.lesson11.home01;

/* Класс Cat и статическая переменная catCount
В классе Cat создай статическую переменную public int catCount.
Создай конструктор [public Cat()]. Пусть при каждом создании кота (нового объекта Cat) статическая переменная
catCount увеличивается на 1. Создать 10 объектов Cat и вывести значение переменной catCount на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Cat c1 = new Cat();
        Cat c2 = new Cat();
        Cat c3 = new Cat();
        Cat c4 = new Cat();
        Cat c5 = new Cat();
        Cat c6 = new Cat();
        Cat c7 = new Cat();
        Cat c8 = new Cat();
        Cat c9 = new Cat();
        Cat c10 = new Cat();
        System.out.println(Cat.catCount);
    }
    public static class Cat
    {
        public static int catCount;
        public Cat()
        {
            Cat.catCount++;
        }
    }
}

