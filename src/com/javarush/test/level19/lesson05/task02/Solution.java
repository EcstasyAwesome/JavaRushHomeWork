package com.javarush.test.level19.lesson05.task02;

/* Считаем слово
Считать с консоли имя файла.
Файл содержит слова, разделенные знаками препинания.
Вывести в консоль количество слов "world", которые встречаются в файле.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        reader.close();
        BufferedReader buffer = new BufferedReader(new FileReader(name));
        String[] temp = null;
        int count = 0;
        while (buffer.ready()) {
            temp = buffer.readLine().split("[., !?;:-]");
            for (String tmp:temp) {
                if (tmp.toLowerCase().equals("world"))count++;
            }
        }
        buffer.close();
        System.out.println(count);
    }
}
