package com.javarush.test.level18.lesson10.home04;

/* Объединение файлов
Считать с консоли 2 имени файла
В начало первого файла записать содержимое второго файла так, чтобы получилось объединение файлов
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        String name1 = null;
        String name2 = null;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        name1 = bufferedReader.readLine();
        name2 = bufferedReader.readLine();
        bufferedReader.close();

        FileInputStream file1 = new FileInputStream(name1);
        FileInputStream file2 = new FileInputStream(name2);
        byte[] temp1 = new byte[file1.available()];
        file1.read(temp1);
        byte[] temp2 = new byte[file2.available()];
        file2.read(temp2);
        FileOutputStream outputStream = new FileOutputStream(name1);
        outputStream.write(temp2);
        FileOutputStream outputStream2 = new FileOutputStream(name1,true);
        outputStream2.write(temp1);
        outputStream.close();
        outputStream2.close();
        file1.close();
        file2.close();
    }
}
