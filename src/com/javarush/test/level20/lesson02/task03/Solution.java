package com.javarush.test.level20.lesson02.task03;

import java.io.*;
import java.util.*;

/* Знакомство с properties
В методе fillInPropertiesMap считайте имя файла с консоли и заполните карту properties данными из файла.
Про .properties почитать тут - http://ru.wikipedia.org/wiki/.properties
Реализуйте логику записи в файл и чтения из файла для карты properties.
*/
public class Solution {
    public static Map<String, String> properties = new HashMap<>();

    public void fillInPropertiesMap() throws IOException
    {
        //implement this method - реализуйте этот метод
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        String name = buff.readLine();
        buff.close();
        Properties prop = new Properties();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(name));
        prop.load(bufferedReader);
        for (Map.Entry<Object,Object> pr : prop.entrySet()){
            properties.put((String)pr.getKey(),(String)pr.getValue());
        }
        bufferedReader.close();
    }

    public void save(OutputStream outputStream) throws Exception {
        //implement this method - реализуйте этот метод
        PrintWriter printWriter = new PrintWriter(outputStream);
        for(Map.Entry<String,String> pr : properties.entrySet()){
            printWriter.println(pr.getKey() + "=" + pr.getValue());
        }
        printWriter.close();
    }

    public void load(InputStream inputStream) throws Exception {
        //implement this method - реализуйте этот метод
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        while (bufferedReader.ready()) {
            String[] tmp = bufferedReader.readLine().split("=");
            properties.put(tmp[0],tmp[1]);
        }
    }
}
