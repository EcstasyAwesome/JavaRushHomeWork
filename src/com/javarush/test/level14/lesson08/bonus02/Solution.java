package com.javarush.test.level14.lesson08.bonus02;

/* НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
*/

import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(NOD(a,b));
    }
    public static int NOD(int a, int b){
        int nod = 0;
        if (a == 0) nod = b;
        else if (b == 0) nod = a;
        else if (a == b) nod = a;
        else if (a == 1 || b == 1) nod = 1;
        else if (isEven(a) && isEven(b)) nod = 2 * NOD(a / 2, b / 2);
        else if (isEven(a) && !isEven(b)) nod = NOD(a / 2, b);
        else if (!isEven(a) && isEven(b)) nod = NOD(a, b / 2);
        else if (!isEven(a) && !isEven(b) && (b > a)) nod = NOD((b - a) / 2, a);
        else if (!isEven(a) && !isEven(b) && (b < a)) nod = NOD((a - b) / 2, b);
        return nod;
    }

    public static boolean isEven(int a)
    {
        return (a % 2 == 0);
    }
}
