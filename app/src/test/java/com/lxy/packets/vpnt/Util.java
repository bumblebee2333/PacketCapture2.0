package com.lxy.packets.vpnt;

public class Util {

    public static void pln(int[] array) {
        for (int i=0;i<array.length;i++)
        {
            p(String.format("%-10d",array[i]));
        }
        pln("");
    }

    public static void p(Object o) {
        System.out.print(o);
    }

    public static void pln(Object o)
    {
        System.out.println(o);
    }
}
