package com.day02;

public class BreakContinue {
    public static void main(String[] args){
        for(int i=1; i<=10; i++)
        {
            if(i == 1)
            {
                continue;   // break;
            }
            System.out.println(i);
        }

    }
}
