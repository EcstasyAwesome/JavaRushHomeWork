package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.Map;
import java.util.Collections;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
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

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (String value : copy.values())
            if (Collections.frequency(copy.values(), value) > 1)
                removeItemFromMapByValue(map, value);

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
