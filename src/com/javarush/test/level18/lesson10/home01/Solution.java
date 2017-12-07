package com.javarush.test.level18.lesson10.home01;

/* Английские буквы
В метод main первым параметром приходит имя файла.
Посчитать количество букв английского алфавита, которое есть в этом файле.
Вывести на экран число (количество букв)
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.FileReader;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        FileReader file = new FileReader(args[0]);
        int temp;
        int result=0;
        while ((temp = file.read())!=-1){
            for(int x =97;x < 123;x++){
                if(temp==x)result++;
            }
        }
        System.out.println(result);
        file.close();
    }
}
