package com.day02;

public class ForLoop2 {
    public static void main(String[] args){
        int number = 8;
		boolean isPrime = true;
		for(int i = 2; i < number/2; i++)
		{
			if(number % i == 0)
			{
				isPrime = false;
			}
		}
		if(isPrime == true)
		{
System.out.println("The number is a prime number");
		}
		else
		{
System.out.println("The number is not a prime number");
		}
		

    }
}
