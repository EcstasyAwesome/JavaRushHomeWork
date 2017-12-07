package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
Используйте коллекции.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        Map<String,String> mapMonth = new HashMap<>();
        mapMonth.put("january","January is 1 month");
        mapMonth.put("february","February is 2 month");
        mapMonth.put("march","March is 3 month");
        mapMonth.put("april","April is 4 month");
        mapMonth.put("may","May is 5 month");
        mapMonth.put("june","June is 6 month");
        mapMonth.put("july","July is 7 month");
        mapMonth.put("august","August is 8 month");
        mapMonth.put("september","September is 9 month");
        mapMonth.put("october","October is 10 month");
        mapMonth.put("november","November is 11 month");
        mapMonth.put("december","December is 12 month");

        for(Map.Entry<String,String>list:mapMonth.entrySet()){
            if(s.toLowerCase().equals(list.getKey())){
                System.out.println(list.getValue());
            }
        }
    }
}
