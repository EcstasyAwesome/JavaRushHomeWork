package com.javarush.test.level15.lesson12.bonus02;


public class TeaMaker extends DrinkMaker
{
    @Override
    void getRightCup()
    {
        System.out.println(msg.teaCup);
    }

    @Override
    void putIngredient()
    {
        System.out.println(msg.teaPut);
    }

    @Override
    void pour()
    {
        System.out.println(msg.teaPour);
    }
}
