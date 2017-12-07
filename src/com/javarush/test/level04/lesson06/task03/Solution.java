package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
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
        if (a > b && b > c)

            System.out.println(a + " " + b + " " + c);

        if (a > c && c > b)

            System.out.println(a + " " + c + " " + b);

        if (c > a && a > b)

            System.out.println(c + " " + a + " " + b);

        if (c > b && b > a)

            System.out.println(c + " " + b + " " + a);

        if (b > a && a > c)

            System.out.println(b + " " + a + " " + c);

        if (b > c && c > a)

            System.out.println(b + " " + c + " " + a);
    }
}
