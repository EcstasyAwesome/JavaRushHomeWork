package com.javarush.test.level05.lesson07.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью инициализаторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)
- вес, цвет, адрес ( чужой домашний кот)
Задача инициализатора – сделать объект валидным. Например, если вес неизвестен, то нужно указать какой-нибудь средний вес.
Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    String name;
    int ves = 5;
    int vozrast = 6;
    String adres;
    String color;

    public void initialize(String name){
        this.name = name;
    }
    public void initialize(String name,int ves,int vozrast){
        this.name = name;
        this.ves = ves;
        this.vozrast = vozrast;
    }
    public void initialize(String name,int vozrast){
        this.name = name;
        this.vozrast = vozrast;
    }
    public void initialize(int ves,String color){
        this.ves = ves;
        this.color = color;
    }
    public void initialize(int ves,String color,String adres){
        this.ves = ves;
        this.color = color;
        this.adres = adres;
    }

}
