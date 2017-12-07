package com.javarush.test.level08.lesson08.task01;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* 20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
*/

public class Solution
{
    public static HashSet<String> createSet()
    {
        HashSet<String>list = new HashSet<>();
        Collections.addAll(list,"Л1","Л2","Л3","Л4","Л5","Л6","Л7","Л8","Л9","Л10","Л11","Л12","Л13","Л14","Л15","Л16","Л17","Л18","Л19","Л20");
        return list;
    }
}
