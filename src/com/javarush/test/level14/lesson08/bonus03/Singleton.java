package com.javarush.test.level14.lesson08.bonus03;


class Singleton
{
    static Singleton singleton = null;
    private Singleton(){}
    static Singleton getInstance(){
        if (singleton == null)singleton = new Singleton();
        return singleton;
    }
}
