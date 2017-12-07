package com.javarush.test.level08.lesson06.task02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* Провести 10 тысяч вставок, удалений
Для arrayList и linkedList провести 10 тысяч вставок, удалений, а также вызовов get и set.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        // ArrayList
        ArrayList arrayList = new ArrayList();
        insert10000(arrayList);
        get10000(arrayList);
        set10000(arrayList);
        remove10000(arrayList);

        // LinkedList
        LinkedList linkedList = new LinkedList();
        insert10000(linkedList);
        get10000(linkedList);
        set10000(linkedList);
        remove10000(linkedList);
    }

    public static void insert10000(List list)
    {
        for(int x = 0; x<10000; x++){
            list.add(x);
        }

    }

    public static void get10000(List list)
    {
        for(int x = 0; x<10000; x++){
           list.get(x);
        }

    }

    public static void set10000(List list)
    {
        for(int x = 0; x<10000; x++){
            String s = null;
            list.set(x,s);
        }

    }

    public static void remove10000(List list)
    {
        for(int x = 0; x<10000; x++){
            list.remove(0);
        }

    }
}