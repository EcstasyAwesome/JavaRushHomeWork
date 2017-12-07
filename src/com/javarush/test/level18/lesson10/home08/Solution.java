package com.javarush.test.level18.lesson10.home08;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* Нити и байты
Читайте с консоли имена файлов, пока не будет введено слово "exit"
Передайте имя файла в нить ReadThread
Нить ReadThread должна найти байт, который встречается в файле максимальное число раз, и добавить его в словарь resultMap,
где параметр String - это имя файла, параметр Integer - это искомый байт.
Закрыть потоки. Не использовать try-with-resources*/


public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String FileName = null;
        while (true) {
            FileName = reader.readLine();
            if (FileName.equals("exit"))break;
            new ReadThread(FileName).start();
        }
        reader.close();
    }

    public static class ReadThread extends Thread {
        public ReadThread(String fileName) throws FileNotFoundException
        {
            //implement constructor body
            this.File = fileName;
        }
        // implement file reading here - реализуйте чтение из файла тут
        private String File;
        public void run(){
            Map<String,Integer> map = new HashMap<>();
            int x;
            try {
                FileReader fileReader = new FileReader(File);
                while ((x = fileReader.read()) != -1)
                {
                    if (!map.containsKey(String.valueOf(x))) map.put(String.valueOf(x), 1);
                    else map.put(String.valueOf(x), map.get(String.valueOf(x)) + 1);
                }
                fileReader.close();
            int y = 0;
            String a = null;
            for(Map.Entry<String,Integer> mapa:map.entrySet()){
                if (y<mapa.getValue()){
                    a = mapa.getKey();
                    y = mapa.getValue();
                }
            }
            resultMap.put(File,Integer.parseInt(a));
//            for(Map.Entry<String,Integer> mapa:resultMap.entrySet()){
//               System.out.println(mapa.getKey() + " " + mapa.getValue());
//            }
            }catch (IOException e){
            }
        }
    }
}
