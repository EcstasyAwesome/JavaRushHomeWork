package com.javarush.test.level05.lesson12.bonus03;

import java.io.*;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        if (N>0){
            int i = Integer.parseInt(reader.readLine());
            for (int y = 1;y<=N-1;y++){
                int c = Integer.parseInt(reader.readLine());
                if(c>i)i=c;
            }
            int maximum = i;
            System.out.println(i);
        }
    }
}