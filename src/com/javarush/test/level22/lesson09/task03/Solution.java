package com.javarush.test.level22.lesson09.task03;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* Составить цепочку слов
В методе main считайте с консоли имя файла, который содержит слова, разделенные пробелом.
В методе getLine используя StringBuilder расставить все слова в таком порядке,
чтобы последняя буква данного слова совпадала с первой буквой следующего не учитывая регистр.
Каждое слово должно участвовать 1 раз.
Метод getLine должен возвращать любой вариант.
Слова разделять пробелом.
В файле не обязательно будет много слов.

Пример тела входного файла:
Киев Нью-Йорк Амстердам Вена Мельбурн

Результат:
Амстердам Мельбурн Нью-Йорк Киев Вена
*/
public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader = new BufferedReader(new FileReader(bufferedReader.readLine()));
        String[] mass = reader.readLine().split(" ");
        //...
        StringBuilder result = getLine(mass);
        System.out.println(result.toString());
    }

    public static StringBuilder getLine(String... words)
    {
        if (words.length == 0) return new StringBuilder();
        List<String> list = new ArrayList<>();
        Collections.addAll(list, words);
        Collections.shuffle(list);
        StringBuilder tmp = new StringBuilder();
        tmp.append(list.get(0));
        list.remove(0);
        while (list.size()>0){
            for (int i = 0; i < list.size(); i++) {
                String a = list.get(i).toUpperCase().toLowerCase();
                String b = tmp.toString().toUpperCase().toLowerCase();
                if (a.charAt(0) == b.charAt(tmp.length() - 1))
                { // в конец
                    tmp.append(" ").append(list.get(i));
                    list.remove(i);
                    continue;
                }

                if (b.charAt(0) == a.charAt(a.length() - 1))
                { //в начало
                    tmp.insert(0, " ");
                    tmp.insert(0, list.get(i));
                    list.remove(i);
                }
            }
        }
//            System.out.println();
//            for (String s:words){
//                System.out.print(" "+s);
//            }
            return tmp;
    }
}
