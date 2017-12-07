package com.javarush.test.level09.lesson02.task01;

/* Каждый метод должен возвращать свой StackTrace
Написать пять методов, которые вызывают друг друга. Каждый метод должен возвращать свой StackTrace.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        method1();
    }

    public static StackTraceElement[] method1()
    {
        method2();
        StackTraceElement[] method1 = Thread.currentThread().getStackTrace();
        return method1;
    }

    public static StackTraceElement[] method2()
    {
        method3();
        StackTraceElement[] method2 = Thread.currentThread().getStackTrace();
        return method2;
    }

    public static StackTraceElement[] method3()
    {
        method4();
        StackTraceElement[] method3 = Thread.currentThread().getStackTrace();
        return method3;
    }

    public static StackTraceElement[] method4()
    {
        method5();
        StackTraceElement[] method4 = Thread.currentThread().getStackTrace();
        return method4;
    }

    public static StackTraceElement[] method5()
    {
        StackTraceElement[] method5 = Thread.currentThread().getStackTrace();
        return method5;
    }
}
