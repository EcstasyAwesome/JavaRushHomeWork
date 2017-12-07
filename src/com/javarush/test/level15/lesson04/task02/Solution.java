package com.javarush.test.level15.lesson04.task02;

/* ООП - Перегрузка
Перегрузите метод printMatrix 8 различными способами. В итоге должно получиться 10 различных методов printMatrix.
*/

public class Solution {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
            printMatrix(1,(byte)2,"2");
        }
    }

    public static void printMatrix(int m, byte n, String v){
        //System.out.println(m + n + v);
        printMatrix(1,1,'c');
    }
    public static void printMatrix(int m, int n, char a){
        //System.out.println(m + n + a);
        printMatrix(1,1,2f);
    }
    public static void printMatrix(int m, int n,float a){
        //System.out.println(m + n + a);
        printMatrix(1,2);
    }
    public static void printMatrix(int m, int n){
        //System.out.println(m + n);
        printMatrix(1,2,new Solution(),"шото");
    }
    public static void printMatrix(int m, int n, Object o,String v){
        //System.out.println(m + n + (String)o + v);
        printMatrix(1,2,3,'c');
    }
    public static void printMatrix(int m, int n, int x, char f){
        //System.out.println(m + n + x + f);
        printMatrix(1,2,(byte)2);
    }
    public static void printMatrix(int m, int n, byte a){
        //System.out.println(m + n + a);
        printMatrix(1,2,(short)20);
    }
    public static void printMatrix(int m, int n, short a){
        System.out.println(m + n + a);
    }
}
