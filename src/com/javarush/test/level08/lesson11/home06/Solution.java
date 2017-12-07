package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<Human> FatherList = new ArrayList<>();
        ArrayList<Human> MotherList = new ArrayList<>();
        ArrayList<Human> ChildrenList = new ArrayList<>();
        ArrayList<Human> ChildrenList2 = new ArrayList<>();
        Human gFather1 = new Human("gFather1",true,60,FatherList);
        Human gMother1 = new Human("gMother1",false,55,FatherList);
        Human gFather2 = new Human("gFather2",true,60,MotherList);
        Human gMother2 = new Human("gMother2",false,55,MotherList);
        Human Father = new Human("Father",true,30,ChildrenList);
        Human Mother = new Human("Mother",false,28,ChildrenList);
        Human Child1 = new Human("Child1",true,5,ChildrenList2);
        Human Child2 = new Human("Child2",true,4,ChildrenList2);
        Human Child3 = new Human("Child3",true,3,ChildrenList2);
        FatherList.add(Father);
        MotherList.add(Mother);
        ChildrenList.add(Child1);
        ChildrenList.add(Child2);
        ChildrenList.add(Child3);
        System.out.println(gFather1);
        System.out.println(gMother1);
        System.out.println(gFather2);
        System.out.println(gMother2);
        System.out.println(Father);
        System.out.println(Mother);
        System.out.println(Child1);
        System.out.println(Child2);
        System.out.println(Child3);
    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        Human(String name, boolean sex, int age, ArrayList<Human> children){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
