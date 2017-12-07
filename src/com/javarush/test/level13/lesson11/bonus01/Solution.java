package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.*;
import java.util.*;


public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        File file = new File(reader.readLine());
        Scanner scanner = new Scanner(file);
        List<Integer> list = new ArrayList<Integer>();
        while(scanner.hasNext()){
            list.add(scanner.nextInt());
        }
        Collections.sort(list);
        for(int x:list){
            if(x%2==0) System.out.println(x);
        }
    }
}
