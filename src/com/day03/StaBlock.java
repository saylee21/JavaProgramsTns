package com.day03;

public class StaBlock {
    static{
        System.out.println("static block in invoked");
    }

    static int CalculateCube(int side){
        return(side*side*side);
    }

    public static void main(String[] args) {
        System.out.println(" cube value of 5 is :" + StaBlock.CalculateCube(5));
        
    } 
}
