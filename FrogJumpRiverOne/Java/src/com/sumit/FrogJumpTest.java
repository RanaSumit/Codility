package com.sumit;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ranaf on 1/24/2016.
 */
public class FrogJumpTest {
    FrogJump frogjump = new FrogJump();
    @Test

    public void Test1() throws Exception
    {
        int[] arr = {1,1,3,1,2,2,1,2,4};
        int solution = frogjump.solution(arr, 6, 2);
        int answer = 8;
        System.out.println("Returned Value: " + solution);
        assertEquals(answer,solution);
    }
    @Test
    public void Test2() throws Exception
    {
        int[] arr = {1,4,4,3,8,2};
        int solution = frogjump.solution(arr, 7, 5);
        int answer = 1;
        System.out.println("Returned Value: " + solution);
        assertEquals(answer,solution);
    }


}