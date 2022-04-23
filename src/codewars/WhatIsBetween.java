package codewars;

import java.util.Arrays;

public class WhatIsBetween {

    //https://www.codewars.com/kata/55ecd718f46fba02e5000029

    public static int[] between(int a, int b) {
        int[] arr = new int[b - a + 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = a;
            a++;
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(between(-2, 2)));

    }
}
