package com.javarush.test.level12.lesson04.task02;

/* print(int) и print(Integer)
Написать два метода: print(int) и print(Integer).
Написать такой код в методе main, чтобы вызвались они оба.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Solution sol = new Solution();
        Integer s = sol.print(1) + sol.print(2);
        System.out.println(s);
    }

    public int print(int x){
        return x+1;
    }
    public int print(Integer a){
        return a+2;
    }
}
