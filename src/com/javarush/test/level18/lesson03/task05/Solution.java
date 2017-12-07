package com.javarush.test.level18.lesson03.task05;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



/* Сортировка байт
Ввести с консоли имя файла
Считать все байты из файла.
Не учитывая повторений - отсортировать их по байт-коду в возрастающем порядке.
Вывести на экран
Закрыть поток ввода-вывода

Пример байт входного файла
44 83 44

Пример вывода
44 83
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String name = null;
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))){
            name = bufferedReader.readLine();
        }catch (Exception e){
        }
        FileInputStream file = new FileInputStream(name);
        List<Integer> list = new ArrayList<>();
        while (file.available()>0){
            int input = file.read();
            if(!list.contains(input))list.add(input);
        }
        Collections.sort(list);
        StringBuilder msg = new StringBuilder();
        for(Integer integer:list){
            msg.append(integer + " ");
        }
        System.out.println(msg.substring(0,msg.length()-1));
    }
}
