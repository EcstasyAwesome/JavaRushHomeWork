package com.javarush.test.level19.lesson05.task03;

/* Выделяем числа
Считать с консоли 2 имени файла.
Вывести во второй файл все числа, которые есть в первом файле.
Числа выводить через пробел.
Закрыть потоки. Не использовать try-with-resources

Пример тела файла:
12 text var2 14 8v 1

Результат:
12 14 1
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = bufferedReader.readLine();
        String name2 = bufferedReader.readLine();
        bufferedReader.close();
        BufferedReader buffer = new BufferedReader(new FileReader(name1));
        String[] mass = null;
        StringBuilder sb = new StringBuilder();
        while (buffer.ready()) {
            mass = buffer.readLine().split(" ");
                for(String temp : mass)
                {
                    if (temp.matches("^-?\\d+$"))
                    {
                        sb.append(" " + temp);
                    }
                }
        }
        buffer.close();
        FileOutputStream outputStream = new FileOutputStream(name2);
        outputStream.write(sb.substring(1).getBytes());
        outputStream.close();
    }
}
