package com.javarush.test.level18.lesson10.bonus02;

/* Прайсы
CrUD для таблицы внутри файла
Считать с консоли имя файла для операций CrUD
Программа запускается со следующим набором параметров:
-c productName price quantity
Значения параметров:
где id - 8 символов
productName - название товара, 30 chars (60 bytes)
price - цена, 8 символов
quantity - количество, 4 символа
-c  - добавляет товар с заданными параметрами в конец файла, генерирует id самостоятельно, инкрементируя максимальный id, найденный в файле

В файле данные хранятся в следующей последовательности (без разделяющих пробелов):
id productName price quantity
Данные дополнены пробелами до их длины

Пример:
19846   Шорты пляжные синие           159.00  12
198478  Шорты пляжные черные с рисунко173.00  17
19847983Куртка для сноубордистов, разм10173.991234
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        BufferedReader fileReader = new BufferedReader(new FileReader(name));
        reader.close();
        String temp = null;
        int id;
        StringBuilder msg = new StringBuilder();
        if(fileReader.ready())
        {
            while (fileReader.ready())
            {
                temp = fileReader.readLine();
            }
            fileReader.close();
            id = Integer.parseInt(temp.substring(0, 8).replace(" ", ""));
            msg.append("\r\n" + (id + 1) + space(String.valueOf(id),8)).substring(0,8);
            msg.append(args[1] + space(args[1],30)).substring(0,30);
            msg.append(args[2] + space(args[2],8)).substring(0,8);
            msg.append(args[3] + space(args[3],4)).substring(0,4);

        }
        else {
            msg.append("1       ");
            msg.append(args[1] + space(args[1],30)).substring(0,30);
            msg.append(args[2] + space(args[2],8)).substring(0,8);
            msg.append(args[3] + space(args[3],4)).substring(0,4);
        }
        FileOutputStream file = new FileOutputStream(name,true);
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
