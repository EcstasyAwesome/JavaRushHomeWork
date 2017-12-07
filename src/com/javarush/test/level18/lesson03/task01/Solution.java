package com.javarush.test.level18.lesson03.task01;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* Максимальный байт
Ввести с консоли имя файла
Найти максимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String name = null;
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))){
            name = bufferedReader.readLine();
        }catch (Exception e){

        }
        FileInputStream file = new FileInputStream(name);
        int x = 0;
        int temp;
        while(file.available()>0){
            temp = file.read();
            if(temp > x) x = temp;
        }
        System.out.println(x);
        file.close();
    }
}
