package com.javarush.test.level19.lesson10.home03;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* Хуан Хуанович
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя день месяц год
где [имя] - может состоять из нескольких слов, разделенных пробелами, и имеет тип String
[день] - int, [месяц] - int, [год] - int
данные разделены пробелами

Заполнить список PEOPLE импользуя данные из файла
Закрыть потоки. Не использовать try-with-resources

Пример входного файла:
Иванов Иван Иванович 31 12 1987
Вася 15 5 2013
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException, ParseException
    {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MM yyyy", Locale.ENGLISH);
        String name = "";
        String birthDay = "";

        while (reader.ready()){
            String[] sMass = reader.readLine().split(" ");
            for (int i = 0; i < sMass.length; i++) {
                birthDay = sMass[sMass.length-3] + " " + sMass[sMass.length-2] + " " + sMass[sMass.length-1];
                if (sMass.length == 4){
                    name = sMass[0];
                } else if (sMass.length == 5){
                    name = sMass[0] + " " + sMass[1];
                } else if (sMass.length == 6){
                    name = sMass[0] + " " + sMass[1] + " " + sMass[2];
                }
            }

            PEOPLE.add(new Person(name, simpleDateFormat.parse(birthDay)));
        }
        reader.close();
        for (Person person : PEOPLE) {
            System.out.println(person.getName() + " " + person.getBirthday());
        }
    }

}
