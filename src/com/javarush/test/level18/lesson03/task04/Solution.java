package com.javarush.test.level18.lesson03.task04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* Самые редкие байты
Ввести с консоли имя файла
Найти байт или байты с минимальным количеством повторов
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String name = null;
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))){
            name = bufferedReader.readLine();
        }catch (Exception e){
        }
        FileInputStream file = new FileInputStream(name);
        Map<Integer,Integer> map = new HashMap<>();
        while (file.available()>0){
            int inputKey = file.read();
            if(!map.containsKey(inputKey)) map.put(inputKey,1);
            else map.put(inputKey,map.get(inputKey)+1);
        }
        file.close();
        StringBuilder msg = new StringBuilder();
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            if(entry.getValue()==1)msg.append(entry.getKey() + " ");
        }
        System.out.println(msg.substring(0,msg.length()-1));
    }
}
