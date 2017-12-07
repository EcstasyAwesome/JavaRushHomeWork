package com.javarush.test.level18.lesson10.home02;

/* Пробелы
В метод main первым параметром приходит имя файла.
Вывести на экран соотношение количества пробелов к количеству всех символов. Например, 10.45
1. Посчитать количество всех символов.
2. Посчитать количество пробелов.
3. Вывести на экран п2/п1*100, округлив до 2 знаков после запятой
4. Закрыть потоки. Не использовать try-with-resources
*/

import java.io.FileReader;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        FileReader file = new FileReader(args[0]);
        int temp;
        int result = 0;
        int space = 0;
        while ((temp = file.read())!=-1){
            result++;
            if(temp==32)space++;
        }
        System.out.println(String.format("%.2f",(double)space/result*100));
        file.close();
    }
}
