package com.javarush.test.level18.lesson05.task04;

/* Реверс файла
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке
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
        FileInputStream file1 = new FileInputStream(name1);
        FileOutputStream file2 = new FileOutputStream(name2);
        byte[] mass = new byte[file1.available()];
        if(file1.available() > 0){
            file1.read(mass);
        }
        for (int i = 0; i < mass.length / 2; i++) {
            byte tmp = mass[i];
            mass[i] = mass[mass.length - i - 1];
            mass[mass.length - i - 1] = tmp;
        }
        file2.write(mass);
        bufferedReader.close();
        file1.close();
        file2.close();
    }
}
