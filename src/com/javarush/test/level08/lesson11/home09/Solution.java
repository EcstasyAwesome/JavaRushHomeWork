package com.javarush.test.level08.lesson11.home09;

import java.util.Date;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args)
    {
        String date = "JANUARY 1 2000";
        System.out.println(date + " = " + isDateOdd(date));
    }

    public static boolean isDateOdd(String date)
    {
        Date newyear = new Date(date);
        newyear.setHours(0);
        newyear.setMinutes(0);
        newyear.setSeconds(0);
        newyear.setDate(0);
        newyear.setMonth(0);

        Date time = new Date(date);
        long tm = time.getTime() - newyear.getTime();
        long delayD = 24 * 60 * 60 * 1000;
        int y = (int)(tm/delayD);
        return (y % 2 != 0);
    }
}
