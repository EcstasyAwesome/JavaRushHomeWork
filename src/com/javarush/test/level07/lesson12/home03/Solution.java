package com.javarush.test.level07.lesson12.home03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* Максимальное и минимальное числа в массиве
Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] mass = new int[20];
        for(int x = 0;x<20;x++){
            mass[x] = Integer.parseInt(reader.readLine());
        }
        Arrays.sort(mass);
        int maximum = mass[19];
        int minimum = mass[0];


        System.out.print(maximum + " ");
        System.out.println(minimum);
    }
}
