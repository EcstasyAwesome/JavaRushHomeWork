package com.javarush.test.level17.lesson10.bonus02;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* CRUD 2
CrUD Batch - multiple Creation, Updates, Deletion
!!!РЕКОМЕНДУЕТСЯ выполнить level17.lesson10.bonus01 перед этой задачей!!!

Программа запускается с одним из следующих наборов параметров:
-c name1 sex1 bd1 name2 sex2 bd2 ...
-u id1 name1 sex1 bd1 id2 name2 sex2 bd2 ...
-d id1 id2 id3 id4 ...
-i id1 id2 id3 id4 ...
Значения параметров:
name - имя, String
sex - пол, "м" или "ж", одна буква
bd - дата рождения в следующем формате 15/04/1990
-с  - добавляет всех людей с заданными параметрами в конец allPeople, выводит id (index) на экран в соответствующем порядке
-u  - обновляет соответствующие данные людей с заданными id
-d  - производит логическое удаление всех людей с заданными id
-i  - выводит на экран информацию о всех людях с заданными id: name sex bd

id соответствует индексу в списке
Формат вывода даты рождения 15-Apr-1990
Все люди должны храниться в allPeople
Порядок вывода данных соответствует вводу данных
Обеспечить корректную работу с данными для множества нитей (чтоб не было затирания данных)
Используйте Locale.ENGLISH в качестве второго параметра для SimpleDateFormat
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();
    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }
    public static void main(String[] args) throws Exception{
        if(args.length<2) return;
        if(args[0].equals("-c")){
            createC(args);
        }
        else if(args[0].equals("-u")){
            updateU(args);
        }
        else if(args[0].equals("-d")){
            deleteD(args);
        }
        else if(args[0].equals("-i")){
            informI(args);
        }
        else {
            return;
        }
    }
    public synchronized static void createC(String[] args) throws ParseException {
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        Date date=null;
        int id=0;
        int checkSex=0;
        if((args.length-1)%3!=0) return;  // почему,  может принять так как есть ???
        //  просто обработать правильно
        for (int i = 2; i <args.length; i=i+3) {
            if(!(args[i].equals("м") || args[i].equals("ж"))){
                checkSex++;
            }
        }
        if(checkSex!=0)return;  // тоже самое ну и т.д.
        for (int i = 1; i <args.length ; i=i+3) {
            date = format.parse(args[i+2]);
            if(args[i+1].equals("м")){
                allPeople.add(allPeople.size(),Person.createMale(args[i], date));
                System.out.println(allPeople.size() - 1);
            }
            else if(args[i+1].equals("ж")){
                allPeople.add(allPeople.size(),Person.createFemale(args[i], date));
                System.out.println(allPeople.size() - 1);
            }
        }
    }
    public synchronized static void updateU(String[] args) throws ParseException{
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        Date date=null;
        int id=0;
        int checkSex=0;
        if((args.length-1)%4!=0) return;
        for (int i = 3; i <args.length; i=i+4) {
            if(!(args[i].equals("м") || args[i].equals("ж"))){
                checkSex++;
            }
        }
        if(checkSex!=0)return;
        for (int i = 1; i <args.length ; i=i+4) {
            id =Integer.parseInt(args[i]);
            date = format.parse(args[i+3]);
            if(args[i+2].equals("м")){
                allPeople.get(id).setSex(Sex.MALE);
                allPeople.get(id).setName(args[i+1]);
                allPeople.get(id).setBirthDay(date);
            } else if(args[i+2].equals("ж")){
                allPeople.get(id).setSex(Sex.FEMALE);
                allPeople.get(id).setName(args[i+1]);
                allPeople.get(id).setBirthDay(date);
            }
        }
    }
    public synchronized static void deleteD(String[] args){
        int id=0;
        for (int i = 1; i <args.length ; i++) {
            id =Integer.parseInt(args[i]);
            allPeople.get(id).setSex(null);
            allPeople.get(id).setBirthDay(null);
            allPeople.get(id).setName(null);
        }
    }
    public static void informI(String[] args){
        DateFormat format2 = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        Date date=null;
        int id=0;
        for (int i = 1; i <args.length ; i++) {
            id =Integer.parseInt(args[i]);
            String sex="";
            if(allPeople.get(id).getSex()==Sex.MALE){
                sex="м";
            }
            else if(allPeople.get(id).getSex()==Sex.FEMALE){
                sex="ж";
            }
            date = allPeople.get(id).getBirthDay();
            System.out.println(allPeople.get(id).getName() + " " + sex + " " + format2.format(date));
        }
    }
}
//    public static void main(String[] args) throws ParseException {
//        //start here - начни тут
//        if (args[0].equals("-c"))
//        {
//            addlist(args);
//        }
//        if (args[0].equals("-u"))
//        {
//            changelist(args);
//        }
//        if (args[0].equals("-d"))
//        {
//            removelist(args);
//        }
//        if (args[0].equals("-i"))
//        {
//            printlist(args);
//        }
//    }
//
//    public static synchronized void addlist(String[] args) throws ParseException
//    {
//        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
//        int i = 1;
//        String s = "";
//        while(true)
//        {
//            for (; i < args.length; i++)
//            {
//                if ((args[i].equals("м")) || (args[i].equals("ж")))
//                {
//                    i--;
//                    break;
//                }
//                s += args[i];
//            }
//            switch (args[i + 1])
//            {
//                case "м":
//                    allPeople.add(Person.createMale(s, format.parse(args[i + 2])));
//                    break;
//                case "ж":
//                    allPeople.add(Person.createFemale(s, format.parse(args[i + 2])));
//                    break;
//            }
//            System.out.println((allPeople.size() - 1));
//            i+=3;
//            if(i==args.length)break;
//        }
//    }
//
//    public static synchronized void changelist(String[] args) throws ParseException
//    {
//        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
//        int id1=2;
//        int id2=3;
//        int id3=4;
//        for(int id = 1; id < args.length; id+=4)
//        {
//            allPeople.get(Integer.parseInt(args[id])).setName(args[id1]);
//            switch (args[id2])
//            {
//                case "м":
//                    allPeople.get(Integer.parseInt(args[id])).setSex(Sex.MALE);
//                    break;
//                case "ж":
//                    allPeople.get(Integer.parseInt(args[id])).setSex(Sex.FEMALE);
//                    break;
//            }
//            allPeople.get(Integer.parseInt(args[id])).setBirthDay(format.parse(args[id3]));
//            id1+=4;
//            id2+=4;
//            id3+=4;
//            if (id3>args.length) break;
//        }
//    }
//
//    public static synchronized void removelist(String[] args)
//    {
//        for(int id = 1; id < args.length; id++)
//        {
//            allPeople.get((Integer.parseInt(args[id]))).setName(null);
//            allPeople.get((Integer.parseInt(args[id]))).setSex(null);
//            allPeople.get((Integer.parseInt(args[id]))).setBirthDay(null);
//        }
//    }
//
//    public static void printlist(String[] args)
//    {
//        Arrays.sort(args);
//        SimpleDateFormat format = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
//        StringBuilder msg = new StringBuilder();
//        for(int id = 1; id < args.length; id++)
//        {
//            msg.append(allPeople.get((Integer.parseInt(args[id]))).getName() + " ");
//            if (allPeople.get(Integer.parseInt(args[id])).getSex().equals(Sex.MALE)) msg.append("м ");
//            if (allPeople.get(Integer.parseInt(args[id])).getSex().equals(Sex.FEMALE)) msg.append("ж ");
//            msg.append(format.format(allPeople.get((Integer.parseInt(args[id]))).getBirthDay()));
//            System.out.println(msg);
//            msg.delete(0,msg.length());
//        }
//    }
//}
