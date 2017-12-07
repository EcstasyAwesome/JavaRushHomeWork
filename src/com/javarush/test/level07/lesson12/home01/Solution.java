package com.javarush.test.level07.lesson12.home01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Вывести числа в обратном порядке
Ввести с клавиатуры 10 чисел и заполнить ими список.
Вывести их в обратном порядке.
Использовать только цикл for.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer>list = new ArrayList<>();
        for(int x = 0;x<10;x++){
            list.add(Integer.parseInt(reader.readLine()));
        }
        for(int x = 9;x>=0;x--){
            System.out.println(list.get(x));
        }
    }
}
