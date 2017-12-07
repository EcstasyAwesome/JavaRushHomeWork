package com.javarush.test.level18.lesson10.bonus03;

/* Прайсы 2
CrUD для таблицы внутри файла
Считать с консоли имя файла для операций CrUD
Программа запускается с одним из следующих наборов параметров:
-u id productName price quantity
-d id
Значения параметров:
где id - 8 символов
productName - название товара, 30 chars (60 bytes)
price - цена, 8 символов
quantity - количество, 4 символа
-u  - обновляет данные товара с заданным id
-d  - производит физическое удаление товара с заданным id (все данные, которые относятся к переданному id)

В файле данные хранятся в следующей последовательности (без разделяющих пробелов):
id productName price quantity
Данные дополнены пробелами до их длины

Пример:
19846   Шорты пляжные синие           159.00  12
198478  Шорты пляжные черные с рисунко173.00  17
19847983Куртка для сноубордистов, разм10173.991234
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        BufferedReader fileReader = new BufferedReader(new FileReader(name));
        reader.close();
        String temp = null;
        int id;
        StringBuilder msg = new StringBuilder();
        if (args[0].equals("-d")) {
            List<String>list = new ArrayList<>();
            while (fileReader.ready()){
                list.add(fileReader.readLine());
            }
            for(int x = 0;x < list.size();x++){
                if (list.get(x).substring(0,8).replace(" ","").equals(args[1])){
                    list.remove(x);
                }
            }
            FileOutputStream outputStream = new FileOutputStream(name);
            for(String a:list){
                outputStream.write(a.getBytes());
                outputStream.write("\r\n".getBytes());
            }
            outputStream.close();
        }

        if (args[0].equals("-u")) {
            List<String>list = new ArrayList<>();
            while (fileReader.ready()){
                list.add(fileReader.readLine());
            }
            msg.append(args[1] + space(args[1], 8)).substring(0, 8);
            msg.append(args[2] + space(args[2], 30)).substring(0, 30);
            msg.append(args[3] + space(args[3], 8)).substring(0, 8);
            msg.append(args[4] + space(args[4], 4)).substring(0, 4);

            for(int x = 0;x < list.size();x++){
                if (list.get(x).substring(0,8).replace(" ","").equals(args[1])){
                    list.set(x,msg.toString());
                }
            }
            FileOutputStream outputStream = new FileOutputStream(name);
            for(String a:list){
                outputStream.write(a.getBytes());
                outputStream.write("\r\n".getBytes());
            }
            outputStream.close();
        }
            fileReader.close();
            FileOutputStream file = new FileOutputStream(name, true);
            file.write(msg.toString().getBytes());
            file.close();
    }

    private static String space (String str,Integer numb){
        String temp = "";
        if (str.length()!=numb){
            for (int x = 0; x < (numb - str.length());x++){
                temp += " ";
            }
            return temp;
        }
        return temp;
    }
}
