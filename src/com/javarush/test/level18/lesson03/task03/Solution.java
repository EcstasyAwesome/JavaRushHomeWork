package com.javarush.test.level18.lesson03.task03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* Самые частые байты
Ввести с консоли имя файла
Найти байт или байты с максимальным количеством повторов
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
        while(file.available()>0){
            int inputKey = file.read();
            if(!map.containsKey(inputKey))map.put(inputKey,1);
            else map.put(inputKey,map.get(inputKey)+1);
        }
        file.close();
        int value = 0;
        StringBuilder msg = new StringBuilder();
        for(Map.Entry<Integer,Integer>empty:map.entrySet()){
            if(value<empty.getValue())value=empty.getValue();
        }
        for(Map.Entry<Integer,Integer>empty:map.entrySet()){
            if(empty.getValue().equals(value)) msg.append(empty.getKey() + " ");
        }
        System.out.print(msg.substring(0,msg.length()-1));
    }
}
