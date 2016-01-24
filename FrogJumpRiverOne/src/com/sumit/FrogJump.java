package com.sumit;

public class FrogJump {

    int solution(int A[], int X, int D)
    {
        int steps = 0;
        for(int i = 0; i < A.length; i++)
        {
            if(A[i] + D >= X)
            {
                steps = steps + i;
                return steps;
            }
        }
        if(steps == 0)
        {
            return -1;
        }
        return 0;
    }
}
