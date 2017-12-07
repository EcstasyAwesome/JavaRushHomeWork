package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Scanner reader = new Scanner(System.in);
        int a = reader.nextInt();
        int b = reader.nextInt();
        int c = reader.nextInt();
        int x = reader.nextInt();
        if ((a>b) && (a>c) && (a>x))
        System.out.println(a);
        else if((b>c) && (b>x))
            System.out.println(b);
        else if(c>x)
            System.out.println(c);
        else System.out.println(x);


    }
}
