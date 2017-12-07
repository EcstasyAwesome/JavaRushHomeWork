package com.javarush.test.level12.lesson12.bonus03;

/* Задача по алгоритмам
Написать метод, который возвращает минимальное число в массиве и его позицию (индекс).
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair<Integer, Integer> result = getMinimumAndIndex(data);

        System.out.println("Minimum is " + result.x);
        System.out.println("Index of minimum element is " + result.y);
    }

    public static Pair<Integer, Integer> getMinimumAndIndex(int[] array)
    {
        if (array == null || array.length == 0)
        {
            return new Pair<Integer, Integer>(0, 0);
        }
        int[] mass = new int[array.length];
        System.arraycopy(array, 0, mass, 0, array.length);
        int a=0;
        for(int x = mass.length-1; x > 0;x--){
            for(int y = 0; y < x;y++){
                if(mass[y]>mass[y+1]){
                    int tmp = mass[y];
                    mass[y] = mass[y+1];
                    mass[y+1] = tmp;
                }
            }
        }
        for(int x=0;x<mass.length;x++){
            if(mass[0]==array[x])a=x;
        }

        return new Pair<Integer, Integer>(mass[0],a);
    }


    public static class Pair<X, Y>
    {
        public X x;
        public Y y;

        public Pair(X x, Y y)
        {
            this.x = x;
            this.y = y;
        }
    }
}
