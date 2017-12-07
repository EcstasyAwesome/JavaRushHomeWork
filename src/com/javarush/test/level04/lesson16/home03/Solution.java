package com.javarush.test.level04.lesson16.home03;

import java.io.*;
import java.util.Scanner;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        Scanner scanner = new Scanner(System.in);
        int x=0;
        while(true){
            int a = scanner.nextInt();
            //int b = scanner.nextInt();
            x=x+a;
            if(a == -1) break;
        }
        System.out.println(x);
    }
}
