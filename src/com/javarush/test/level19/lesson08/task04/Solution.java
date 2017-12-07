package com.javarush.test.level19.lesson08.task04;

/* Решаем пример
В методе main подмените объект System.out написанной вами ридер-оберткой по аналогии с лекцией
Ваша ридер-обертка должна выводить на консоль решенный пример
Вызовите готовый метод printSomething(), воспользуйтесь testString
Верните переменной System.out первоначальный поток

Возможные операции: + - *
Шаблон входных данных и вывода: a [знак] b = c
Отрицательных и дробных чисел, унарных операторов - нет.

Пример вывода:
3 + 6 = 9
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream orig = System.out;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArrayOutputStream);
        System.setOut(printStream);
        testString.printSomething();
        System.setOut(orig);
        String[] temp = byteArrayOutputStream.toString().split(" ");
        StringBuilder sb = new StringBuilder();
        sb.append(temp[0] + " " + temp[1] + " " + temp[2] + " " + temp[3] + " ");
        int a = Integer.parseInt(temp[0]);
        int b = Integer.parseInt(temp[2]);
        if (temp[1].equals("+"))sb.append(a + b);
        else if (temp[1].equals("-"))sb.append(a - b);
        else if (temp[1].equals("*"))sb.append(a * b);
        System.out.println(sb);

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

