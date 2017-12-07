package com.javarush.test.level19.lesson05.task04;

/* Замена знаков
Считать с консоли 2 имени файла.
Первый Файл содержит текст.
Заменить все точки "." на знак "!", вывести во второй файл.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = bufferedReader.readLine();
        String name2 = bufferedReader.readLine();
        bufferedReader.close();
        FileInputStream inputStream = new FileInputStream(name1);
        FileOutputStream outputStream = new FileOutputStream(name2);
        while (inputStream.available()>0) {
            int x = inputStream.read();
            if (x == 46) outputStream.write(33);
            else outputStream.write(x);
        }
        inputStream.close();
        outputStream.close();
    }
}
