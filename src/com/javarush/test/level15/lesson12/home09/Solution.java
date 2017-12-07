package com.javarush.test.level15.lesson12.home09;
/* Парсер реквестов
Считать с консоли URl ссылку.
Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Если присутствует параметр obj, то передать его значение в нужный метод alert.
alert(double value) - для чисел (дробные числа разделяются точкой)
alert(String value) - для строк
Пример 1
Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
Вывод:
lvl view name
Пример 2
Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
Вывод:
obj name
double 3.14
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input = bufferedReader.readLine();
        input = input.substring(input.indexOf('?')+1);
        String[] msg = input.split("&");
        String first = "";
        for(String a:msg){
            if (!a.contains("obj=")){
                if(a.contains("=")) first += (a.substring(0,a.indexOf('=')) + " ");
                else first += a + " ";
            } else {
                if(a.contains("obj=") && a.contains(".")) first += a.substring(a.indexOf('?')+1,a.lastIndexOf('=')) + " ";
                else if (a.contains("obj=") && !a.contains(".")) first += a.substring(a.indexOf('?')+1,a.lastIndexOf('=')) + " ";
            }
        }
        System.out.println(first.substring(0,first.lastIndexOf(' ')));
        for (String a : msg) {
            try {
                if (a.length()>3 && a.substring(0,4).equals("obj=")){
                    if(!a.substring(a.indexOf('=')).matches("^\\D*$")) alert(Double.parseDouble(a.substring(a.indexOf('=') + 1)));
                    else alert(a.substring(a.indexOf('=') + 1));
                }
            }
            catch (Exception e)
            {
                alert(a.substring(a.indexOf('=') + 1));
            }
        }
        bufferedReader.close();
    }
    public static void alert(double value) {
        System.out.println("double " + value);
    }
    public static void alert(String value) {
        System.out.println("String " + value);
    }
}