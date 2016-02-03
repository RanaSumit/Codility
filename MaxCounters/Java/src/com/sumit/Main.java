package com.sumit;

import java.util.Scanner;

public class Main {


    public static int[] solution(int[] arr, int n)
    {

        int[] result = new int[arr.length];


        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[arr.length - 1 -i];
        }
        int currentMax = 0;
        int lastIncrease = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] > n)
            {
                lastIncrease = currentMax;
            }
            else
            {
                result[arr[i] - 1] = Math.max(result[arr[i] - 1], lastIncrease);
                result[arr[i] - 1]++;
                currentMax = Math.max(currentMax, result[arr[i] - 1]);
            }

        }
        for(int i = 0; i < n; i++)
        {
            result[i] = Math.max(result[i], lastIncrease);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int length = scan.nextInt();
        int[] arr = new int[length];
        for(int i = 0; i < length; i++)
        {
            arr[i] = scan.nextInt();
        }
        int[] result = solution(arr, n);

        System.out.println("Result: ");

        for(int i = 0; i < result.length; i++)
        {
            System.out.print(" " + result[i]);
        }
    }
}
