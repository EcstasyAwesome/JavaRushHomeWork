package com.javarush.test.level04.lesson13.task03;

import java.io.*;

/* Рисуем треугольник
Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
Пример:
8
88
888
...
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        for (int a = 1; a <=9; a++)
        {
            System.out.println(8);
            for (int x = 1; x <= a; x++)
            {
                System.out.print(8);
                if (x == 9) System.out.println(8);
            }

        }
    }
}
