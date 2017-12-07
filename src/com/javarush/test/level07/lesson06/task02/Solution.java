package com.javarush.test.level07.lesson06.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Самая длинная строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = null;
        String b = null;
        int i = 0;
        for(int x = 0;x<5;x++){
            String s = reader.readLine();
            list.add(s);
            if(list.get(x).length()>i) {
                i = list.get(x).length();
                a = list.get(x);
            }
        }
        for(int x = 0;x<list.size();x++){
            if(i==list.get(x).length()&&list.get(x)!=a){
                b=list.get(x);
                System.out.println(b);
            }
        }
        System.out.println(a);
    }
}
