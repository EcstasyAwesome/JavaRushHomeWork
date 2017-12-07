package com.javarush.test.level08.lesson11.home08;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Пять наибольших чисел
Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Вывести пять наибольших чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }

    public static void sort(int[] array)
    {
// сорт. методом выборки
//        for(int x = 0; x < array.length; x++){
//            int min = array[x];
//            int min_x = x;
//            for(int i = x + 1; i < array.length; i++){
//                if(array[i]>min){
//                    min = array[i];
//                    min_x = i;
//                }
//            }
//            if(x != min_x){
//                int temp = array[x];
//                array[x] = array[min_x];
//                array[min_x] = temp;
//            }
//        }
// сорт. методом пузырька
//        for(int x = array.length-1; x > 0; x--){
//            for(int i = 0; i < x; i++){
//                if(array[i] > array[i+1]){
//                    int temp = array[i];
//                    array[i] = array[i+1];
//                    array[i+1] = temp;
//                }
//            }
//        }
        for(int a = 0 ; a < array.length; a++){
            for(int b = array.length-1; b > a; b--){
                if(array[b]<array[b-1]){
                    int temp = array[b];
                    array[b] = array[b-1];
                    array[b-1] = temp;
                }
            }
        }
    }
}
