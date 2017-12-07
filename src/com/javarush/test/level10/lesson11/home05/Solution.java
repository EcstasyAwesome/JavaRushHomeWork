package com.javarush.test.level10.lesson11.home05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Количество букв
Ввести с клавиатуры 10 строчек и подсчитать в них количество различных букв (для 33 букв алфавита).  Вывести результат на экран.
Пример вывода:
а 5
б 8
в 3
г 7
д 0
…
я 9
*/

public class Solution
{
    public static void main(String[] args)  throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++)
        {
            alphabet.add(abcArray[i]);
        }

        //ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++)
        {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }
        StringBuilder s = new StringBuilder();
        for(int x = 0; x < list.size(); x++){
            s.append(list.get(x));
        }

        for (int a = 0; a < alphabet.size(); a++)
        {
            String e = alphabet.get(a).toString();
            int count = 0;
            int x = 1;
                for (int i = 0; i < s.length(); i++)
                {
                    if (s.substring(i,i+1).equals(e))count++;
                }

            System.out.println(alphabet.get(a) + " " + count);
        }
    }

}
