package com.javarush.test.level18.lesson05.task03;

/* Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать бОльшую часть.
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
        FileInputStream file1 = new FileInputStream(name1);
        FileOutputStream file2 = new FileOutputStream(name2);
        FileOutputStream file3 = new FileOutputStream(name3);
        byte[] buffer = new byte[file1.available()];
        int temp = file1.read(buffer);
        if(temp%2==0){
            file2.write(buffer,0,temp/2);
            file3.write(buffer,temp/2,temp/2);
        }
        else{
            file2.write(buffer,0,(temp/2)+1);
            file3.write(buffer,(temp/2)+1,(temp/2));
        }
        bufferedReader.close();
        file1.close();
        file2.close();
        file3.close();
    }
}
