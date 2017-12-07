package com.javarush.test.level18.lesson05.task02;

/* Подсчет запятых
С консоли считать имя файла
Посчитать в файле количество символов ',', количество вывести на консоль
Закрыть потоки. Не использовать try-with-resources

Подсказка: нужно сравнивать с ascii-кодом символа ','
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        String name = null;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        name = bufferedReader.readLine();
        FileReader fileReader = new FileReader(name);
        int chars;
        int answer=0;
        while ((chars = fileReader.read())!=-1){
            if(chars==44) answer++;
        }
        System.out.println(answer);
        bufferedReader.close();
        fileReader.close();
    }
}
