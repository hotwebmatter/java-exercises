package org.launchcode.java.hackerrank;

import java.util.Scanner;

/**
 * Created by modus on 3/1/17.
 * HackerRank Algorithm Challenges
 */
public class ArraySum {

    static int arraySum(int length, int[] array) {
        int result = 0;
        for (int i = 0; i < length; i++) {
            result += array[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len;
        len = in.nextInt();
        int[] arr;
        arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = in.nextInt();
        }
        int sum;
        sum = arraySum(len, arr);
        System.out.println(sum);
    }
}
