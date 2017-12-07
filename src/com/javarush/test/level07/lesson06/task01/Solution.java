package com.javarush.test.level07.lesson06.task01;

import java.util.ArrayList;

/* 5 различных строчек в списке
1. Создай список строк.
2. Добавь в него 5 различных строчек.
3. Выведи его размер на экран.
4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> list = new ArrayList<String>();
        String a = "a";
        String b = "b";
        String c = "c";
        String d = "d";
        String e = "e";
        list.add(0,a);
        list.add(1,b);
        list.add(2,c);
        list.add(3,d);
        list.add(4,e);
        System.out.println(list.size());
        for(int x = 0;x<list.size();x++){
            System.out.println(list.get(x));
        }
    }
}
