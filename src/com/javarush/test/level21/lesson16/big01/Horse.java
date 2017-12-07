package com.javarush.test.level21.lesson16.big01;

//Теперь вернемся к методам move и print. Начнем с move.
//        В методе move класса Hippodrome в цикле у каждой лошади мы вызываем метод move.
//
//        Да ты прав, его еще нет у класса Horse.
//        Поэтому в класс Horse надо добавить свой метод move :)
//        И метод print, кстати тоже.
//        Если я не говорю ничего насчет параметров метода, значит метод без параметров.
//        Делай все методы public, если явно не указано обратное.
public class Horse
{
    public void move(){
        distance += speed * Math.random();
    }

    public void print(){
        StringBuilder msg = new StringBuilder();
        for (int x = 0; x < distance; x++){
            msg.append(".");
        }
        System.out.println(msg.append(name));
    }

    public double getDistance()
    {
        return distance;
    }

    public void setDistance(double distance)
    {
        this.distance = distance;
    }

    public double getSpeed()
    {
        return speed;
    }

    public void setSpeed(double speed)
    {
        this.speed = speed;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    String name;
    double speed;
    double distance;

    public Horse (String name, double speed, double distance){
        this.name = name;
        this.speed = speed;
        this.distance = distance;
    }
}
