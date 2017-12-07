package com.javarush.test.level07.lesson12.home02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Переставить M первых строк в конец списка
Ввести с клавиатуры 2 числа N  и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        int N = Integer.parseInt(reader.readLine());
        int M = Integer.parseInt(reader.readLine());
        for (int x = 0; x < N; x++)
        {
            String s = reader.readLine();
            list.add(s);
        }
        for(int x = 0; x < M; x++){
            list.add(list.get(x));
        }
        for(int x = 0;x < M; x++){
            list.remove(0);
        }

        for(int x = 0; x < list.size(); x++){
            System.out.println(list.get(x));
        }
    }
}
