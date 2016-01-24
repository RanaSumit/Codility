package com.sumit;



public class FrogJump {


    int solution(int start, int dest, int distance)
    {

        int progress = start;
        int count=0;
        while(progress<dest) {
            progress=progress+distance;
            count++;
        }
        return count;
    }

}
