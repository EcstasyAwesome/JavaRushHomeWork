package com.javarush.test.level16.lesson03.task03;

import java.util.ArrayList;
import java.util.List;

/* Список и нити
В методе main добавить в статический объект list 5 нитей SpecialThread - различных объектов.
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);


    public static void main(String[] args) {
        SpecialThread a = new SpecialThread();
        SpecialThread b = new SpecialThread();
        SpecialThread c = new SpecialThread();
        SpecialThread d = new SpecialThread();
        SpecialThread e = new SpecialThread();
        list.add(new Thread(a));
        list.add(new Thread(b));
        list.add(new Thread(c));
        list.add(new Thread(d));
        list.add(new Thread(e));
    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's run method inside SpecialThread");
        }
    }
}
