package com.javarush.test.level19.lesson10.home04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Ищем нужные строки
Считать с консоли имя файла.
Вывести в консоль все строки из файла, которые содержат всего 2 слова из списка words
Закрыть потоки. Не использовать try-with-resources

Пример: words содержит слова А, Б, В
Строки:
В Б А Д  //3 слова из words, не подходит
Д А Д    //1 слово из words, не подходит
Д А Б Д  //2 слова - подходит, выводим
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("a");
        words.add("b");
        words.add("c");
    }

    public static void main(String[] args) throws IOException
    {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String name = buffer.readLine();
        buffer.close();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(name));
        while (bufferedReader.ready()) {
            String temp = bufferedReader.readLine();
            int x = 0;
            for (String tmp : words) {
                if (temp.contains(tmp))x++;
            }
            if (x==2) System.out.println(temp);
            x = 0;
        }
        bufferedReader.close();
    }
}
