package com.javarush.test.level12.lesson04.task04;

/* Три метода возвращают минимальное из двух переданных в него чисел
Написать public static методы: int min(int, int), long min(long, long), double min(double, double).
Каждый метод должен возвращать минимальное из двух переданных в него чисел.
*/

public class Solution
{
    public static void main(String[] args)
    {
        System.out.println(min(1,2));
        System.out.println(min(1.1,1.2));
        System.out.println(min((long)1232,(long)32425));
    }

    public static int min(int a,int b){
        return a>b?b:a;
    }
    public static long min(long a, long b){
        return a>b?b:a;
    }
    public static double min(double a, double b){
        return a>b?b:a;
    }
}
