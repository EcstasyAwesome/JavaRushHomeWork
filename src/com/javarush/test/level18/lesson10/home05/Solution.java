package com.javarush.test.level18.lesson10.home05;

/* Округление чисел
Считать с консоли 2 имени файла
Первый файл содержит вещественные(дробные) числа, разделенные пробелом. Например, 3.1415
Округлить числа до целых и записать через пробел во второй файл
Закрыть потоки. Не использовать try-with-resources
Принцип округления:
3.49 - 3
3.50 - 4
3.51 - 4
-3.49 - -3
-3.50 - -3
-3.51 - -4
*/

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = bufferedReader.readLine();
        String name2 = bufferedReader.readLine();
        bufferedReader.close();
        Scanner scanner = new Scanner(new FileReader(name1)).useLocale(Locale.ENGLISH);
        StringBuilder temp = new StringBuilder();
        while (scanner.hasNext()){
            double d = scanner.nextDouble();
            int number = (int) Math.round(d);
            temp.append(number + " ");
        }
        scanner.close();
        FileOutputStream file2 = new FileOutputStream(name2);
        file2.write(temp.substring(0,temp.length()-1).getBytes());
        file2.close();
    }
}
