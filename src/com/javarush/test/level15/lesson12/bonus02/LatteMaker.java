package com.javarush.test.level15.lesson12.bonus02;


public class LatteMaker extends DrinkMaker
{
    @Override
    void getRightCup()
    {
        System.out.println(msg.latteCup);
    }

    @Override
    void putIngredient()
    {
        System.out.println(msg.lattePut);
    }

    @Override
    void pour()
    {
        System.out.println(msg.lattePour);
    }
}
