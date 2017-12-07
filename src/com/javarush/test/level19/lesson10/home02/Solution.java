package com.javarush.test.level19.lesson10.home02;

/* Самый богатый
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя значение
где [имя] - String, [значение] - double. [имя] и [значение] разделены пробелом

Для каждого имени посчитать сумму всех его значений
Вывести в консоль имена, у которых максимальная сумма
Имена разделять пробелом либо выводить с новой строки
Закрыть потоки. Не использовать try-with-resources

Пример входного файла:
Петров 0.501
Иванов 1.35
Петров 0.85

Пример вывода:
Петров
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader file = new BufferedReader(new FileReader(args[0]));
        Map<String,Double> map = new TreeMap<>();
        while (file.ready()) {
            String[] temp = file.readLine().split(" ");
            if (map.containsKey(temp[0]))map.put(temp[0],map.get(temp[0]) + Double.parseDouble(temp[1]));
            else map.put(temp[0],Double.parseDouble(temp[1]));
        }
        file.close();
        double max = Double.MIN_VALUE;
        String lName = null;
        for (Map.Entry<String,Double> temp:map.entrySet()) {
            if (temp.getValue()>max){
                max = temp.getValue();
                lName = temp.getKey();
            }
        }
        System.out.println(lName);
    }
}
