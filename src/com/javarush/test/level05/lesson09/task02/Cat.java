package com.javarush.test.level05.lesson09.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью конструкторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст – неизвестные. Кот - бездомный)
- вес, цвет, адрес ( чужой домашний кот)
Задача конструктора – сделать объект валидным. Например, если вес не известен, то нужно указать какой-нибудь средний вес.
Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    String name;
    int ves = 5;
    int age = 4;
    String color;
    String adres;
    Cat(String name){
        this.name = name;
    }
    Cat(String name,int ves,int age){
        this.name = name;
        this.ves = ves;
        this.age = age;
    }
    Cat(String name,int age){
        this.name = name;
        this.age = age;
    }
    Cat(int age,String color){
        this.age = age;
        this.color = color;
    }
    Cat(int ves,String color,String adres){
        this.ves = ves;
        this.color = color;
        this.adres = adres;
    }

}
