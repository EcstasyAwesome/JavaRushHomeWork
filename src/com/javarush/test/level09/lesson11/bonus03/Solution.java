package com.javarush.test.level09.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Задача по алгоритмам
Задача: Пользователь вводит с клавиатуры список слов (и чисел). Слова вывести в возрастающем порядке, числа - в убывающем.
Пример ввода:
Вишня
1
Боб
3
Яблоко
2
0
Арбуз
Пример вывода:
Арбуз
3
Боб
2
Вишня
1
0
Яблоко
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true)
        {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array)
        {
            System.out.println(x);
        }
    }

    public static void sort(String[] array)
    {
        for (int i = 0; i < array.length; i++) {
            outer: for (int j = 0; j < array.length - 1;j++ ) {
                if(isNumber(array[j])) {
                    int k = j+1;
                    while (!isNumber(array[k])) {
                        k++;
                        if (k >= array.length-1) {
                            continue outer ;
                        }
                    }
                    if (Integer.parseInt(array[k]) > Integer.parseInt(array[j])) {
                        String temp = array[j];
                        array[j] = array[k];
                        array[k] = temp;
                    }
                } else {
                    int k = j+1;
                    while (isNumber(array[k])) {
                        k++;
                        if (k >= array.length-1) {
                            continue outer ;
                        }
                    }
                    if (isGreaterThan(array[j], array[k])) {
                        String temp = array[j];
                        array[j] = array[k];
                        array[k] = temp;
                    }
                }
            }
        }
//        for(int x = 0; x<array.length;x++){
//            for(int y = array.length-1;y>0; y--){
//                String s = array[y];
//                String a = array[y-1];
//                if(isGreaterThan(array[y],array[y-1]))array[y]=s;
//                else {
//                    array[y]=a;
//                    array[y-1]=s;
//                }
//            }
//        }
    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b)
    {
        return a.compareTo(b) > 0;
    }


    //строка - это на самом деле число?
    public static boolean isNumber(String s)
    {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++)
        {
            char c = chars[i];
            if ((i != 0 && c == '-') //есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-') ) // не цифра и не начинается с '-'
            {
                return false;
            }
        }
        return true;
    }
}
