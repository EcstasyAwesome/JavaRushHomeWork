package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] mass = new int[20];
        for(int x=0;x<mass.length;x++){
            mass[x]=Integer.parseInt(reader.readLine());
        }
        int[] mass1 = new int[10];
        int[] mass2 = new int[10];
        for(int x=0;x<mass.length;x++){
        if(x<10)
            mass1[x]=mass[x];
        else
            mass2[x-10]=mass[x];
        }
        for(int x=0;x<mass2.length;x++){
            System.out.println(mass2[x]);
        }

    }
}
