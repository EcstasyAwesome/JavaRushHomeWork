package com.javarush.test.level18.lesson10.bonus01;

/* Шифровка
Придумать механизм шифровки/дешифровки

Программа запускается с одним из следующих наборов параметров:
-e fileName fileOutputName
-d fileName fileOutputName
где
fileName - имя файла, который необходимо зашифровать/расшифровать
fileOutputName - имя файла, куда необходимо записать результат шифрования/дешифрования
-e - ключ указывает, что необходимо зашифровать данные
-d - ключ указывает, что необходимо расшифровать данные
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        FileInputStream in = new FileInputStream(args[1]);
        FileOutputStream out = new FileOutputStream(args[2]);
        if (args[0].equals("-e")) new Solution().shifrovka(in,out);
        else if (args[0].equals("-d")) new Solution().deshifrovka(in,out);
        in.close();
        out.close();
    }
    private void shifrovka(FileInputStream in, FileOutputStream out) throws IOException{
        while (in.available()>0) {
            out.write(in.read()+1);
        }
    }

    private void deshifrovka(FileInputStream in, FileOutputStream out) throws IOException{
        while (in.available()>0) {
            out.write(in.read()-1);
        }
    }
}
