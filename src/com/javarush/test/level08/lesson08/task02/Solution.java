package com.javarush.test.level08.lesson08.task02;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution
{
    public static HashSet<Integer> createSet()
    {
        HashSet<Integer> list = new HashSet<>();
        Collections.addAll(list,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
        return list;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set)
    {
        Iterator<Integer>iterator=set.iterator();
        while(iterator.hasNext()){
            int i = iterator.next();
            if (i>10)iterator.remove();
        }
        return set;
    }
}
