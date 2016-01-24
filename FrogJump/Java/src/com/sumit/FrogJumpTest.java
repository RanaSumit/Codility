package com.sumit;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ranaf on 1/23/2016.
 */
public class FrogJumpTest {
    FrogJump jump = new FrogJump();
    @Test
    public void Test1() throws Exception {
        int solution = jump.solution(10, 130, 30);
        int answer = 4;
        System.out.println(" Returned Value: " + solution);
        assertEquals(solution, answer);
    }
}