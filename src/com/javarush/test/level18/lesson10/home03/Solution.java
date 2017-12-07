package com.javarush.test.level18.lesson10.home03;

/* Два в одном
Считать с консоли 3 имени файла
Записать в первый файл содержимого второго файла, а потом дописать в первый файл содержимое третьего файла
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        String name1 = null;
        String name2 = null;
        String name3 = null;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        name1 = bufferedReader.readLine();
        name2 = bufferedReader.readLine();
        name3 = bufferedReader.readLine();
        FileInputStream fileInputStream1 = new FileInputStream(name2);
        FileInputStream fileInputStream2 = new FileInputStream(name3);
        FileOutputStream fileOutputStream = new FileOutputStream(name1);
        byte[] temp1 = new byte[fileInputStream1.available()];
        byte[] temp2 = new byte[fileInputStream1.available()];
        if (fileInputStream1.available()>0){
            fileInputStream1.read(temp1);
            fileOutputStream.write(temp1,0,temp1.length);
        }
        if (fileInputStream2.available()>0){
            fileInputStream2.read(temp2);
            fileOutputStream.write(temp2,0,temp2.length);
        }
        bufferedReader.close();
        fileInputStream1.close();
        fileInputStream2.close();
        fileOutputStream.close();
    }
}
