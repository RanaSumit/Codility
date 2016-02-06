package com.sumit;

import java.util.Scanner;

public class Main {


    public static int[] solution(int N , int[] A)
    {

        int[] counters = new int[N];
        int max = 0;
        int absMax = 0;

        for (int i=0; i<A.length; i++) {
            if (A[i] == N+1) {
                if ((i < A.length-1 && A[i+1] != N+1) || (i==A.length-1)) {
                    absMax += max;
                    max = 0;
                    counters = new int[N];
                }
            } else {
                counters[A[i]-1]++;
                if (max < counters[A[i]-1])
                    max = counters[A[i]-1];
            }
        }

        for (int i=0; i<counters.length; i++)
            counters[i] += absMax;

        return counters;
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
        int[] result = solution(n, arr);

        System.out.println("Result: ");

        for(int i = 0; i < result.length; i++)
        {
            System.out.print(" " + result[i]);
        }
    }
}
