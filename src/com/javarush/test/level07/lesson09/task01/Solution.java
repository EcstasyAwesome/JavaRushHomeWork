package com.javarush.test.level07.lesson09.task01;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Три массива
1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2. Метод printList должен выводить на экран все элементы списка с новой строки.
3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> x3 = new ArrayList<>();
        ArrayList<Integer> x2 = new ArrayList<>();
        ArrayList<Integer> x1 = new ArrayList<>();
        for(int x = 0; x < 20; x++){
            int i = Integer.parseInt(reader.readLine());
            list.add(i);
            if(i % 3 == 0 || i % 3 == 0 && i % 2 == 0) x3.add(i);
            if(i % 2 == 0 || i % 2 == 0 && i % 3 == 0) x2.add(i);
            else if(i % 2 != 0 && i % 3 != 0) x1.add(i);
        }
        printList(x3);
        printList(x2);
        printList(x1);

    }

    public static void printList(List<Integer> list)
    {
        //System.out.println(list); //легче воспринимается глазом
        for (int x : list)
        {
            System.out.println(x);
        }
    }
}
