package com.javarush.test.level19.lesson05.task01;

/* Четные байты
Считать с консоли 2 имени файла.
Вывести во второй файл все байты с четным индексом.
Пример: второй байт, четвертый байт, шестой байт и т.д.
Закрыть потоки ввода-вывода.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = bufferedReader.readLine();
        String name2 = bufferedReader.readLine();
        bufferedReader.close();
        int x = 1;
        FileInputStream inputStream = new FileInputStream(name1);
        FileOutputStream outputStream = new FileOutputStream(name2);
        while (inputStream.available()>0) {
            int temp = inputStream.read();
            if (x%2==0){
                outputStream.write(temp);
            }
            x++;
        }
        inputStream.close();
        outputStream.close();
    }
}
