package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human f1 = new Human("Вася","Васькин");
        Human f2 = new Human("Вася","Васькин","Украина");
        Human f3 = new Human("Вася","Васькин","Украина",30);
        Human f4 = new Human("Вася","Васькин","Украина",30,true);
        Human f5 = new Human("Вася","Васькин","Украина",30,true,true);
        Human f6 = new Human("Вася","Васькин",30);
        Human f7 = new Human("Вася");
        Human f8 = new Human("Вася","Васькин",false);
        Human f9 = new Human("Васькин","Украина",30,true,true);
        Human f10 = new Human("Вася","Украина",false,false);
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
        System.out.println(f4);
        System.out.println(f5);
        System.out.println(f6);
        System.out.println(f7);
        System.out.println(f8);
        System.out.println(f9);
        System.out.println(f10);
    }

    public static class Human
    {
        String Fname;
        String Lname;
        String adress;
        int age;
        boolean sex;
        boolean marriage;

        Human(String Fname, String Lname)
        {
            this.Fname = Fname;
            this.Lname = Lname;
        }
        Human(String Fname, String Lname,String adress)
        {
            this.Fname = Fname;
            this.Lname = Lname;
            this.adress = adress;
        }
        Human(String Fname, String Lname,String adress,int age)
        {
            this.Fname = Fname;
            this.Lname = Lname;
            this.adress = adress;
            this.age = age;
        }
        Human(String Fname, String Lname,String adress,int age,boolean sex)
        {
            this.Fname = Fname;
            this.Lname = Lname;
            this.adress = adress;
            this.age = age;
            this.sex = sex;
        }
        Human(String Fname, String Lname,String adress,int age,boolean sex,boolean marriage)
        {
            this.Fname = Fname;
            this.Lname = Lname;
            this.adress = adress;
            this.age = age;
            this.sex = sex;
            this.marriage = marriage;
        }
        Human(String Fname, String Lname,int age)
        {
            this.Fname = Fname;
            this.Lname = Lname;
            this.age = age;
        }
        Human(String Fname)
        {
            this.Fname = Fname;
        }
        Human(String Fname, String Lname,boolean marriage)
        {
            this.Fname = Fname;
            this.Lname = Lname;
            this.marriage = marriage;
        }
        Human(String Lname,String adress,int age,boolean sex,boolean marriage)
        {
            this.Lname = Lname;
            this.adress = adress;
            this.age = age;
            this.sex = sex;
            this.marriage = marriage;
        }
        Human(String Fname,String adress,boolean sex,boolean marriage)
        {
            this.Fname = Fname;
            this.adress = adress;
            this.sex = sex;
            this.marriage = marriage;
        }
        public String toString(){
            String text = "";
            if (this.Fname!=null) text+=("Имя:" + this.Fname + " ");
            if (this.Lname!=null) text+=("Фамилия:" + this.Lname + " ");
            if (this.adress!=null) text+=("Адрес:" + this.adress + " ");
            if (this.age>0) text+=("Возраст:" + this.age + " ");
            if (this.sex) text+=("Пол:мужской ");
            else text+=("Пол:женский ");
            if (this.marriage) text+=("Семейное положение:замужем ");
            else text+=("Семейное положение:в активном поиске ");
            return text;
        }
    }

}
