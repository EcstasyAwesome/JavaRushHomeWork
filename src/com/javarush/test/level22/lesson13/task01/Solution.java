package com.javarush.test.level22.lesson13.task01;

import java.util.StringTokenizer;

/* StringTokenizer
Используя StringTokenizer разделить query на части по разделителю delimiter.
Пример,
getTokens("level22.lesson13.task01", ".") == {"level22", "lesson13", "task01"}
*/
public class Solution {
    public static String [] getTokens(String query, String delimiter) {
        StringTokenizer tokenizer = new StringTokenizer(query,delimiter);
        String[] mass = new String[tokenizer.countTokens()];
        int x = 0;
        while (tokenizer.hasMoreTokens()){
            mass[x]=tokenizer.nextToken();
            x++;
        }
        return mass;
    }
}