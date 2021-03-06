package com.javarush.test.level17.lesson10.bonus01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* CRUD
CrUD - Create, Update, Delete
Программа запускается с одним из следующих наборов параметров:
-c name sex bd
-u id name sex bd
-d id
-i id
Значения параметров:
name - имя, String
sex - пол, "м" или "ж", одна буква
bd - дата рождения в следующем формате 15/04/1990
-c  - добавляет человека с заданными параметрами в конец allPeople, выводит id (index) на экран
-u  - обновляет данные человека с данным id
-d  - производит логическое удаление человека с id
-i  - выводит на экран информацию о человеке с id: name sex (м/ж) bd (формат 15-Apr-1990)

id соответствует индексу в списке
Все люди должны храниться в allPeople
Используйте Locale.ENGLISH в качестве второго параметра для SimpleDateFormat

Пример параметров: -c Миронов м 15/04/1990
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();
    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException
    {
//        //start here - начни тут
//        if(args.length>0){
//            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
//            try{
//                if (args[0].equals("-c")){             //создание
//                    Date date = simpleDateFormat.parse(args[3]);
//                    if(args[2].equals("м"))allPeople.add(Person.createMale(args[1],date));
//                    else allPeople.add(Person.createFemale(args[1],date));
//                }
//                else if (args[0].equals("-u")){        //обновлениние
//                    Date date = simpleDateFormat.parse(args[4]);
//                    allPeople.get(Integer.parseInt(args[1])).setName(args[2]);
//                    allPeople.get(Integer.parseInt(args[1])).setBirthDay(date);
//                    if(args[3].equals("м"))allPeople.get(Integer.parseInt(args[1])).setSex(Sex.MALE);
//                    else allPeople.get(Integer.parseInt(args[1])).setSex(Sex.FEMALE);
//                }
//                else if (args[0].equals("-d")){        //удаление
//                    allPeople.get(Integer.parseInt(args[1])).setBirthDay(null);
//                    allPeople.get(Integer.parseInt(args[1])).setName(null);
//                    allPeople.get(Integer.parseInt(args[1])).setSex(null);
//                }
//                else if (args[0].equals("-i")){        //вывод
//                    SimpleDateFormat date = new SimpleDateFormat("dd-MMM-yyyy",Locale.ENGLISH);
//                    System.out.print(allPeople.get(Integer.parseInt(args[1])).getName() + " ");
//                    System.out.print(allPeople.get(Integer.parseInt(args[1])).getSex().equals(Sex.MALE) ? "м ":"ж ");
//                    System.out.print(date.format(allPeople.get(Integer.parseInt(args[1])).getBirthDay()));
//                }
//            } catch (Exception e) {
//                System.out.println(e.getMessage());
//            }
//        }
        if (args[0].equals("-c"))
        {
            addlist(args);
        }
        if (args[0].equals("-u"))
        { //-u id name sex bd
            changelist(args);
        }
        if (args[0].equals("-d"))
        { // -d  - производит логическое удаление человека с id
            removelist(args);
        }
        //     args[0] = "-i"; args[1] = "2";
        if (args[0].equals("-i"))
        { //-i  - выводит на экран информацию о человеке с id: name sex (м/ж) bd (формат 15-Apr-1990)
            printlist(args);
        }
    }

    public static void addlist(String[] args) throws ParseException
    {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        int i;
        String s = "";
        for (i = 1; i < args.length; i++)
        {
            if ((args[i].equals("м"))||(args[i].equals("ж"))) {i--; break;}
            s += args[i];
        }
//-c Иванов Иван Иванович м 23/02/1987
        switch (args[i+1])
        {
            case "м":
                allPeople.add(Person.createMale(s, format.parse(args[i+2])));
                break;
            case "ж":
                allPeople.add(Person.createFemale(s, format.parse(args[i+2])));
                break;
        }
        System.out.println((allPeople.size()-1));
    }

    public static void changelist(String[] args) throws ParseException
    {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        allPeople.get(Integer.parseInt(args[1])).setName(args[2]);
        switch (args[3])
        {
            case "м":
                allPeople.get(Integer.parseInt(args[1])).setSex(Sex.MALE);
                break;
            case "ж":
                allPeople.get(Integer.parseInt(args[1])).setSex(Sex.FEMALE);
                break;
        }
        allPeople.get(Integer.parseInt(args[1])).setBirthDay(format.parse(args[4]));
    }

    public static void removelist(String[] args)
    {
        allPeople.get((Integer.parseInt(args[1]))).setName(null);
        allPeople.get((Integer.parseInt(args[1]))).setSex(null);
        allPeople.get((Integer.parseInt(args[1]))).setBirthDay(null);
    }

    public static void printlist(String[] args)
    {
        SimpleDateFormat format = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        System.out.print(allPeople.get((Integer.parseInt(args[1]))).getName() + " ");
        if (allPeople.get(Integer.parseInt(args[1])).getSex().equals(Sex.MALE)) System.out.print("м ");
        if (allPeople.get(Integer.parseInt(args[1])).getSex().equals(Sex.FEMALE)) System.out.print("ж ");
        System.out.print(format.format(allPeople.get((Integer.parseInt(args[1]))).getBirthDay()));
    }
}
