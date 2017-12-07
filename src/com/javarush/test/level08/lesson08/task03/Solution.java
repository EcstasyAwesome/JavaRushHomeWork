package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String,String>maplist = new HashMap<>();
        maplist.put("Удовиченко","Влад");
        maplist.put("Таран","Леха");
        maplist.put("Коцарь","Влад");
        maplist.put("Петухов","Костя");
        maplist.put("Соколова","Анна");
        maplist.put("Ворожба","Лера");
        maplist.put("Бобух","Алина");
        maplist.put("Горбачевский","Слава");
        maplist.put("Захарова","Лена");
        maplist.put("Гога","Ира");
        return maplist;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int x = 0;
        for(Map.Entry<String, String> map1:map.entrySet()){
            String value=map1.getValue();
            if(value.equals(name)){
                x=x+1;
            }
        }
        return x;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        int x = 0;
        for(Map.Entry<String, String> map1:map.entrySet()){
            String key=map1.getKey();
            if(key.equals(lastName)){
                x=x+1;
            }
        }
        return x;
    }
}
